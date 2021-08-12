/**
 * 
 */
package com.BeBear.config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.clouddirectory.model.DeleteObjectRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;

/**
 * @author bn
 *
 */
@Service
public class AmazonClient {
	
	private AmazonS3 s3client;

    private String endpointUrl = "https://bucketbebear.s3.ap-southeast-1.amazonaws.com";
    
    private String bucketName = "bucketbebear";
    
    private String accessKey = "AKIAZ5WTNU3HH452ODH4";
    
    private String secretKey = "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";
    
    @PostConstruct
    private void initializeAmazon() {
       AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
       this.s3client = new AmazonS3Client(credentials);
    }
    
    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
    
    private String generateFileName(MultipartFile multiPart) {
        return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
    }
    
    private void uploadFileTos3bucket(String fileName, File file) {
        s3client.putObject(new PutObjectRequest(bucketName, fileName, file)
                .withCannedAcl(CannedAccessControlList.PublicRead));
    }
    
    public String uploadFile(MultipartFile multipartFile) {
    	Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fileUrl = "";
        try {
            File file = convertMultiPartToFile(multipartFile);
            String fileName = generateFileName(multipartFile);
            String strDate = sdf.format(date);
            fileUrl = endpointUrl + "/" + strDate + "/" + fileName;
            uploadFileTos3bucket(strDate + "/" + fileName, file);
            file.delete();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return fileUrl;
    }
    
    public void deleteFile(String url) {
    	String [] array = url.split("/");
    	try {
    		s3client.deleteObject(bucketName, array[3] + "/" + array[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
