package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the orderdetail database table.
 * 
 */
@Embeddable
public class OrderdetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idOrderDetail;

	private int idProductDetail;

	public OrderdetailPK() {
	}
	public int getIdOrderDetail() {
		return this.idOrderDetail;
	}
	public void setIdOrderDetail(int idOrderDetail) {
		this.idOrderDetail = idOrderDetail;
	}
	public int getIdProductDetail() {
		return this.idProductDetail;
	}
	public void setIdProductDetail(int idProductDetail) {
		this.idProductDetail = idProductDetail;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderdetailPK)) {
			return false;
		}
		OrderdetailPK castOther = (OrderdetailPK)other;
		return 
			(this.idOrderDetail == castOther.idOrderDetail)
			&& (this.idProductDetail == castOther.idProductDetail);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idOrderDetail;
		hash = hash * prime + this.idProductDetail;
		
		return hash;
	}
}