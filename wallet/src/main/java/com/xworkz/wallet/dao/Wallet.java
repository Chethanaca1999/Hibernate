package com.xworkz.wallet.dao;

import com.xworkz.wallet.dto.WalletDTO;

public interface Wallet {

	boolean save(WalletDTO dto);
	WalletDTO read(int id);
	boolean update(int id,float balance);
	boolean delete(int id);
}
