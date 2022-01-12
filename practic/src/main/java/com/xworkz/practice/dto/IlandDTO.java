package com.xworkz.practice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iland_table")
public class IlandDTO {
	@Id
	@Column(name="t_id")
	private int id;
	@Column(name="t_name")
	private String name;
	@Column(name="t_location")
	private String location;
	@Column(name="t_country")
	private String country;
	public IlandDTO(int id, String name, String location, String country) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.country = country;
	}
	
	public IlandDTO() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "IlandDTO [id=" + id + ", name=" + name + ", location=" + location + ", country=" + country + "]";
	}
	
	

}
