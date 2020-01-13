package GestionDB;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.StoredProcedureQuery;

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
		
		System.out.println("Lista de Pilotos: ");
		System.out.println("=======================");
		for (Personal personal : list) {
			System.out.println(personal);
			System.out.println("=====================");
		}
	}
	public void selectVuelos() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sesion = sessionFactory.openSession();
		Query selectVuelos = sesion.createQuery("from Vuelo");
		List<Vuelo> list = selectVuelos.list();
		
		for (Vuelo vuelo : list) {
			System.out.println(vuelo);
			System.out.println("========================");
		}
	}
	public void selectVuelos_post17Feb2020() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sesion = sessionFactory.openSession();
		StoredProcedureQuery ps =  sesion.createStoredProcedureQuery("SelectVuelospost17feb",Vuelo.class);
		List<Vuelo> ls = ps.getResultList();
		
		for (Vuelo vuelo : ls) {
			System.out.println(vuelo);
			System.out.println("=====================");
		}
		
	}
}
