package ar.edu.unlam.tp1;

public class Circulo {
	
	public Double radio;
	
	//Constructor 
		public Circulo(Double radio) {	
			this.radio = radio;
			}
	
	//Getter
	
	public Double getRadio() {
		return radio;
	}
	
	//M�todo para calcular el per�metro.
	public Double calcularPerimetro() {
		return Math.PI*2*this.radio;
	}
	
	public Double mostrarPerimetro(){
		return calcularPerimetro();
	}
}//fin
