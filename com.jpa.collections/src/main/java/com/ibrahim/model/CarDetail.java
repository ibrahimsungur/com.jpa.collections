package com.ibrahim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class CarDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String marka;
	private String model;
	private int year;
	private Date addDate;
	private Date updateDate;
	
	public CarDetail() {
		super();
	}

	public CarDetail(String marka, String model, int year, Date addDate, Date updateDate) {
		super();
		this.marka = marka;
		this.model = model;
		this.year = year;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "CarDetail [marka=" + marka + ", model=" + model + ", year=" + year + ", addDate=" + addDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
	
	
}
