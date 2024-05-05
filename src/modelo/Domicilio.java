package modelo;

public class Domicilio {
	private int idDomicilio;
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;

	public Domicilio() {};

	public Domicilio(int idDomicilio, String calle, int numero, String localidad, String provincia) {
		this.idDomicilio = idDomicilio;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	

	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", calle=" + calle + ", numero=" + numero + ", localidad="
				+ localidad + ", provincia=" + provincia + "]";
	}
}
