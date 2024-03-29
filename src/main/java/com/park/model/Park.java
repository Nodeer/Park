package com.park.model;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Park {
	@JsonIgnore
	private int Id;
	private String name;
	private int portCount;
	private int channelCount;
	private int portLeftCount;
	private double charge;
	private double charge1;
	private double charge2;
	private int status;
	private int isFree;
	private int floor;
	private int type;
	private String position;
	@JsonIgnore
	private Date date;
	@JsonIgnore
	private int isDeleted;
	
	
	
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public int getPortCount() {
		return portCount;
	}
	public int getChannelCount() {
		return channelCount;
	}
	public int getPortLeftCount() {
		return portLeftCount;
	}
	public double getCharge() {
		return charge;
	}
	public double getCharge1() {
		return charge1;
	}
	public double getCharge2() {
		return charge2;
	}
	public int getStatus() {
		return status;
	}
	public int getIsFree() {
		return isFree;
	}
	public int getFloor() {
		return floor;
	}
	public int getType() {
		return type;
	}
	public String getPosition() {
		return position;
	}
	public Date getDate() {
		return date;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPortCount(int portCount) {
		this.portCount = portCount;
	}
	public void setChannelCount(int channelCount) {
		this.channelCount = channelCount;
	}
	public void setPortLeftCount(int portLeftCount) {
		this.portLeftCount = portLeftCount;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public void setCharge1(double charge1) {
		this.charge1 = charge1;
	}
	public void setCharge2(double charge2) {
		this.charge2 = charge2;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setIsFree(int isFree) {
		this.isFree = isFree;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
