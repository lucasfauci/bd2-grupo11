package modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Venta {
	private int idVenta;
	private String nroTicket;
	private LocalDateTime fecha;
	private String formaPago;
	private Empleado empleadoAtendio;
	private Empleado empleadoCobro;
	private Cliente cliente;
	private List<Detalle> detalles;
	private float total;
	
	public Venta(int idVenta, String nroTicket, LocalDateTime fecha, String formaPago,
			Empleado empleadoAtendio, Empleado empleadoCobro, Cliente cliente, List<Detalle> detalles) {
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.empleadoAtendio = empleadoAtendio;
		this.empleadoCobro = empleadoCobro;
		this.cliente = cliente;
		this.detalles = detalles;
		setNroTicket(nroTicket);
		this.total = calcularTotal();
	}


	public int getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}


	public String getNroTicket() {
		return nroTicket;
	}


	public void setNroTicket(String nroTicket) {
		this.nroTicket = "000" + this.getEmpleadoAtendio().getSucursal().getIdSucursal() + "-" + nroTicket;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	public Empleado getEmpleadoAtendio() {
		return empleadoAtendio;
	}


	public void setEmpleadoAtendio(Empleado empleadoAtendio) {
		this.empleadoAtendio = empleadoAtendio;
	}


	public Empleado getEmpleadoCobro() {
		return empleadoCobro;
	}


	public void setEmpleadoCobro(Empleado empleadoCobro) {
		this.empleadoCobro = empleadoCobro;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Detalle> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", nroTicket=" + nroTicket + ", fecha=" + fecha + ", total=" + total
				+ ", formaPago=" + formaPago + ", empleadoAtendio=" + empleadoAtendio + ", empleadoCobro="
				+ empleadoCobro + ", cliente=" + cliente + ", detalles=" + detalles + "]";
	}
	
	
	private float calcularTotal() {
		float total = 0;
		for (Detalle detalle : this.detalles) {
			total += detalle.getPrecioDetalle();
		}
		return total;
	}
	
	
}
