package modelo;

public class Producto {
	private int idProducto;
	private int codigo;
	private String tipo;
	private String descripcion;
	private String laboratorio;
	private double precio;
	
	public Producto(int idProducto, int codigo, String tipo, String descripcion, String laboratorio, double precio) {
		this.idProducto = idProducto;
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.setPrecio(precio);
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigo=" + codigo + ", tipo=" + tipo + ", descripcion="
				+ descripcion + ", laboratorio=" + laboratorio + ", precio=" + precio + "]";
	}
	
	public boolean equals (Producto other) {
		return this.getIdProducto() == other.getIdProducto();
	}
	
	
	
}
