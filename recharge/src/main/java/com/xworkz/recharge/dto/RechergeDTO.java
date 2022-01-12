package com.xworkz.recharge.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.recharge.CardName;

@Entity
@Table(name="card_table",schema="hibernate")
public class RechergeDTO {
	@Id
	@Column(name="t_id")
	private int id;
	@Column(name="t_type")
	private String rechargeType;
	@Column(name="t_name")
	@Enumerated(EnumType.STRING)
	private CardName simCardName;
	@Column(name="t_Pack")
	private String packType;
	@Column(name="t_mobNo")
	private long mobileNo;
	public RechergeDTO(int id, String rechargeType, CardName simCardName, String packType, long mobileNo) {
		super();
		this.id = id;
		this.rechargeType = rechargeType;
		this.simCardName = simCardName;
		this.packType = packType;
		this.mobileNo = mobileNo;
	}
	public RechergeDTO() {
		// TODO Auto-generated constructor stub
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
	public CardName getSimCardName() {
		return simCardName;
	}
	public void setSimCardName(CardName simCardName) {
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
		return "RechergeDTO [id=" + id + ", rechargeType=" + rechargeType + ", simCardName=" + simCardName
				+ ", packType=" + packType + ", mobileNo=" + mobileNo + "]";
	}
	
	
	

}
