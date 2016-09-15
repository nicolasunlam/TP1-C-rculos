package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	@Test
	public void crearUnCirculoConRadio2() {
		//Preparación
		Circulo miCirculo = new Circulo(2.00);
		//Ejecución
		Double valorEsperado = 2.00;
		Double valorActual = miCirculo.getRadio();
		//Contrastación
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(),0.01);
		System.out.println("Se creó un círculo de radio " +miCirculo.getRadio());
			}
	
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		//Preparación
		Circulo miCirculo = new Circulo(3.70);
		//Ejecución
		Double valorEsperado = 3.70;
		Double valorActual = miCirculo.getRadio();
		//Contrastación
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(),0.01);
		System.out.println("Se creó un círculo de radio " +miCirculo.getRadio());
			}
	
	
	@Test
	public void crearUnCirculoConRadio5() {
		//Preparación
		Circulo miCirculo = new Circulo(5.00);
		//Ejecución
		Double valorEsperado = 5.00;
		Double valorActual = miCirculo.getRadio();
		//Contrastación
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(),0.01);
		System.out.println("Se creó un círculo de radio " +miCirculo.getRadio());
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo miCirculo = new Circulo(10.90);
		
		Double valorEsperado = 10.90;
		Double valorActual = miCirculo.getRadio();
		
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("Se creó un círculo de radio " +miCirculo.getRadio());
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo miCirculo = new Circulo(9.80);
		Double valorEsperado = 61.573;
		Double valorActual = miCirculo.calcularPerimetro();
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El perímetro es " +miCirculo.mostrarPerimetro());
		
		
	}
	

	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo miCirculo = new Circulo(16.60);
		Double valorEsperado = 104.300;
		Double valorActual = miCirculo.calcularPerimetro();
		assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El perímetro es " +miCirculo.mostrarPerimetro());
		
	}

	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente mÃ©todo se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
