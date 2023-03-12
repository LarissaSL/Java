package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class salario_funcionario {

	public static void main(String[] args) {
		
/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double salario, valorHora;
		int horas, num;
		
		//Entrada de Dados
		System.out.println("Digite o Número do Funcionário: ");
		num = sc.nextInt();
		
		System.out.println("Digite as Horas Trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o Valor que ganha por Hora: ");
		valorHora = sc.nextDouble();
		
		sc.close();
		
		//Processamento de Dados
		salario = valorHora * horas;
		
		//Saida de Dados
		System.out.println("Número do Funcionário: " + num);
		System.out.printf("Salário: U$ %.2f", salario );
		
	}

}
