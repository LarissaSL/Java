package retangulo;

import java.util.Scanner;
import java.util.Locale;
import entidades.retangulo;


public class programa {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
		
	Scanner sc = new Scanner (System.in);
	
	retangulo retan = new retangulo();
	
	System.out.println("Cadastrar Retângulo, digite a Largura e Altura: ");
	retan.altura = sc.nextDouble();
	retan.largura = sc.nextDouble();
	sc.close();
	
	System.out.printf("%nArea = %.2f%n" , retan.area());
	System.out.printf("Perímetro = %.2f%n" , retan.perimetro());
	System.out.printf("Diagonal = %.2f" , retan.diagonal());
	
	}

}
