package ar.edu.unahur.po2.cajaFuerte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void queAlCrearseSeCreaAbierta() {
		CajaFuerte caja = new CajaFuerte();
		assertEquals(true,caja.estaAbierta());
		
	}
	
	@Test 
	public void queCuandoLaCierroEstaCerrada() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar();
		assertEquals(false,caja.estaAbierta());
	}
	
	@Test 
	public void queAlAbrirSeAbra() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar();
		caja.abrir();
		assertEquals(true,caja.estaAbierta());
	}
	
	@Test 
	public void quealAbrirConClaveSeAbra() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar();
		caja.abrirConClave(1234);
		assertEquals(true,caja.estaAbierta());
	}

} 