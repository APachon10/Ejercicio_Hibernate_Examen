package GestionDB;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Modelos.Personal;
import Modelos.Vuelo;
import Singleton.HibernateUtil;

public class Querys {
	
	public void insertflight(Vuelo v ) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sesion = sessionFactory.openSession();
		Transaction ts = sesion.beginTransaction();
		sesion.save(v);
		ts.commit();
		
	}
	public Date convertirFecha(String fecha ) {
		Date fechaFinal = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
			fechaFinal =(Date) sdf.parse(fecha);
		} catch (Exception e) {
			System.out.println("Error : ");
			System.out.println("==============");
			e.printStackTrace();
		}
		return fechaFinal;
	}

	//Consultas que no necesitan Transaccion 
	public void selectPersonal(String puesto ) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sesion = sessionFactory.openSession();
		Query selectPersonal = sesion.createQuery("from Personal where categoria = :puesto");
		selectPersonal.setParameter("puesto", puesto);
		List<Personal> list = selectPersonal.list();
		
		for (Personal personal : list) {
			System.out.println(personal);
		}
	}
	
}
