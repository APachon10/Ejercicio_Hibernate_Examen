package Ejecucion;

import Singleton.HibernateUtil;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import GestionDB.Querys;
import Modelos.Vuelo;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Querys q = new Querys();
//		//Creamos el Objeto 
//		Vuelo v = new Vuelo();
//		//Atributos del Objeto
//		String id,aOrigen,aDestino,tipoVuelo,fechaVuelo;
//
//		//Pedimos lso valores del Objeto Vuelo 
//		System.out.print("Identificador de Vuelo: ");
//		System.out.println("========================");
//		id = scan.next();
//
//		System.out.print("Aeropuerto Origen:");
//		System.out.println("========================");
//		aOrigen = scan.next();
//
//		System.out.print("Aeropuerto Destino: ");
//		System.out.println("========================");
//		aDestino = scan.next();
//
//		System.out.print("Tipo de Vuelo: ");
//		System.out.println("========================");
//		tipoVuelo= scan.next();
//
//		System.out.print("Fecha de Vuelo: ");
//		System.out.println("========================");
//		fechaVuelo= scan.next();
//		
//		//Ponemos los Valores dentro del objeto 
//		v.setIdentificador(id);
//		v.setAeropuertoOrigen(aOrigen);
//		v.setAeropuertoDestino(aDestino);
//		v.setTipoVuelo(tipoVuelo);
//		v.setFechaVuelo(q.convertirFecha(fechaVuelo));
//	
//		q.insertflight(v);
		q.selectPersonal("piloto");

	}
}
