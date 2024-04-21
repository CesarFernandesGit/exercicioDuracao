import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, segundos, minutos, horas, resto;

		System.out.print("Digite a duração em segundos: ");
		tempo = sc.nextInt();

		horas = (tempo / 3600);
		resto = (tempo % 3600);

		minutos = (resto / 60);
		segundos = (resto % 60);

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}

}
