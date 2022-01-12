package com.xworkz.wallet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.wallet.dto.WalletDTO;

public class WalletInter implements Wallet {

	public boolean save(WalletDTO dto) {

		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(WalletDTO.class);

		SessionFactory fact = conf.buildSessionFactory();
		Session ses = fact.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(dto);
		tx.commit();
		
		return dto != null ? true : false;
	}

	public WalletDTO read(int id) {
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(WalletDTO.class);
		SessionFactory sesfa=conf.buildSessionFactory();
		Session sess= sesfa.openSession();
		WalletDTO dto=sess.get(WalletDTO.class, id);
		sess.close();
		return dto ;
	}

	public boolean update(int id,float balance) {
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(WalletDTO.class);
		SessionFactory sesf=con.buildSessionFactory();
		Session ses= sesf.openSession();
		WalletDTO dto=ses.get(WalletDTO.class,id);
		dto.setBalance(balance);
		ses.update(dto);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		return id!=0 ?true:false;
	}
	public boolean delete(int id)
	{
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(WalletDTO.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		WalletDTO dto=ses.get(WalletDTO.class, id);
		ses.delete(dto);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		return id!=0 ?true:false;
		
		
	}
	

}
