package modelo;

public class Detalle {
	private int idDetalle;
	private Producto producto;
	private int cantidad;
	private float precioUnitario;
	private float precioDetalle;
	
	public Detalle(int idDetalle, Producto producto, int cantidad, float precioUnitario) {
		this.idDetalle = idDetalle;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.precioDetalle = precioUnitario*cantidad;
	}

	
	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
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

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public float getPrecioDetalle() {
		return precioDetalle;
	}

	public void setPrecioDetalle(float precioDetalle) {
		this.precioDetalle = precioDetalle;
	}


	@Override
	public String toString() {
		return "Detalle [idDetalle=" + idDetalle + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", precioUnitario=" + precioUnitario + ", precioDetalle=" + precioDetalle + "]";
	}

	
	
	
}
