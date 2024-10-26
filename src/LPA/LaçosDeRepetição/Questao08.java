package LPA.Lacos_De_Repeticao;
import java.util.Scanner;
public class Questao08 {

	public static void main(String[] args) {
  Scanner fibo = new Scanner (System.in);
  int num1 = 0,num2 = 1,num3, digite, cont = 2;
  
  do {
  System.out.print ("Digite o enesimo termo: ");
  digite = fibo.nextInt();
  }while (digite < 1);
  
  if (digite == 1) {
	  
	  System.out.print ("0");
	  
  }else {
	  if (digite == 2) {
		  System.out.print ("1");
	  }else {
		  while  (cont < digite){
		  num3 = num1 + num2;
		  num1 = num2;
		  num2 = num3;
		  cont++;
		  System.out.print("\nO "+digite+"° termo da sequencia é: "+num3+"");
		  		}
	  		}
	  fibo.close();
  		} 
	}
}
