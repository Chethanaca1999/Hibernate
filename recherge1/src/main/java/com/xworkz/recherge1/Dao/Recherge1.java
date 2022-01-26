package com.xworkz.recherge1.Dao;

import java.util.List;

import com.xworkz.recherge1.Sim;
import com.xworkz.recherge1.Dto.Recherge1DTO;

public interface Recherge1 {
	
	boolean save(Recherge1DTO dto);
   List<Recherge1DTO> read(int id);
   Recherge1DTO raed(int id);
   boolean updateCaedNameByPhno(long phno,String type);
   boolean delete(long phno);
  Object[] getServiceProviderAndPhoneNo();
  List<Object[]> getAllServiceProviderAndContactNo();
  
}
