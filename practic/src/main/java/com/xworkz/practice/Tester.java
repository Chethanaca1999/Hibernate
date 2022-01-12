package com.xworkz.practice;

import com.xworkz.practice.dao.IlandDAO;
import com.xworkz.practice.dao.IlandDAOImpleme;
import com.xworkz.practice.dto.IlandDTO;

public class Tester {
	public static void main(String[] args) {
		
		//IlandDTO dto=new IlandDTO(1, "andaman and nicobar", "bay of bengal", "india");
		IlandDTO dto[]=new IlandDTO[5];
		 dto[0]=new IlandDTO(2, "Majuli Island", "Guwaha", "India");
		 dto[1]=new IlandDTO(3, "Diu Island ", "Gujarat", "India");
		 dto[2]=new IlandDTO(4,"Divar Island", "Mandovi", "India");
		 dto[3]=new IlandDTO(5, "Greenland", "Arctic Ocean and the Atlantic Ocean", "North America");
		 dto[4]=new IlandDTO(6, "New Guinea","Southwestern Pacific Ocean", "Indonesia");
		
		IlandDAO dao=new IlandDAOImpleme();
//		for (int j = 0; j < dto.length; j++) {
//			dao.save(dto[j]);
//			
//		} 
		// System.out.println(dao.getDetails(1));
		//dao.deleteById(1);
		dao.updateServiceProvidedbyId(2,"Bharat");
	}

}
