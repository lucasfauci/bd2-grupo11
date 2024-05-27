package test;

import java.time.LocalDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import helpers.LocalDateTimeTypeAdapter;
import modelo.Domicilio;
import modelo.Farmacia;

public class CargaDatos {

	public static void main(String[] args) {
		Farmacia f = new Farmacia();
		
		f.agregarSucursal(1, new Domicilio("Calle 1", 1504, "Lanús","Buenos Aires"));
		f.agregarSucursal(2, new Domicilio("Calle 2", 2929, "Remedios de Escalada","Buenos Aires"));
		f.agregarSucursal(3, new Domicilio("Calle 3", 2304, "Banfield","Buenos Aires"));
		
		f.agregarEmpleado(1, "Cristian", "Sánchez", "27846535", "Obra social 1", "8473538710298731", new Domicilio("Calle 4", 4333, "Lanús", "Buenos Aires"), "20-27846535-8", 1, true);
		f.agregarEmpleado(2, "Luciana", "Farías", "31493874", "Obra social 1", "8473538710298942", new Domicilio("Calle 4", 4333, "Lanús", "Buenos Aires"), "27-31493874-2", 1, false);
		f.agregarEmpleado(3, "Justo", "Alcorta", "42846757", "Obra social 2", "6587940324817558", new Domicilio("Calle 5", 1581, "Lanús", "Buenos Aires"), "20-42846757-5", 1, false);
		f.agregarEmpleado(4, "Graciela", "Fernández", "30448750", "Obra social 3", "6780918758219873", new Domicilio("Calle 6", 2789, "Lanús", "Buenos Aires"), "27-30448750-5", 2, true);
		f.agregarEmpleado(5, "Nuria", "Ramos", "45239754", "Obra social 4", "8462678098728394", new Domicilio("Calle 7", 4493, "Lanús", "Buenos Aires"), "23-45239754-9", 2, false);
		f.agregarEmpleado(6, "José", "Benítez", "43586277", "Obra social 5", "1284987539238748", new Domicilio("Calle 8", 1562, "Lanús", "Buenos Aires"), "20-43586277-3", 2, false);
		f.agregarEmpleado(7, "Roberto", "Barrios", "18293424", "Obra social 5", "1284987539182567", new Domicilio("Calle 9", 3510, "Lanús", "Buenos Aires"), "20-18293424-1", 3, true);
		f.agregarEmpleado(8, "Bruno", "Hernández", "41835418", "Obra social 4", "2908356473543683", new Domicilio("Calle 10", 2516, "Remedios de Escalada", "Buenos Aires"), "20-41835418-7", 3, false);
		f.agregarEmpleado(9, "Delia", "López", "47891423", "Obra social 1", "9928252537386548", new Domicilio("Calle 11", 2785, "Remedios de Escalada", "Buenos Aires"), "27-47891423-2", 3, false);
		
		f.agregarCliente(1, "Franciso", "Giménez", "38456732", "Obra social 6", "5764209009854247", new Domicilio("Calle 12", 670, "Remedios de Escalada","Buenos Aires"));
		f.agregarCliente(2, "Sonia", "Vera", "20487223", "Obra social 7", "1846910981238378", new Domicilio("Calle 13", 4383, "Remedios de Escalada","Buenos Aires"));
		f.agregarCliente(3, "Estela", "García", "11685299", "Obra social 7", "1846910980184923", new Domicilio("Calle 14", 78, "Remedios de Escalada","Buenos Aires"));
		f.agregarCliente(4, "Mario", "Herrera", "30847536", "Obra social 8", "7364011284562545", new Domicilio("Calle 15", 2867, "Remedios de Escalada","Buenos Aires"));
		f.agregarCliente(5, "Lucía", "Cáceres", "45735625", "", "", new Domicilio("Calle 16", 682, "Banfield","Buenos Aires"));
		f.agregarCliente(6, "Yaquelín", "Castro", "94362514", "Obra social 6", "5764297132018732", new Domicilio("Calle 17", 1751, "Banfield","Buenos Aires"));
		f.agregarCliente(7, "Tomás", "Riera", "40124573", "", "", new Domicilio("Calle 18", 4722, "Banfield","Buenos Aires"));
		f.agregarCliente(8, "Julio", "Frutos", "37925546", "Obra social 4", "6103298471972534", new Domicilio("Calle 19", 2463, "Banfield","Buenos Aires"));
		f.agregarCliente(9, "Marcelo", "Herrera", "35981667", "Obra social 8", "7364109487364573", new Domicilio("Calle 15", 2867, "Remedios de Escalada","Buenos Aires"));
		f.agregarCliente(10, "Norma", "Ponce", "18942837", "", "", new Domicilio("Calle 20", 2745, "Banfield","Buenos Aires"));
		
		f.agregarProducto(1, 1111, "Medicamento", "Producto medicamento 1", "Laboratorio 1", 1350);
		f.agregarProducto(2, 2222, "Medicamento", "Producto medicamento 2", "Laboratorio 1", 3499.99);
		f.agregarProducto(3, 3333, "Medicamento", "Producto medicamento 3", "Laboratorio 2", 980);
		f.agregarProducto(4, 4444, "Medicamento", "Producto medicamento 4", "Laboratorio 3", 8325);
		f.agregarProducto(5, 5555, "Medicamento", "Producto medicamento 5", "Laboratorio 2", 6892);
		f.agregarProducto(6, 6666, "Medicamento", "Producto medicamento 6", "Laboratorio 3", 560);
		f.agregarProducto(7, 7777, "Medicamento", "Producto medicamento 7", "Laboratorio 1", 750);
		f.agregarProducto(8, 8888, "Perfumería", "Producto perfumería 1", "Laboratorio 4", 8107);
		f.agregarProducto(9, 9999, "Perfumería", "Producto perfumería 2", "Laboratorio 5", 9320);
		f.agregarProducto(10, 1010, "Perfumería", "Producto perfumería 3", "Laboratorio 4", 5899.99);
		
		f.agregarVentasAleatorias(90);
		
		
		Gson gson = new GsonBuilder()
			    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
			    //.setPrettyPrinting()
			    .create();
		String json = gson.toJson(f.getVentas());
		System.out.println(json);
	}

}
