package Ejecucion;

import Singleton.HibernateUtil;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
	}
}
