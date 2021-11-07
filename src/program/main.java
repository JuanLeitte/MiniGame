package program;
import java.util.*;

public class main {
	public static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		
		print ("\t\t-=-=-=-=-=BEM VINDO AO JOGO DA SORTE=-=-=-=-=-\r \t\t ");
		while (true) {
			
		print ("--- Digite a opção desejada ---");
		print ("1 - Regras.");
		print ("2 - Jogar.");
		print ("3 - Finalizar jogo.");
		
		String opcao = scan.next();
		
		switch (opcao) {
		case "1":
			program.regrasDoJogo.regras();;
			break;
		case "2":
			program.execute.jogarOJogo();
			break;
		case "3":
			print ("GAME OVER !!");
			System.exit(0);
		default:
			print ("Informe uma opção valida");
			break;
		}
	}
}
	public static void print (String message) {
		System.out.println (message);
	}
	
}
