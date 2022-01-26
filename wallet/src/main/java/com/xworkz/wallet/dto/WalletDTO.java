package com.xworkz.wallet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;

@Entity
@Table(name = "wallet_table", schema = "hibernate")
@NamedQueries({
		@NamedQuery(name = "getWalletByBalance", query = "select dto from WalletDTO dto where dto.balance=:bal"),
		@NamedQuery(name = "getUserNameAndPasswordById", query = "select userName,password from WalletDTO dto where dto.id=:id") 
		})

public class WalletDTO {
	@Id
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_name")
	private String walletname;
	@Column(name = "t_uname")
	private String userName;
	@Column(name = "t_pass")
	private String password;
	@Column(name = "t_balance")
	private float balance;

	public WalletDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WalletDTO(int id, String walletname, String userName, String password, float balance) {
		super();
		this.id = id;
		this.walletname = walletname;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWalletname() {
		return walletname;
	}

	public void setWalletname(String walletname) {
		this.walletname = walletname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "WalletDTO [id=" + id + ", walletname=" + walletname + ", userName=" + userName + ", password="
				+ password + ", balance=" + balance + "]";
	}

}
