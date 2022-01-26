package com.xworkz.wallet.dao;

import java.util.List;

import com.xworkz.wallet.dto.WalletDTO;

public interface Wallet {

	boolean save(WalletDTO dto);
	WalletDTO read(int id);
	boolean update(int id,float balance);
	boolean delete(int id);
	WalletDTO getDetailsByBalance(float balance);
	Object[] getUserNameAndPasswordById(int id);
	List<Object[]> getAllUserNameAndPassword();
	String getPasswordByUserName(String UserName);
     boolean updatePasswordByUserName(String uName,String pass);
     boolean deleteFromUname(String uName);
     List<WalletDTO> getAll();
}
