package program;

import java.util.Random;
import java.util.Scanner;


//import validationpack.validation;

public class execute {
	
	public static Scanner scan = new Scanner (System.in);
	
		public static void  jogarOJogo() {
		int numJogo;
		
		do {
		Random gerador = new Random();
		numJogo = gerador.nextInt(11);
		}while (numJogo == 0);
		
		print ("\t\t-=-=-=-=-=BEM VINDO AO JOGO DA SORTE=-=-=-=-=");
		
		System.out.println (numJogo);
		String opcao;
		
		String numString = Integer.toString(numJogo);
		
		do {
			print ("Advinhe o número que eu estou pensando: ");
			opcao = scan.next();
			
				if (opcao.matches("[0-9] {0,10}")) {
				
				}else {
					System.out.println("Informe apenas números de 0 á 10");	
					}
			
			if  (opcao.equals("0")) {
			print ("\t\t\rMORTE AOS DESISTENTES \t\r\r Obrigado por jogar :)");
			continue;
			}if (opcao.equals(numString)) {
				print ("Escolha correta, PARABÉNS você advinhou!!");
				print (" -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.exit(0);
				break;
			}if (opcao != numString) {
				print ("\t\rEscolha errada, tente novamente :)\t\r");	
			}
		}while (opcao != "0");
	}
	
	public static void print (String message) {
		System.out.println(message);
	}
}
		
