package com.BeBear.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


/**
 * The persistent class for the size database table.
 * 
 */
@Entity
@NamedQuery(name="Size.findAll", query="SELECT s FROM Size s")
public class Size implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idsize")
	private int idSize;

	@Column(name="description")
	private String description;

	@Column(name="sizename")
	private String sizeName;

	@Column(name="status")
	private int status;

	@Column(name="updatedatetime")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date updateDatetime;

	@Column(name="updater")
	private String updater = "SystemAdmin";

	public Size() {
	}

	public int getIdSize() {
		return this.idSize;
	}

	public void setIdSize(int idSize) {
		this.idSize = idSize;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSizeName() {
		return this.sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
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