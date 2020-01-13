package Menu;
import java.util.Scanner;

import GestionDB.Querys;
import Modelos.Vuelo;

public class Menu {
	public void Menu() {
		Scanner scan = new Scanner(System.in);
		int opcion =0;
		do {
			System.out.println("Que quieres hacer?:"
					+ "\n1 - Insertar Vuelo "
					+ "\n2 - Mostrar lista de Pilotos"
					+ "\n3 - Mostrar Vuelos posteriores al 17 de febrero de 2020 "
					+ "\n0 - Salir"
					+ "\n======================================");
			System.out.print("Opcion:");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("=========================");
				Ejercicio1();
				System.out.println("=========================");
				break;
			case 2:
				System.out.println("=========================");
				Ejercicio2();
				System.out.println("=========================");
				break;
			case 3:
				System.out.println("=========================");
				Ejercicio3();
				System.out.println("=========================");
				break;
			}
		} while (opcion!=0);
	}
	public void Ejercicio1() {
		Querys q = new Querys();
		System.out.println("Lista de Vuelos antes del Insert: ");
		System.out.println("=================================");
		q.selectVuelos();
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		//Creamos el Objeto 
		Vuelo v = new Vuelo();
		//Atributos del Objeto
		String id,aOrigen,aDestino,tipoVuelo,fechaVuelo;

		//Pedimos lso valores del Objeto Vuelo 
		System.out.print("Identificador de Vuelo: ");
		System.out.println("========================");
		id = scan.next();

		System.out.print("Aeropuerto Origen:");
		System.out.println("========================");
		aOrigen = scan.next();

		System.out.print("Aeropuerto Destino: ");
		System.out.println("========================");
		aDestino = scan.next();

		System.out.print("Tipo de Vuelo: ");
		System.out.println("========================");
		tipoVuelo= scan.next();

		System.out.print("Fecha de Vuelo: ");
		System.out.println("========================");
		fechaVuelo= scan.next();

		//Ponemos los Valores dentro del objeto 
		v.setIdentificador(id);
		v.setAeropuertoOrigen(aOrigen);
		v.setAeropuertoDestino(aDestino);
		v.setTipoVuelo(tipoVuelo);
		v.setFechaVuelo(q.convertirFecha(fechaVuelo));

		q.insertflight(v);
		
		System.out.println("=================================");
		System.out.println("Lista de Vuelos despues de insert ");
		System.out.println("=================================");
		q.selectVuelos();

	}
	public void Ejercicio2() {
		Querys q = new Querys();
		q.selectPersonal("piloto");
	}
	public void Ejercicio3() {
		Querys q = new Querys();
		q.selectVuelos_post17Feb2020();
		
	}
}
