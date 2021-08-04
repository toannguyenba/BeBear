package com.BeBear.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

/**
 * The persistent class for the productdetail database table.
 * 
 */
@Entity
@NamedQuery(name = "ProductDetail.findAll", query = "SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idProductDetail")
	private Integer idProductDetail;

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
	private Float price;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "saleprice")
	private Float salePrice;

	@Column(name = "status")
	private Integer status;

	@Column(name = "updateDatetime")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updateDatetime;

	@Column(name = "updater")
	private String updater = "Admin";

	@OneToMany(mappedBy = "idProductDetail", cascade = CascadeType.ALL)
	private List<Productphoto> productPhotos;

	public ProductDetail() {
	}

	public Integer getIdProductDetail() {
		return idProductDetail;
	}

	public void setIdProductDetail(Integer idProductDetail) {
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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

	public List<Productphoto> getProductPhotos() {
		return productPhotos;
	}

	public void setProductPhotos(List<Productphoto> productPhotos) {
		this.productPhotos = productPhotos;
	}


}