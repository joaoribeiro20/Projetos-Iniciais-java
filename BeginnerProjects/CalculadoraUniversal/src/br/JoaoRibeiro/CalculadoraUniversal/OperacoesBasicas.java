package br.JoaoRibeiro.CalculadoraUniversal;

import java.util.Scanner;

public class OperacoesBasicas {
	
	
	double v1, v2;
	
	public void valores() {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro Valor: " );
		v1 = ler.nextDouble();
		System.out.print("Digite o segundo Valor: ");
		v2 = ler.nextDouble();
		
	}
	
	
	public OperacoesBasicas(int opcaoCalculoBase) {
		  switch(opcaoCalculoBase) {
          case 1:
        	 valores();
        	 double soma = soma(v1,v2);
        	
        	 System.out.print(""
        	 				+ "+-------------------------------+ \n"
        	 				+ "|   O resultado da soma é       | \n"
        	 				+ "|       ---"+soma+"---          | \n"
        	 				+ "+-------------------------------+ \n");
            break;
          case 2:
        	  valores();
        	  double sub = subitracao(v1,v2);
          	
         	 System.out.print(""
         	 				+ "+----------------------------+ \n"
         	 				+ "|O resultado da subitracao é | \n"
         	 				+ "|       ---"+sub+"---        | \n"
         	 				+ "+----------------------------+ \n");
        	 
            break;
          case 3:
        	  valores();
        	  double mux = multiplicacao(v1,v2);
          	
         	 System.out.print(""
         	 				+ "+------------------------------------+ \n"
         	 				+ "|   O resultado da Multiplicacao é   | \n"
         	 				+ "|       ---"+mux+"---                | \n"
         	 				+ "+------------------------------------+ \n");
        	  
	            break;
          case 4:
        	  valores();
        	  double div = divisao(v1,v2);
          	
         	 System.out.print(""
         	 				+ "+------------------------------+ \n"
         	 				+ "|   O resultado da Divisao é   | \n"
         	 				+ "|       ---"+div+"---          | \n"
         	 				+ "+------------------------------+ \n");
        	  
	            break;
    
          default:
		  }
	}
	
	
	public double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	public double subitracao(double valor1, double valor2) {
		return valor1 - valor2;
		}
	
	public double divisao(double valor1, double valor2) {
		return valor1 / valor2;
	}
	
	public double multiplicacao(double valor1, double valor2) {
		return valor1 * valor2;
	}
	

}