package aula_02;

public class Aula02 {

	public static void main(String[] args) {
		
		/*Declarando obj da classe Caneta*/
		Caneta c1 = new Caneta();
		c1.cor= "vermelha";
		c1.ponta = 0.5f;
		c1.tampada= false;
		/*Metados para imprimir na tela */
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo= "Hostnet";
		c2.cor= "Preta";
		c2.ponta = 0.10f;
		c2.tampada= false;
		/*Metados para imprimir na tela */
		c2.destampar();
		c2.rabiscar();
		c2.status();
		
	}

}
