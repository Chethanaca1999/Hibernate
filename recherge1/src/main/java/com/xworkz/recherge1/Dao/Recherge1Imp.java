package com.xworkz.recherge1.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.recherge1.Sim;
import com.xworkz.recherge1.Dto.Recherge1DTO;


public class Recherge1Imp  implements Recherge1{

	public boolean save(Recherge1DTO dto) {
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Recherge1DTO.class);
		SessionFactory sesf= con.buildSessionFactory();
		Session ses=sesf.openSession();
		ses.save(dto);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		return true;
	}


	public List<Recherge1DTO> read(int id) {
		// TODO Auto-generated method stub
		//List<Recherge1DTO> dto=new ArrayList<Recherge1DTO>();
		String st="select dto  from Recherge1DTO dto  where dto.id='"+id+"'";
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Recherge1DTO.class);
		SessionFactory sesf=con.buildSessionFactory();
		Session ses=sesf.openSession();
		Query query=ses.createQuery(st);
	
		 return   query.list();
		 
		
	}


	public Recherge1DTO raed(int id) {
		String st="select dto  from Recherge1DTO dto  where dto.id="+id;
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Recherge1DTO.class);
		SessionFactory sesf=con.buildSessionFactory();
		Session ses=sesf.openSession();
		Query qu=ses.createQuery(st);
		Recherge1DTO dto= (Recherge1DTO)qu.uniqueResult();
		return dto;
	}


	public boolean updateCaedNameByPhno(long phno,String type ) {
		 {
			   String str="update Recherge1DTO dto set dto.rechargeType='"+type+"' where dto.mobileNo='"+phno+"'";
			   Configuration con=new Configuration();
			   con.configure();
			   con.addAnnotatedClass(Recherge1DTO.class);
			   SessionFactory sesf=con.buildSessionFactory();
			   Session ses=sesf.openSession();
			  Query qu= ses.createQuery(str);
			  int val=qu.executeUpdate();
			  Transaction tx=ses.beginTransaction();
			  tx.commit();
			   
			  return val>0? true:false;
		   }
		
	}


	public boolean delete(long phno) {
		 String str="delete from Recherge1DTO dto where dto.mobileNo='"+phno+"'";
		   Configuration con=new Configuration();
		   con.configure();
		   con.addAnnotatedClass(Recherge1DTO.class);
		   SessionFactory sesf=con.buildSessionFactory();
		   Session ses=sesf.openSession();
		  Query qu= ses.createQuery(str);
		  int val=qu.executeUpdate();
		  Transaction tx=ses.beginTransaction();
		  tx.commit();
		
		return false;
	}


	public Object[] getServiceProviderAndPhoneNo() {
		//Object[] obj=new Object[2];
		String str="Select simCardName,mobileNo from Recherge1DTO dto where dto.id='"+1+"' ";
		Configuration con=new Configuration();
		   con.configure();
		   con.addAnnotatedClass(Recherge1DTO.class);
		   SessionFactory sesf=con.buildSessionFactory();
		   Session ses=sesf.openSession();
		  Query qu= ses.createQuery(str);
		 
		   Object[] obj= (Object[]) qu.uniqueResult();
		  
		
			 
		
		return obj;
		
		
	}


	public List<Object[]> getAllServiceProviderAndContactNo() {
		String str=" Select simCardName,mobileNo from Recherge1DTO";
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Recherge1DTO.class);
		SessionFactory sesf=con.buildSessionFactory();
		Session ses=sesf.openSession();
		Query qu=ses.createQuery(str);
		List<Object[]> li=qu.list();
		return li;
		
		
		
	}
	 

}
