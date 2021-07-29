package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


/**
 * The persistent class for the productdetail database table.
 * 
 */
@Entity
@NamedQuery(name="ProductDetail.findAll", query="SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idproductdetail")
	private int idProductDetail;

    @ManyToOne
    @JoinColumn(name = "idcolor")
	private Color idColor;

    @ManyToOne
    @JoinColumn(name = "idProduct")
	private Product idProduct;

    @ManyToOne
    @JoinColumn(name = "idsize")
	private Size idSize;

    @Column(name = "price")
	private float price;

    @Column(name = "quantity")
	private int quantity;

    @Column(name = "saleprice")
	private float salePrice;

    @Column(name = "status")
	private int status;

    @Column(name = "updateDatetime")
	@Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
	private Date updateDatetime;

    @Column(name = "updater")
	private String updater = "Admin";

	public ProductDetail() {
	}

	public int getIdProductDetail() {
		return this.idProductDetail;
	}

	public void setIdProductDetail(int idProductDetail) {
		this.idProductDetail = idProductDetail;
	}

	public Color getIdColor() {
		return idColor;
	}

	public void setIdColor(Color idColor) {
		this.idColor = idColor;
	}

	public Product getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}

	public Size getIdSize() {
		return idSize;
	}

	public void setIdSize(Size idSize) {
		this.idSize = idSize;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

}