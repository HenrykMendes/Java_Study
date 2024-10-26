package LPA.Lacos_De_Repeticao;
import java.util.Scanner;
public class Questao03 {


public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numero1, i;
			System.out.print("digite: ");
			numero1 = sc.nextInt();
			
			for (i = 0; numero1 >= i; i++) {
				if (i %2 == 0) {
				System.out.print("\n Números pares até o número solicitado: "+i);
				sc.close();
				}
			}


	}

}
