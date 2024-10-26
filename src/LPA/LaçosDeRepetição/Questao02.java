package LPA.Lacos_De_Repeticao;
import java.util.Scanner;
public class Questao02 {

	public static void main (String []args) {
		Scanner palindromo = new Scanner (System.in) ;
	float num1, valor_original, valor_oposto = 0, resultado;
	
	System.out.print("Isso irá analisar para saber se o número inteiro "
			+ "é um palindromo (se ele é igual de traz para frente)"
			+ "\nDigite um valor inteiro: ");
			num1 = palindromo.nextFloat();
			valor_original = num1;
		
			//do {
				resultado = num1 / 10;
				valor_oposto =  (valor_oposto + (resultado*10));
				//num1 = num1/10;
			//}while (num1!=0);
			if (valor_oposto == valor_original) {
				  System.out.print ("o número "+valor_original+" é um palindromo");
			}else
				  System.out.print ("o número "+valor_original+" não é um palindromo");

			palindromo.close();
			}
	}


