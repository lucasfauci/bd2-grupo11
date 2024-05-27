package modelo;

public class Detalle {
	private Producto producto;
	private int cantidad;
	private double precioUnitario;
	private double precioDetalle;
	
	public Detalle(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
		setPrecioUnitario();
		setPrecioDetalle();
	}


	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario() {
		this.precioUnitario = producto.getPrecio();
	}

	public double getPrecioDetalle() {
		return precioDetalle;
	}

	public void setPrecioDetalle() {
		this.precioDetalle = (double)((int)10*(precioUnitario*cantidad))/10;
	}


	@Override
	public String toString() {
		return "Producto=" + producto + ", cantidad=" + cantidad
				+ ", precioUnitario=" + precioUnitario + ", precioDetalle=" + precioDetalle + "]\n";
	}

	
	
	
}
