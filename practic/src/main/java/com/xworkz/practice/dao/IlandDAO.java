package com.xworkz.practice.dao;

import com.xworkz.practice.dto.IlandDTO;

public interface IlandDAO {
	
	public boolean save(IlandDTO dto);
	public IlandDTO getDetails(int id);
	public boolean deleteById(int id);
	public void updateServiceProvidedbyId(int id,String country);
}
