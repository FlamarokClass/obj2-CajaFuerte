package ar.edu.unahur.po2.cajaFuerte;

public class CajaFuerte {
	private Boolean abierta = true;
	private Integer clave = 1234;
	private Boolean bloqueada = false;
	private Integer intentos = 0;
	
	public Boolean estaAbierta() {
		return abierta;
	}
	
	public Boolean estaBloqueada() {
		return bloqueada;
	}
	
	public Integer cantidadDeIntentos() {
		return intentos;
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
			this.intentos = 0;
		} else {
			this.intentos += 1;
		}
	}
	
	public void configurarContrasenia(Integer miClave) {
		this.clave = miClave;
	}
	
	public void bloquearCaja() {
		if(this.abierta.equals(false) && this.intentos >= 3) {
			this.cerrar();
			this.bloqueada = true;
		}
	}
}
