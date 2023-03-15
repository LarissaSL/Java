package funcoes_com_strings;

public class strings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG  ";

		// letras Minusculas
		String s01 = original.toLowerCase();
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);

		// letras maiusculas
		s01 = original.toUpperCase();
		System.out.println("\nOriginal: " + original);
		System.out.println("toUpperCase: " + s01);

		// letras Elimina espaços nos cantos
		s01 = original.trim();
		System.out.println("\nOriginal: " + original);
		System.out.println("trim: " + s01);

		// letras Pegar caractere da Posição em Diante
		s01 = original.substring(2);
		System.out.println("\nOriginal: " + original);
		System.out.println("substring(2): " + s01);

		// letras Pegar caractere da Posição até outra posição
		s01 = original.substring(2, 9);
		System.out.println("\nOriginal: " + original);
		System.out.println("substring(2,9): " + s01);

		// letras substituir letra por outra
		s01 = original.replace('a', 'x');
		System.out.println("\nOriginal: " + original);
		System.out.println("replace('a','x'): " + s01);

		// letras substituir letra por outra
		int s02 = original.indexOf("bc");
		int s03 = original.lastIndexOf("bc");
		System.out.println("\nOriginal: " + original);
		System.out.println("indexOf('bc'): " + s02);
		System.out.println("lastIndexOf('bc'): " + s03);
		
		/* Gera um vetor com as partes do Strings de acordo com o
		separador informado*/
		
		String s = "teste do split";
		
		String [] vetor = s.split(" ");
		String p1 = vetor[0];
		String p2 = vetor[1];
		String p3 = vetor[2];
		
		System.out.printf("%n%s %s %s",vetor[0], vetor[1], vetor[2]);

	}

}
