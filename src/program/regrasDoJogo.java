package program;

import java.util.*;

public class regrasDoJogo {

	public static Scanner scan = new Scanner(System.in);

	public static void regras() {
		String opc;
		print("As regras básicas do jogo são: \r\t");

		print("Você deve escolher um número entre 1 e 10;");
		print("Durante o jogo, caso escolha o número '0' o jogo será encerrado;");
		print("É permido apenas digitar números;");
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
