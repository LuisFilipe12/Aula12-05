import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Luan");
		nomes.add("José");
		nomes.add("Guilherme");
		nomes.add("Gustavo");
		nomes.add("João");
		nomes.add("Júlia");
		nomes.add(1, "Clariana");
		nomes.add("Ana");
		nomes.add("Ju");

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("Tamanho da lista: " + nomes.size());

		String dado = nomes.stream().filter(x -> x.length() > 6).findFirst().orElse(null);
		System.out.println("Dado buscado: " + dado);

		System.out.println(nomes.indexOf("José"));
		System.out.println(nomes.indexOf("jos"));

		List<String> resultadoObtido = nomes.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
		System.out.println("-------------------------");
		for (String resultado : resultadoObtido) {
			System.out.println(resultado);

		}

		resultadoObtido.remove(1);
		for (String resultado : resultadoObtido) {
			System.out.println(resultado);
		}
	}
}
