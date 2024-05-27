package test;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import helpers.LocalDateTimeTypeAdapter;
import modelo.Cliente;
import modelo.Detalle;
import modelo.Domicilio;
import modelo.Empleado;
import modelo.Producto;
import modelo.Sucursal;
import modelo.Venta;

public class Test {

	public static void main(String[] args) {
		Domicilio d1 = new Domicilio("Calle Falsa", 123, "Lanus", "Buenos Aires");
		Domicilio d2 = new Domicilio("Otra calle", 456, "Luis Guillón", "Buenos Aires");
		Sucursal s1 = new Sucursal(1, d1);

		Empleado e1 = new Empleado(1, "Santiago", "Cofman", "44555666", "OSDO", "23498", d2, "20445556667", s1, true);
		//System.out.println(e1);
		
		Cliente c1 = new Cliente(1, "Lucas", "Fauci", "44935773", d2);
		//System.out.println(c1);
		
		Cliente c2 = new Cliente(2, "Juan Cruz", "Vazquez", "43222111", "IOMA", "9494", d2);
		//System.out.println(c2);
		
		Producto p1 = new Producto(1, 001, "Medicamento", "Aspirina", "Bayer", 499.09);
		Producto p2 = new Producto(2, 002, "Perfumeria", "Perfume", "Rexona", 5000);
		Detalle dt1 = new Detalle(p1, 3);
		Detalle dt2 = new Detalle(p2, 1);
		
		List<Detalle> ds1 = new ArrayList<>();
		ds1.add(dt1);
		ds1.add(dt2);
		
		Venta v1 = new Venta(2, 000002, LocalDateTime.of(2022, 5, 30, 11, 3), "Débito", e1, e1, c1, ds1);
		
		
		//System.out.println(v1);
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder()
			    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
			    .setPrettyPrinting()
			    .create();
		String json = gson.toJson(v1);
		System.out.println(json);
		
		/*LocalDateTime fecha1 = LocalDateTime.now();
		
		System.out.println(fecha1);
		
		Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter()).create();
;
		System.out.println(gson.toJson(fecha1));*/
	}
	

}
