package br.JoaoRibeiro.CalculadoraUniversal;

import java.util.Scanner;

public class CalculosEspeciais {
	
	double pi = 3.14;
	
	Scanner ler = new Scanner(System.in);
	public void  calculoCF() {
		
  		System.out.println("Deseja converter \n"
  				+ "1 - Celsius para Fahrenheit \n"
  				+ "2 - Fahrenheit para Celsius \n");
  		int escolha = ler.nextInt();
		if (escolha == 1) {
  		System.out.print("Digite o Valor em Celsius: " );
  		double c = ler.nextDouble();
  		
			double  resp = (c * 1.8) + 32;
			System.out.print("Valor Celsius em "+c+ " Convertido para Fahrenheit é igual : "+resp+ "F \n");
			
		}
		if (escolha == 2) {
			System.out.print("Digite o Valor em Fahrenheit: " );
	  		double f = ler.nextDouble();
	  		
				double  resp = (f - 32)/1.8;
				System.out.print("Valor Fahrenheit em "+f+ " Convertido para Celsius é igual : "+resp+ "C \n");
					
		}
		
	}

	public void geometria() {
	
  		
		System.out.println("Deseja calcular a Volume de qual figura geometrica? \n"
  				+ "1 - Quadrado \n"
  				+ "2 - Retangulo \n"
  				+ "3 - cilindro \n");
  		int escolha = ler.nextInt();
  		
  		
  		switch(escolha) {
  	  case 1:
  		System.out.print("Digite o valor do lado do quadrado : ");
  		double lado =ler.nextDouble();
  	   double vQuadrado = lado*lado*lado;
  	   System.out.print("O valor do Volume do Quadrado é igual a : "+vQuadrado);
  	    break;
  	  case 2:
  		System.out.print("Digite o valor do largura do quadrado : ");
  		double largura =ler.nextDouble();
  		System.out.print("Digite o valor do comprimento do quadrado : ");
  		double comprimento =ler.nextDouble();
  		System.out.print("Digite o valor do altura do quadrado : ");
  		double altura =ler.nextDouble();
  		double vRetangulo = largura*comprimento*altura;
  		System.out.print("O valor do Volume do Retangulo é igual a : "+vRetangulo);
  	    break;
  	  case 3:
  		System.out.print("Digite o valor do Raio do cilindro : ");
  		double raio =ler.nextDouble();
  		System.out.print("Digite o valor do altura do cilindro : ");
  		altura =ler.nextDouble();
  		double vCilindro = pi*raio*raio*altura;
  		String valorCortado = String.valueOf(vCilindro);
  		System.out.print("O valor do Volume do Cilindro é igual a : \n"+valorCortado.substring(0, 6)  + "cm3 - Metros Cubicos \n");
  	    break;
  	    
  	    
  	  
  	}
	}

	public void ohms() {
		double corrente;
		double tensao;
		double resistencia;
		double potencia;
		System.out.print("qual das opçoes a baixo deseja encontrar? \n"
				+ "1 - Corrente \n"
				+ "2 - Tensao \n"
				+ "3 - resistencia equevaliente do circuito\n"
				+ "4 - potencia\n");
				/*+ "4 - resistencia equivalente (em serie) "
				+ "5 - resistencia equivalente (em paralelo)"*/
		int escolha = ler.nextInt();
		System.out.print("Esta fucao esta em fase de teste, os dados apresentado"
				+ " e selecionado a seguir nao possui valor ao codigo");
		
		System.out.print("Quais dados voce possui ?\n"
				+ "1 - Corrente \n"
				+ "2 - Tensao \n"
				+ "3 - resistencia equevaliente do circuito\n"
				+ "4 - potencia\n");
		int dados1 = ler.nextInt();
		int dados2 = ler.nextInt();
		
		
		
		switch(escolha) {
		  case 1:// corrente 
			  System.out.print("Digite o valor da tenão do circuito: ");
			   tensao = ler.nextInt();
			  System.out.print("Digite a resistencia equevalente do circuito: ");
			  resistencia = ler.nextInt();
			  corrente = tensao / resistencia;
			  System.out.print("A corrente total do circuito é igual a : " +corrente+"A \n");
		    break;
		  case 2:// tensao 
			  System.out.print("Digite a corrente total do circuito: ");
			   corrente = ler.nextInt();
			  System.out.print("Digite a resistencia equvalente do circuito: ");
			  resistencia = ler.nextInt();
			tensao = resistencia * corrente  ;
			  System.out.print("A tensao do circuito é igual a : " +tensao+"V \n");
		    break;
		  case 3:// resistencia 
			  System.out.print("Digite a tensao do circuito: ");
			   tensao = ler.nextInt();
			  System.out.print("digite a corrente total do circuito: ");
			  corrente = ler.nextInt();
			 resistencia = tensao /  corrente;
			  System.out.print("A resistencia total do circuito é igual a : " +resistencia+" \n");
			    break;
		  case 4: // potencia 
			  System.out.print("Digite o valor da tensao: ");
			   tensao = ler.nextInt();
			  System.out.print("Digite o valor da corrente total do circuito: ");
			  corrente = ler.nextInt();
			  potencia = tensao * corrente ;
			  System.out.print("A potencia total do circuito é igual a : " +potencia+"W \n");
			    break;
		}
		
	}

	public void fibonacci() {
		int f1 = 0;
		int f2 = 1;
		System.out.println("Digite o limitador da sequencia: ");
		int limit = ler.nextInt();
		System.out.print("A sequencia Fibonacci é : ");
		while(f2 < limit) {
			int fn = f1 + f2;
			if(fn > limit) {
				break;
			}
			System.out.print(" "+fn+",");
			f1 = f2;
			f2 = fn;
		}
	}
}//class




  