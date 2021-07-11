package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the productdetail database table.
 * 
 */
@Entity
@NamedQuery(name="Productdetail.findAll", query="SELECT p FROM Productdetail p")
public class Productdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProductDetail;

	private int idColor;

	private int idProduct;

	private int idSize;

	private float price;

	private int quantity;

	private float salePrice;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDatetime;

	private String updater;

	public Productdetail() {
	}

	public int getIdProductDetail() {
		return this.idProductDetail;
	}

	public void setIdProductDetail(int idProductDetail) {
		this.idProductDetail = idProductDetail;
	}

	public int getIdColor() {
		return this.idColor;
	}

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdSize() {
		return this.idSize;
	}

	public void setIdSize(int idSize) {
		this.idSize = idSize;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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