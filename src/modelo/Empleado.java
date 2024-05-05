package modelo;

public class Empleado extends Persona {

	private int idEmpleado;
	private String cuil;
	private Sucursal sucursal;
	private Boolean esEncargado;

	public Empleado(int idEmpleado, String nombre, String apellido, String dni, String obraSocial, String nroAfiliado,
			Domicilio domicilio, String cuil, Sucursal sucursal, Boolean esEncargado) {
		super(nombre, apellido, dni, obraSocial, nroAfiliado, domicilio);
		this.idEmpleado = idEmpleado;
		this.cuil = cuil;
		this.sucursal = sucursal;
		this.esEncargado = esEncargado;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Boolean getEsEncargado() {
		return esEncargado;
	}

	public void setEsEncargado(Boolean esEncargado) {
		this.esEncargado = esEncargado;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cuil=" + cuil + ", sucursal=" + sucursal + ", esEncargado="
				+ esEncargado + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", obraSocial="
				+ obraSocial + ", nroAfiliado=" + nroAfiliado + ", domicilio=" + domicilio + "]";
	}

	
	
	

	
}
