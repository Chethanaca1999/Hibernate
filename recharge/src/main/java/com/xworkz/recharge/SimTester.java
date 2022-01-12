package com.xworkz.recharge;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.recharge.dao.RechargeInter;
import com.xworkz.recharge.dao.RechergeInterImpleme;
import com.xworkz.recharge.dto.RechergeDTO;

public class SimTester {
	
	public static void main(String[] args) {
		
		RechergeDTO dto[]=new RechergeDTO[5];
		dto[0]=new RechergeDTO(1, "prepaid", CardName.Airtel, "unlimited", 9108231125l);
		dto[1]=new RechergeDTO(2, "postpaid", CardName.VodaphoneIdea, "Data Pack Only", 1234567890l);
		dto[2]=new RechergeDTO(3, "prepaid", CardName.RelianceJio, "Truly unlimated calls only", 7975589907l);
		dto[3]=new RechergeDTO(4, "postpaid",CardName.Bsnl, "limited pack", 3453673832l);
		dto[4]=new RechergeDTO(5, "postpaid", CardName.Bsnl, "landline calls", 249023);
		
		RechergeInterImpleme imp=new RechergeInterImpleme();
//		for (int i = 0; i < dto.length; i++) {
//		
//			imp.save(dto[i]);
//		}
		//System.out.println(imp.read(1));
		//System.out.println(imp.update(4, CardName.VodaphoneIdea));
		imp.delete(4);
		
		
		
	}
	

}
