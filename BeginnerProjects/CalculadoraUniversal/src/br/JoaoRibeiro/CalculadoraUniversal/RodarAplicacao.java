package br.JoaoRibeiro.CalculadoraUniversal;

import java.util.Scanner;

public class RodarAplicacao {

		public static void main(String[] args) {
			Views exibir = new Views();
			CalculosEspeciais ep = new CalculosEspeciais();
			exibir.MenuPrincial();
			boolean voidMain = true;
			while(voidMain != false) {
		          switch(exibir.number) {
		          case 1:
		        	  exibir.menuCalculoBasicos();
		        	  OperacoesBasicas b = new OperacoesBasicas(exibir.number);
		        	  exibir.retornoFuncao();
		            break;
		          case 2:
		      		ep.calculoCF();
		      		 exibir.retornoFuncao();
		            break;
		          case 3:
		        	  ep.geometria();
		        	  exibir.retornoFuncao();
			            break;
		          case 4:
		        	  System.out.print("Esta fucao esta em desenvolvimento");
		        	  exibir.retornoFuncao();
			            break;
		          case 5:
		        	  ep.ohms();
		        	  exibir.retornoFuncao();
			            break;
		          case 6:
		        	  ep.fibonacci();
		        	  exibir.retornoFuncao();
			            break;
		          case 7:
		        	  System.exit(0);
		        	  break;
		          
			}
			
		}
		}

	}
