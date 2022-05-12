import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercício {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		List<String> nomes = new ArrayList<>();

		for (int i = 0; i < 4; i++) {

			System.out.println("Entre com os nomes: ");
			name = sc.nextLine();
			nomes.add(name);
		}

		for (String nome : nomes) {
			System.out.println(nome);

		}

		List<String> resultadoGerado = nomes.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
		System.out.println("-------------------------");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("-------------------------");
		resultadoGerado.removeIf(x -> x.length() < 5);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		sc.close();
	}

}
