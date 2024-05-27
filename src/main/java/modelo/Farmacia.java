package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Farmacia {
	private List<Sucursal> sucursales;
	private List<Empleado> empleados;
	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Venta> ventas;

	public Farmacia() {
		this.sucursales = new ArrayList<Sucursal>();
		this.empleados = new ArrayList<Empleado>();
		this.clientes = new ArrayList<Cliente>();
		this.productos = new ArrayList<Producto>();
		this.ventas = new ArrayList<Venta>();
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void agregarSucursal(int idSucursal, Domicilio domicilio) {
		sucursales.add(new Sucursal(idSucursal, domicilio));
	}

	public void agregarEmpleado(int idEmpleado, String nombre, String apellido, String dni, String obraSocial,
			String nroAfiliado, Domicilio domicilio, String cuil, int idSucursal, Boolean esEncargado) {

		Sucursal sucursal = this.getSucursalById(idSucursal);
		empleados.add(new Empleado(idEmpleado, nombre, apellido, dni, obraSocial, nroAfiliado, domicilio, cuil,
				sucursal, esEncargado));
	}

	public void agregarCliente(int idCliente, String nombre, String apellido, String dni, String obraSocial,
			String nroAfiliado, Domicilio domicilio) {
		if (obraSocial != "")
			clientes.add(new Cliente(idCliente, nombre, apellido, dni, obraSocial, nroAfiliado, domicilio));
		else
			clientes.add(new Cliente(idCliente, nombre, apellido, dni, domicilio));
	}

	public void agregarProducto(int idProducto, int codigo, String tipo, String descripcion, String laboratorio,
			double precio) {
		productos.add(new Producto(idProducto, codigo, tipo, descripcion, laboratorio, precio));
	}

	public Sucursal getSucursalById(int idSucursal) {
		Sucursal sucursal = null;
		for (Sucursal s : sucursales) {
			if (s.getIdSucursal() == idSucursal)
				sucursal = s;
		}
		return sucursal;
	}

	public void agregarVentasAleatorias(int cantidadVentas) {
		for (int i = 0; i < cantidadVentas; i++) {
			Venta venta = generarVentaAleatoria();
			ventas.add(venta);
		}
	}

	public Venta generarVentaAleatoria() {
		Sucursal sucursal = sucursales.get(aleatorio(sucursales.size()));
		Cliente cliente = clientes.get(aleatorio(clientes.size()));
		Empleado empleadoAtendio = empleadoDeSucursal(sucursal);
		Empleado empleadoCobro = empleadoDeSucursal(sucursal);
		LocalDateTime fecha = fechaAleatoria();
		String formaPago = formaPagoAleatoria();
		int cantidadDetalles = aleatorioEntre(1, 5);
		int nroTicket = aleatorioEntre(10000, 99999);
		int idVenta = calcularIdVenta();

		List<Detalle> detalles = new ArrayList<Detalle>();

		for (int i = 0; i < cantidadDetalles; i++) {
			Detalle detalleNuevo = generarDetalleAleatorio();
			boolean productoYaAgregado = false;
			for (Detalle detalle : detalles) {
				if (detalle.getProducto().equals(detalleNuevo.getProducto())) {
					productoYaAgregado = true;
				}
			}

			if (!productoYaAgregado) {
				detalles.add(detalleNuevo);
			}
		}

		return new Venta(idVenta, nroTicket, fecha, formaPago, empleadoAtendio, empleadoCobro, cliente, detalles);
	}

	public int aleatorioEntre(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	};

	public int aleatorio(int max) {
		return (int) (Math.random() * max);
	}

	public Empleado empleadoDeSucursal(Sucursal sucursal) {
		List<Empleado> empleadosDeSucursal = new ArrayList<Empleado>();

		for (Empleado e : empleados) {
			if (e.getSucursal().equals(sucursal)) {
				empleadosDeSucursal.add(e);
			}
		}

		return empleadosDeSucursal.get(aleatorio(empleadosDeSucursal.size()));
	}

	public LocalDateTime fechaAleatoria() {
		int year = aleatorioEntre(2021, 2023);
		int month = aleatorioEntre(1, 12);
		int day = aleatorioEntre(1, 28);
		int hour = aleatorioEntre(8, 21);
		int minute = aleatorioEntre(1, 59);
		int second = aleatorioEntre(1, 59);

		return LocalDateTime.of(year, month, day, hour, minute, second);
	}

	public String formaPagoAleatoria() {
		String[] formasPago = { "Efectivo", "Débito", "Crédito" };

		return formasPago[aleatorio(formasPago.length)];
	}

	public Detalle generarDetalleAleatorio() {
		int cantidad = aleatorioEntre(1, 6);
		Producto producto = productos.get(aleatorio(productos.size()));

		return new Detalle(producto, cantidad);
	}

	public int calcularIdVenta() {
		int idVenta = 1;
		if (ventas.size() > 0) {
			idVenta = ventas.get(ventas.size()-1).getIdVenta() + 1;
		}
		return idVenta;

	}

	@Override
	public String toString() {
		return "Farmacia [sucursales=" + sucursales + ", empleados=" + empleados + ", clientes=" + clientes
				+ ", productos=" + productos + ", ventas=" + ventas + "]";
	}

}
