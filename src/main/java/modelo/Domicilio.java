package modelo;

public class Domicilio {
	//private int idDomicilio;
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;

	public Domicilio(String calle, int numero, String localidad, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	

	@Override
	public String toString() {
		return calle + " " + numero + ", " + localidad + ", " + provincia;
	}
}
