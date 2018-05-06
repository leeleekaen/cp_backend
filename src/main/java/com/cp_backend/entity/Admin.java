package com.cp_backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin implements EntityInterface{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "rich")
	private float rich;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getRich() {
		return rich;
	}
	public void setRich(float rich) {
		this.rich = rich;
	}
	
	
}
