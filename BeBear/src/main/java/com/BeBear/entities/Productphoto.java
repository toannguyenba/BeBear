package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productphoto database table.
 * 
 */
@Entity
@NamedQuery(name="Productphoto.findAll", query="SELECT p FROM Productphoto p")
public class Productphoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idphoto")
	private int idPhoto;

    @ManyToOne
    @JoinColumn(name = "idproduct",insertable=false, updatable=false)
	private Product idProduct;

    @Column(name = "url")
	private String url;
    
	public Productphoto() {
	}

	public int getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(int idPhoto) {
		this.idPhoto = idPhoto;
	}

	public Product getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}