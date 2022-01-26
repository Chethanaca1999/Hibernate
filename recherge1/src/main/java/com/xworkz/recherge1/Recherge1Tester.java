package com.xworkz.recherge1;

import java.util.List;

import com.xworkz.recherge1.Dao.Recherge1Imp;
import com.xworkz.recherge1.Dto.Recherge1DTO;

public class Recherge1Tester {

public static void main(String[] args) {
		
		Recherge1DTO dto[]=new Recherge1DTO[5];
		dto[0]=new Recherge1DTO(1, "prepaid", Sim.Airtel, "unlimited", 9108231125l);
		dto[1]=new Recherge1DTO(2, "postpaid", Sim.VodaphoneIdea, "Data Pack Only", 1234567890l);
		dto[2]=new Recherge1DTO(3, "prepaid",Sim.RelianceJio, "Truly unlimated calls only", 7975589907l);
		dto[3]=new Recherge1DTO(4, "postpaid",Sim.Bsnl, "limited pack", 3453673832l);
		dto[4]=new Recherge1DTO(5, "postpaid", Sim.Bsnl, "landline calls", 249023);
		
		Recherge1Imp imp=new Recherge1Imp();
		for (int i = 0; i < dto.length; i++) {
		//	imp.save(dto[i]);
		}
		//System.out.println(imp.raed(1));
		//System.out.println(imp.updateCaedNameByPhno(9108231125l,"limited"));
		//imp.delete(1234567890l);
		//imp.getServiceProviderAndPhoneNo();
		
		
	Object[] obj=	imp.getServiceProviderAndPhoneNo();
	for (Object object : obj) {
		
	}
//	for (Object object : obj) {
//		System.out.println(object);
//		
//	}
			
		
//	List<Object[]> li=	imp.getAllServiceProviderAndContactNo();
//	for (Object[] objects : li) {
//		for (Object object : objects) {
//			System.out.print(object +" ");
//		}
//		
//	}
	
	//li.forEach((e)->System.out.printn(e));
		
		
}
}
