package com.xworkz.recharge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.recharge.CardName;
import com.xworkz.recharge.dto.RechergeDTO;

public class RechergeInterImpleme implements RechargeInter{

	public boolean save(RechergeDTO dto) {
		
		System.out.println("inside save method ");
		
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(RechergeDTO.class);
		SessionFactory fact=con.buildSessionFactory();
		Session sess=fact.openSession();
		Transaction tran=sess.beginTransaction();
		sess.save(dto);
		tran.commit();
		sess.close();
		fact.close();
		return dto!=null ? true:false; 
		}

	public RechergeDTO read(int id) {
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(RechergeDTO.class);
		SessionFactory sesfac=con.buildSessionFactory();
		Session ses=sesfac.openSession();
		RechergeDTO dto=ses.get(RechergeDTO.class, id);
		return dto;
		
		
		
	}

	public boolean update(int id, CardName en) {
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(RechergeDTO.class);
		SessionFactory sfac=con.buildSessionFactory();
		Session  ses=sfac.openSession();
		RechergeDTO dto=ses.get(RechergeDTO.class, id);
		dto.setSimCardName(en);
		ses.update(dto);
		System.out.println("updated succesfully");
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		return id!=0? true:false;
		
	}

	public boolean delete(int id) {
		
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(RechergeDTO.class);
		SessionFactory sesfa=con.buildSessionFactory();
		Session ses=sesfa.openSession();
		RechergeDTO dto=ses.get(RechergeDTO.class,id );
		ses.delete(dto);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		
		
		return id!=0 ?true: false;
	}
	
	
	
	

}
