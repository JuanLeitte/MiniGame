package program;

import java.util.*;

public class regrasDoJogo {

	public static Scanner scan = new Scanner(System.in);

	public static void regras() {
		String opc;
		print("As regras b�sicas do jogo s�o: \r\t");

		print("Voc� deve escolher um n�mero entre 1 e 10;");
		print("Durante o jogo, caso escolha o n�mero '0' o jogo ser� encerrado;");
		print("� permido apenas digitar n�meros;");
		print("\r\tMuito Obrigado pela preferencia, Divirta-se");
		while (true) {
			print("\t\r\rAperte '0' para finalizar");
			print("Aperte '1' para jogar");
			print("Aperte '2' para retornar ao menu principal");

			opc = scan.next();

			switch (opc) {
			case "0":
				print("GAME OVER !!");
				System.exit(0);

			case "1":
				print("Bom jogo !!");
				program.execute.jogarOJogo();
				break;

			case "2":
				print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				return;
			}
		}
	}

	public static void print(String message) {
		System.out.println(message);
	}
}
