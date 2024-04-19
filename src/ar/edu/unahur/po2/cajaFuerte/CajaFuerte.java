package ar.edu.unahur.po2.cajaFuerte;

public class CajaFuerte {
	private Boolean abierta = true;
	private Integer clave = 1234;
	
	public Boolean estaAbierta() {
		return abierta;
	}
	
	public void cerrar() {
		this.abierta = false;
	}

	public void abrir() {
		this.abierta = true;
	}
	
	public void abrirConClave(Integer miClave) {
		if(this.clave.equals(miClave)) {
			this.abrir();
		}
	}
	
	public void configurarContraseña(Integer miClave) {
		this.clave = miClave;
	}
}
