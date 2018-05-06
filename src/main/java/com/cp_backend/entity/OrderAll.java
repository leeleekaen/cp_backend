package com.cp_backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_all")
public class OrderAll implements EntityInterface {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "cp_name")
	private String cpName;
	@Column(name = "cp_number")
	private String cpNumber;
	@Column(name = "cp_count")
	private Integer cpCount;
	@Column(name = "person_name")
	private String personName;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "cp_time")
	private String cpTime;
	@Column(name = "cp_award")
	private boolean cpAward;
	@Column(name = "cp_get")
	private boolean cpGet;
	@Column(name = "cp_degree")
	private Integer cpDegree;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getCpNumber() {
		return cpNumber;
	}
	public void setCpNumber(String cpNumber) {
		this.cpNumber = cpNumber;
	}
	public Integer getCpCount() {
		return cpCount;
	}
	public void setCpCount(Integer cpCount) {
		this.cpCount = cpCount;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCpTime() {
		return cpTime;
	}
	public void setCpTime(String cpTime) {
		this.cpTime = cpTime;
	}
	public boolean isCpAward() {
		return cpAward;
	}
	public void setCpAward(boolean cpAward) {
		this.cpAward = cpAward;
	}
	public boolean isCpGet() {
		return cpGet;
	}
	public void setCpGet(boolean cpGet) {
		this.cpGet = cpGet;
	}
	public Integer getCpDegree() {
		return cpDegree;
	}
	public void setCpDegree(Integer cpDegree) {
		this.cpDegree = cpDegree;
	}
	@Override
	public String toString(){
		return "OrderAll [id=" + id + ", cp_name=" + cpName + ", cp_number=" + cpNumber
				+ ", cp_count=" + cpCount + "]";
		
	}
	
}
