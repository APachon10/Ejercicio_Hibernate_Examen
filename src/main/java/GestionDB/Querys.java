package GestionDB;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Modelos.Pasaje;
import Modelos.PasajeId;
import Modelos.Vuelo;

public class Querys {
	
	public void insertflight(Vuelo v ) {
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto 
		v = new Vuelo();
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
		v.setIdentificador("AVI-346");
		v.setAeropuertoOrigen("MAD LEMD");
		v.setAeropuertoDestino("CPH EKCH");
		v.setTipoVuelo("DOMESTICO");
		v.setFechaVuelo(convertirFecha(fechaVuelo));
	
	}
	public Date convertirFecha(String fecha ) {
		Date fechaFinal = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
			fechaFinal = (java.sql.Date) sdf.parse(fecha);
		} catch (Exception e) {
			System.out.println("Error : ");
			System.out.println("==============");
			e.printStackTrace();
		}
		return fechaFinal;
	}
}
