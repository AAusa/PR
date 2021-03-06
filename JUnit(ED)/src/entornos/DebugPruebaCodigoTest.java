package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DebugPruebaCodigoTest {

	@Test
	void testContar_letraDa0() {
		char letra = 'c';
		char cadena[] = {};
		DebugPruebaCodigo prueba = new DebugPruebaCodigo();
		int resultado = prueba.contar_letra(cadena, letra);
		assertEquals(0, resultado);
		
	}
	@Test
	void testContar_letraDa0Entrado() {
		char letra = 'c';
		char cadena[] = {'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'};
		DebugPruebaCodigo prueba = new DebugPruebaCodigo();
		int resultado = prueba.contar_letra(cadena, letra);
		assertEquals(0, resultado);		
	}
	
	@Test
	void testContar_letraDaUnNumMayorDe0() {
		// 1,2,3,4,5,6,7
		char letra = 'c';
		char cadena[] = {'c', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b'};
		DebugPruebaCodigo prueba = new DebugPruebaCodigo();
		int resultado = prueba.contar_letra(cadena, letra);
		assertEquals(1, resultado);		
	}
	
	@Test
	void testContar_letra() {
		char letra = 'c';
		char cadena[] = {'c', 'b', 'a', 'c', 'a', 'b', 'a', 'b', 'a', 'b'};
		DebugPruebaCodigo prueba = new DebugPruebaCodigo();
		int resultado = prueba.contar_letra(cadena, letra);
		assertEquals(2, resultado);		
	}
}
