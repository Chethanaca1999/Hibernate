package com.xworkz.wallet.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.singleton1.HibernateUtil;
import com.xworkz.wallet.dto.WalletDTO;

public class WalletInter implements Wallet {

	public boolean save(WalletDTO dto) {

		
		SessionFactory fact = HibernateUtil.getSession();
		Session ses = fact.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(dto);
		tx.commit();
		
		return dto != null ? true : false;
	}

	public WalletDTO read(int id) {
		
		SessionFactory sesfa=HibernateUtil.getSession();
		Session sess= sesfa.openSession();
		WalletDTO dto=sess.get(WalletDTO.class, id);
		sess.close();
		return dto ;
	}

	public boolean update(int id,float balance) {
		
		SessionFactory sesf=HibernateUtil.getSession();
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
		SessionFactory sf=HibernateUtil.getSession();
		Session ses=sf.openSession();
		WalletDTO dto=ses.get(WalletDTO.class, id);
		ses.delete(dto);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		return id!=0 ?true:false;
		
		
	}

	public WalletDTO getDetailsByBalance(float balance) {
		SessionFactory ssf=HibernateUtil.getSession();
         WalletDTO wa=(WalletDTO)HibernateUtil.getSession().openSession().getNamedQuery("getWalletByBalance").setParameter("bal", balance).uniqueResult();
		return wa;
	}

	public Object[] getUserNameAndPasswordById(int id) {
		SessionFactory sesf= HibernateUtil.getSession();
		Session ses=sesf.openSession();
		Query qu=ses.getNamedQuery("getUserNameAndPasswordById");
		qu.setParameter("id", id);
		Object[] obj=(Object[]) qu.uniqueResult();
		ses.close();
				return obj;
	}

	public List<Object[]> getAllUserNameAndPassword() {
		String str="select userName,password from WalletDTO";
		
		SessionFactory sesf=HibernateUtil.getSession();
		Session ses=sesf.openSession();
		Query qu=ses.createQuery(str);
		List<Object[]> li=qu.list();
		ses.close();
		return li;
	}

	public String getPasswordByUserName(String userName) {
		String str="select dto.password from WalletDTO dto where dto.userName=:un";
		
		SessionFactory sesf=HibernateUtil.getSession();
		Session ses=sesf.openSession();
		Query qu=ses.createQuery(str);
		qu.setParameter("un", userName);
		String str1= (String) qu.uniqueResult();
		ses.close();
		
		return str1;
	}

	public boolean updatePasswordByUserName(String uName,String pass) {
		String str="update WalletDTO dto set dto.password=:pa where dto.userName=:uN";
		
		SessionFactory sesf=HibernateUtil.getSession();
		Session ses=sesf.openSession();
		Query qu=ses.createQuery(str);
		//Transaction tx=ses.beginTransaction();
		int val=qu.executeUpdate();
		qu.setParameter("pa", pass);
		qu.setParameter("un", uName);
		System.out.println(val);
		
		//tx.commit();
		ses.close();
		return val!=0? true:false;
		
	}

	public boolean deleteFromUname(String uName) {
		String str="delete  from WalletDTO dto where dto.userName=:uN";
		
		SessionFactory sesf=HibernateUtil.getSession();
		Session ses=sesf.openSession();
		Transaction tx=ses.beginTransaction();
		Query qu=ses.createQuery(str);
		int val=qu.executeUpdate();
		qu.setParameter("uN", uName);
		System.out.println(val);
		tx.commit();
		ses.close();
		
		return true;
		
	}

	public List<WalletDTO> getAll() {
		String str=" from WalletDTO";
		
		SessionFactory ses=HibernateUtil.getSession();
		
		
		Session ses1=ses.openSession();
		Query qu=ses1.createQuery(str);
		List<WalletDTO> li=qu.list();
		ses1.close();
		ses.close();
		return li;
		
	}
	

}
