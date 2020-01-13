package Ejecucion;

import Singleton.HibernateUtil;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import GestionDB.Querys;
import Menu.Menu;
import Modelos.Vuelo;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.Menu();
	}
}
