package com.xworkz.wallet;

import com.xworkz.wallet.dao.WalletInter;
import com.xworkz.wallet.dto.WalletDTO;

public class Tester {
	public static void main(String[] args) {
		
		//WalletDTO dto=new WalletDTO(1, "phone pay", "chethana ca ", "100", 2000);
		WalletDTO dto[]=new WalletDTO[4]; 
		 dto[0]=new WalletDTO(2, "Google Pay", "Sunder piche ", "OkGoogle", 20000000);
		 dto[1]=new WalletDTO(3, "amazon Pay", "Jeff Bezos ", "prime", 30000000);
		 dto[2]=new WalletDTO(4, "paytm", "Vijay shekar sharma", "paytmKaro", 40000000);
		 dto[3]=new WalletDTO(5, "WhatsApp Pay", "Brian Acton", "fromFacebook", 50000000);
		
		WalletInter inter=new WalletInter();
//		for (int i = 0; i < dto.length; i++) {
//			inter.save(dto[i]);
//		}
		//System.out.println(inter.read(1));
		//inter.update(1, 60000000);
		inter.delete(5);
	}

}
