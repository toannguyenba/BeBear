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

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the productphoto database table.
 * 
 */
@Entity
@NamedQuery(name="Productphoto.findAll", query="SELECT p FROM Productphoto p")
public class Productphoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idphoto")
	private Integer idPhoto;

    @ManyToOne
    @JoinColumn(name = "idProductDetail")
    @JsonIgnore
	private ProductDetail idProductDetail;

    @Column(name = "url")
	private String url;
    
	public Productphoto() {
	}
	
	public Productphoto(ProductDetail idProductDetail, String url) {
		this.idProductDetail = idProductDetail;
		this.url = url;
	}

	public int getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(int idPhoto) {
		this.idPhoto = idPhoto;
	}

	public ProductDetail getIdProduct() {
		return idProductDetail;
	}

	public void setIdProduct(ProductDetail idProductDetail) {
		this.idProductDetail = idProductDetail;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}