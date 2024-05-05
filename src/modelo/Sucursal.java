package modelo;

public class Sucursal {
	private int idSucursal;
	private Domicilio domicilio;
	
	public Sucursal(int idSucursal, Domicilio domicilio) {
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", domicilio=" + domicilio + "]";
	}
	
	
}
