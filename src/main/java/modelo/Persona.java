package modelo;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String obraSocial;
	protected String nroAfiliado;
	protected Domicilio domicilio;
	
	//Con obra social
	public Persona(String nombre, String apellido, String dni, String obraSocial, String nroAfiliado,
			Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.obraSocial = obraSocial;
		this.nroAfiliado = nroAfiliado;
		this.domicilio = domicilio;
	}
	
	//Sin obra social
	public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(String nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	

	

	
}