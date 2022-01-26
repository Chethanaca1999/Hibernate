package com.xworkz.recherge1.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.recherge1.Sim;

@Entity
@Table(name="recherge1_table",schema="hibernate")
public class Recherge1DTO {
 @Id
    @Column(name="t_id")
	private int id;
 @Column(name="t_type")
	private String rechargeType;
 @Column(name="t_cardname")
 @Enumerated(EnumType.STRING)
private Sim simCardName;
 @Column(name="t_pack")
	private String packType;
 @Column(name="t_phNo")
	private long mobileNo;
 
	public Recherge1DTO() {
	super();
}
	public Recherge1DTO(int id, String rechargeType, Sim simCardName, String packType, long mobileNo) {
		super();
		this.id = id;
		this.rechargeType = rechargeType;
		this.simCardName = simCardName;
		this.packType = packType;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRechargeType() {
		return rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}
	public Sim getSimCardName() {
		return simCardName;
	}
	public void setSimCardName(Sim simCardName) {
		this.simCardName = simCardName;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Recherge1DTO [id=" + id + ", rechargeType=" + rechargeType + ", simCardName=" + simCardName
				+ ", packType=" + packType + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
