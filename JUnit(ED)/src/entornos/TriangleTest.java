package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testTriangle1() {
		Triangle test1 = new Triangle(0,1,1);
		String resultado = test1.type();
		assertEquals("INVALID", resultado);
	}
	@Test
	void testTriangle2() {
		Triangle test1 = new Triangle(1,0,1);
		String resultado = test1.type();
		assertEquals("INVALID", resultado);
	}
	@Test
	void testTriangle3() {
		Triangle test1 = new Triangle(1,1,0);
		String resultado = test1.type();
		assertEquals("INVALID", resultado);
	}
	@Test
	void testTriangle4() {
		Triangle test1 = new Triangle(1,1,2);
		String resultado = test1.type();
		assertEquals("NOT_A_TRIANGLE", resultado);
	}
	@Test
	void testTriangle5() {
		Triangle test1 = new Triangle(1,2,1);
		String resultado = test1.type();
		assertEquals("NOT_A_TRIANGLE", resultado);
	}
	@Test
	void testTriangle6() {
		Triangle test1 = new Triangle(2,1,1);
		String resultado = test1.type();
		assertEquals("NOT_A_TRIANGLE", resultado);
	}
	@Test
	void testTriangle7() {
		Triangle test1 = new Triangle(1,1,1);
		String resultado = test1.type();
		assertEquals("EQUILATERAL", resultado);
	}
	@Test
	void testTriangle8() {
		Triangle test1 = new Triangle(1,2,2);
		String resultado = test1.type();
		assertEquals("ISOSCELES", resultado);
	}
	@Test
	void testTriangle10() {
		Triangle test1 = new Triangle(3,2,3);
		String resultado = test1.type();
		assertEquals("ISOSCELES", resultado);
	}
	@Test
	void testTriangle11() {
		Triangle test1 = new Triangle(3,4,5);
		String resultado = test1.type();
		assertEquals("SCALENE", resultado);
	}
	/**
	 * 	
	
	 */


}

