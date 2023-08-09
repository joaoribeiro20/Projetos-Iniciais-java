package br.JoaoRibeiro.CalculadoraUniversal;

import java.util.Scanner;

public class Views {
	
	public String escolhaMenu;
	public int number;
	
	
	/*public boolean validarEscolha() {
		String opcaoMenu[] = {};
		boolean opcaoValida = false;
		
		while(opcaoValida != true){
			
		Scanner ler = new Scanner(System.in);
		escolhaMenu = ler.nextLine();
		
			for(int i = 0; i <= opcaoMenu.length; i++) {
			
				if(escolhaMenu.equals(opcaoMenu[i])) {
				opcaoValida = true;
				number = Integer.parseInt(escolhaMenu);		
				break;
				}
					if(i == 5) {
						System.out.print(""
						 + "+-----------------------------------------------------------+"
						 + "|                                                           |"
						 + "|                    Opcao Invalida                         |"
						 + "|                                                           |"
						 + "|               Escolha um dos numeros Acima				|"
						 + "|       Que representa as opção disponiveis no sistema   	|"
						 + "|                                                           |"
						 + "+-----------------------------------------------------------+");
						break;
					}
			}	
		}
		return true;
	}*/
	public void retornoFuncao() {
		System.out.print("\n"
						+" _________________________________________________________ \n"
						+"|                                                         |\n"
						+"|             Escolha uma das opçoes a baixo              |\n"
						+"|                                                         |\n"
						+"|                1 - Voltar ao menu Principal             |\n"    
						+"|                2 - Finalizar o Sistema                  |\n"
						+"|_________________________________________________________|\n");
		
		String opcaoMenu[] = {"1","2"};
		boolean opcaoValida = false;
		
		while(opcaoValida != true){
			
		Scanner ler = new Scanner(System.in);
		escolhaMenu = ler.nextLine();
		
			for(int i = 0; i <= opcaoMenu.length; i++) {
			
				if(escolhaMenu.equals(opcaoMenu[i])) {
				opcaoValida = true;		
				if(escolhaMenu.equals("1")) {
					MenuPrincial();
					break;	
				}
				if(escolhaMenu.equals("2")) {
					System.exit(0);			
				}
				break;
				}
					if(i == 1) {
						System.out.println(""
								         + "+-----------------------------------------------------------+ \n"
								         + "|                                                           | \n"
								         + "|                    Opcao Invalida                         | \n"
								         + "|                                                           | \n"
								         + "|               Escolha um dos numeros Acima                |\n"
								         + "|       Que representa as opção disponiveis no sistema      |\n"
								         + "|                                                           | \n"
								         + "+-----------------------------------------------------------+ \n");
						break;
					}
			}	
		}
	}
	public void MenuPrincial() {
		System.out.print(""
				+ " __________________Projeto Calculadora universal__________________\n"
				+ "|                                                                 |\n"
				+ "|                                                                 |\n"
				+ "|                    Bem vindo ao sistema!!                       |\n"
				+ "|                 Escolha uma das opcoes a baixo                  |\n"
				+ "|                                                                 |\n"
				+ "|                                                                 |\n"
				+ "|                 1 - calculos basicos                            |\n"
				+ "|                 2 - Conversor de Celsius e Fahrenheit           |\n"
				+ "|                 3 - calculos de geometria espacial              |\n"
				+ "|                 4 - Calculo da massa molar                      |\n"
				+ "|                 5 - calculo de Eletrica (Ohms)                  |\n"
				+ "|                 6 - Sequencia de fibonacci                      |\n"
				+ "|                 7 - Sair do sistema                             |\n"
				+ "|                                                                 |\n"
				+ "|_________________________________________________________________|\n");
		
		String opcaoMenu[] = {"1","2","3","4","5","6","7"};
		boolean opcaoValida = false;
		
		while(opcaoValida != true){
			
		Scanner ler = new Scanner(System.in);
		escolhaMenu = ler.nextLine();
		
			for(int i = 0; i <= opcaoMenu.length; i++) {
			
				if(escolhaMenu.equals(opcaoMenu[i])) {
				opcaoValida = true;
				number = Integer.parseInt(escolhaMenu);		
				break;
				}
					if(i == 6) {
						System.out.println(""
								         + "+-----------------------------------------------------------+ \n"
								         + "|                                                           | \n"
								         + "|                    Opcao Invalida                         | \n"
								         + "|                                                           | \n"
								         + "|               Escolha um dos numeros Acima                |\n"
								         + "|       Que representa as opção disponiveis no sistema      |\n"
								         + "|                                                           | \n"
								         + "+-----------------------------------------------------------+ \n");
						break;
					}
			}	
		}
				

	}	  
	
	//------------------------------------------------------------------------------------
	
	public void menuCalculoBasicos() {
		System.out.print(""
				+ " __________________Projeto Calculadora universal__________________\n"
				+ "|                                                                 |\n"
				+ "|                                                                 |\n"
				+ "|                 Escolha uma das opcoes a baixo                  |\n"
				+ "|                                                                 |\n"
				+ "|                          1 - soma                               |\n"
				+ "|                          2 - Subitacao                          |\n"
				+ "|                          3 - multiplicação                      |\n"
				+ "|                          4 - divisao                            |\n"
				+ "|_________________________________________________________________|\n");
		String opcaoMenu[] = {"1","2","3","4"};
		boolean opcaoValida = false;
		
		while(opcaoValida != true){
			
		Scanner ler = new Scanner(System.in);
		escolhaMenu = ler.nextLine();
		
			for(int i = 0; i <= opcaoMenu.length; i++) {
			
				if(escolhaMenu.equals(opcaoMenu[i])) {
				opcaoValida = true;
				number = Integer.parseInt(escolhaMenu);		
				break;
				}
					if(i == 3) {
						System.out.println(""
						 + "+-----------------------------------------------------------+ \n"
						 + "|                                                           | \n"
						 + "|                    Opcao Invalida                         | \n"
						 + "|                                                           | \n"
						 + "|               Escolha um dos numeros Acima				| \n"
						 + "|       Que representa as opção disponiveis no sistema   	| \n"
						 + "|                                                           | \n"
						 + "+-----------------------------------------------------------+ \n");
						
						break;
					}
			}	
		}
	
	}
}