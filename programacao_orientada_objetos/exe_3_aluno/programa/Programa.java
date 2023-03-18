package programa;

import java.util.Scanner;
import java.util.Locale;

import entidades.aluno;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		aluno notaAluno = new aluno();
		
		System.out.println("Digite as notas do 1º semestre: ");
		notaAluno.nota1Mes = sc.nextDouble();
		notaAluno.nota2Mes = sc.nextDouble();
		notaAluno.nota3Mes = sc.nextDouble();
		System.out.print(notaAluno);
		notaAluno.status();
		
		System.out.println("\nDigite as notas do 2º semestre: ");
		notaAluno.nota1Mes = sc.nextDouble();
		notaAluno.nota2Mes = sc.nextDouble();
		notaAluno.nota3Mes = sc.nextDouble();
		System.out.print(notaAluno);
		notaAluno.status();
		
		sc.close();
		
	}

}
