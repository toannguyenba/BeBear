package com.BeBear.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import com.BeBear.utils.json.parser.ProductphotoJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


/**
 * The persistent class for the productphoto database table.
 * 
 */
@Entity
@NamedQuery(name="Productphoto.findAll", query="SELECT p FROM Productphoto p")
@JsonSerialize(using = ProductphotoJsonSerializer.class)
public class Productphoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idphoto")
	@JsonProperty("idPhoto")
	private Integer idPhoto;

    @ManyToOne
    @JoinColumn(name = "idProductDetail")
    @JsonProperty("idProductDetail")
	private ProductDetail idProductDetail;
    
    @JsonProperty("url")
    @Column(name = "url")
	private String url;
    
	public Productphoto() {
	}
	
	public Productphoto(ProductDetail idProductDetail, String url) {
		this.idProductDetail = idProductDetail;
		this.url = url;
	}

	public Integer getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(Integer idPhoto) {
		this.idPhoto = idPhoto;
	}

	public ProductDetail getIdProductDetail() {
		return idProductDetail;
	}

	public void setIdProductDetail(ProductDetail idProductDetail) {
		this.idProductDetail = idProductDetail;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}