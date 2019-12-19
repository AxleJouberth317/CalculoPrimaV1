package Gradle_Prima;

import org.junit.Test;


public class PrimaVTest {

	@Test
	public void testMain() {
		Prima start = new Prima();
		start.main(null);
	}
	
	@Test
	public void testCalculoPrima() {
		Prima.calculoPrima(17, 30);
		Prima.calculoPrima(18, 25);
		Prima.calculoPrima(25, 29);
		Prima.calculoPrima(35, 31);
		Prima.calculoPrima(45, 30);
		Prima.calculoPrima(65, 30);
		Prima.calculoPrima(90, -1);
		Prima.calculoPrima(91, -1);
	}
	
	
	@Test
	public void testIsAptoParaReduccion() {
		Prima.isAptoParaReduccion(30, 5);
		Prima.isAptoParaReduccion(25, 2);
		Prima.isAptoParaReduccion(31, 5);
		Prima.isAptoParaReduccion(20, 3);
		Prima.isAptoParaReduccion(30, 0);
	}

	@Test
	public void testGetFactorEdad() {
		Prima.getFactorEdad(17);
		Prima.getFactorEdad(18);
		Prima.getFactorEdad(25);
		Prima.getFactorEdad(35);
		Prima.getFactorEdad(45);
		Prima.getFactorEdad(65);
		Prima.getFactorEdad(91);
	}	
	
	@Test
	public void testGetPuntosQuePuedePerder() {
		Prima.getPuntosQuePuedePerder(17);
		Prima.getPuntosQuePuedePerder(18);
		Prima.getPuntosQuePuedePerder(25);
		Prima.getPuntosQuePuedePerder(35);
		Prima.getPuntosQuePuedePerder(45);
		Prima.getPuntosQuePuedePerder(65);
		Prima.getPuntosQuePuedePerder(91);
	}
	
	@Test
	public void testGetReduccion() {
		Prima.getReduccion(17);
		Prima.getReduccion(18);
		Prima.getReduccion(25);
		Prima.getReduccion(35);
		Prima.getReduccion(45);
		Prima.getReduccion(65);
		Prima.getReduccion(91);
	}
	
	@Test
	public void testGetValorPrima() {
		Prima.getValorPrima(500, 2.8, 1);
	}
	
}