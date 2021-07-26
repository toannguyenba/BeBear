package com.BeBear.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
//@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
@Table(name = "product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idproduct")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	@Column(name = "description")
	private String description;

	@Column(name = "productname")
	private String productName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedatetime")
	private Date updateDatetime;

	@Column(name = "updater")
	private String updater;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
	
	@OneToMany(mappedBy = "idProduct")
	private List<Productphoto> idPhoto;
	
	@OneToMany(mappedBy = "idProduct")
	private List<ProductDetail> productdetail;

	public List<ProductDetail> getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(List<ProductDetail> productdetail) {
		this.productdetail = productdetail;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product() {
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getUpdater() {
		return this.updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public List<Productphoto> getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(List<Productphoto> idPhoto) {
		this.idPhoto = idPhoto;
	}

}