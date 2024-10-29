package lpa.laços_de_repetição;
import java.util.Scanner;
public class Questao07 {

	public static void main(String[] args) {
		Scanner menor = new Scanner (System.in);
		int numero1, menorvalor = 999999999;
		
		
		do {
			System.out.print("Digite quaisquer número e 42 para parar: ");
			numero1 = menor.nextInt();
	
			if (numero1 < menorvalor) {
				menorvalor = numero1;
			}
		}while (numero1 != 42);
	
		
			
		System.out.print("O menor número digitado foi: "+menorvalor);	
		menor.close();
	}
		

	}


