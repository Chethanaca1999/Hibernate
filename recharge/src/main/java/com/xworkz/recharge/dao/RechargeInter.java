package com.xworkz.recharge.dao;

import com.xworkz.recharge.CardName;
import com.xworkz.recharge.dto.RechergeDTO;

public interface RechargeInter {
	
	boolean save(RechergeDTO dto);
	RechergeDTO read(int id);
	boolean update(int id,CardName en);
	boolean delete(int id);
	

}
