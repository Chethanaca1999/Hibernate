package com.xworkz.practice.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.practice.dto.IlandDTO;

public class IlandDAOImpleme implements IlandDAO{

	public boolean save(IlandDTO dto) {
		if(dto!=null)
		{
			System.out.println("inside save method");
			Configuration configuration=new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(IlandDTO.class);
			SessionFactory factory=configuration.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(dto);
			tx.commit();
			session.close();
			factory.close();
			return true;
		}
		else
		{
		return false;
		}
	}
	public IlandDTO getDetails(int id)
	{
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(IlandDTO.class);
		SessionFactory sfac=con.buildSessionFactory();
		Session ses=sfac.openSession();
	IlandDTO dto=	ses.get(IlandDTO.class,id);
	ses.close();
		return dto;
	}

	public boolean deleteById(int id)
	{
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(IlandDTO.class);
		SessionFactory sessfa=con.buildSessionFactory();
		Session ses=sessfa.openSession();
		Transaction tx=ses.beginTransaction();
		IlandDTO dto=	ses.get(IlandDTO.class,id);
		//Object obj=ses.load(IlandDTO.class, id);
		if(dto!=null)
		{
		ses.delete(dto);
		}
		tx.commit();
		return id!=0 ? true:false;
	}
	public void updateServiceProvidedbyId(int id,String country) {
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(IlandDTO.class);
		SessionFactory sess=conf.buildSessionFactory();
		Session ses=sess.openSession();
		Transaction tx=ses.beginTransaction();
		IlandDTO dto=	ses.get(IlandDTO.class,id);
		dto.setCountry(country);
		ses.update(dto);
		System.out.println("updated succesfully");
		tx.commit();
		ses.close();
		
	}
}
