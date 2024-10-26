package ASC2;
import java.util.Scanner;
public class ASC2 {
	public static void main(String[] args) {
		String asciistr;
		int i = 0, choice;
		char convert;
		Scanner sc= new Scanner(System.in);
		Scanner asc= new Scanner(System.in);
		System.out.print("Escolha o tipo de conversão "
				+"\n 1 - String para ASCII"
				+"\n 2 - ASCII para String"
				+"\n Opção: ");
		choice=sc.nextInt();
		if (choice == 1 ) {
			//O usuario vai digitar o valor 1 para converter de String para ASCII
			System.out.print("Escreva: ");
			asciistr = asc.nextLine();
			
			while(i < asciistr.length())
				/*."length" vai contar o número de caracteres da sua string e "enquanto" (While) for maior que 0
				que é o valor de "i", ele vai ler todos os caracteres do usuário*/
		{
			System.out.println("O valor escrito " + asciistr.charAt(i) +
					" corresponde ao caractere = " + asciistr.codePointAt(i));
			i++;
		}
		} else {
			if (choice == 2) {
				//O usuario vai digitar o valor 2 para converter de ASCII para String
				System.out.print("Digite o valor em ASCII: ");
				convert = (char)sc.nextInt();
				System.out.print("O valor em String é: "+convert);
				
				sc.close();
				asc.close();
				/*O código não funcionava com uma leitura de Scanner para as duas opções, eu testei criar um segundo scanner "asc"
				 *  na opção 1, o sistema não lia meu teclado*/
			
				}
			}
		}
	}



