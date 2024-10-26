

package LPA.Lacos_De_Repeticao;
import java.util.Scanner;
public class Questao09 {
	public static void main (String []args) {
Scanner fatorar = new Scanner (System.in);
int num1, fat = 1, cont;

	System.out.print("Digite um número: ");
	num1 = fatorar.nextInt();
		if (num1 == 0) {
			System.out.print("1");
				}else if(num1 ==1){
					System.out.print("1");
						}else
							for (cont = 1; cont<=num1; cont++) {
								fat = fat*cont;
								System.out.print("\nO valor da fatoração de "+num1+" na posição "+cont+" é "+fat);
fatorar.close();	
}
		

	
}
}