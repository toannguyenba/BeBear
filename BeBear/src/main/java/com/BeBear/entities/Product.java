package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	
	@Column(name = "idcategory")
	private int idCategory;

	@Column(name = "productname")
	private String productName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedatetime")
	private Date updateDatetime;

	@Column(name = "updater")
	private String updater;

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

	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
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

}