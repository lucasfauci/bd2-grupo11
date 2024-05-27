package modelo;

public class Cliente extends Persona {
	private int idCliente;
	
	//Con obra social
	public Cliente(int idCliente, String nombre, String apellido, String dni, String obraSocial, String nroAfiliado,
			Domicilio domicilio) {
		super(nombre, apellido, dni, obraSocial, nroAfiliado, domicilio);
		this.idCliente = idCliente;
	}
	
	//Sin obra social
	public Cliente(int idCliente, String nombre, String apellido, String dni, Domicilio domicilio) {
		super(nombre, apellido, dni, domicilio);
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellido != null ? "apellido=" + apellido + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (obraSocial != null ? "obraSocial=" + obraSocial + ", " : "")
				+ (nroAfiliado != null ? "nroAfiliado=" + nroAfiliado + ", " : "")
				+ (domicilio != null ? "domicilio=" + domicilio : "") + "]";
	}

	
	
	
	
	
	
}
