package LPA.Lacos_De_Repeticao;
import java.util.Scanner;
public class Questao05 {

	public static void main(String[] args) {
	Scanner blob = new Scanner (System.in);
	float quilos;
	int dias;
			System.out.print("Quanto de comida tens a oferecer a blob?"
			+ "\n=");
			quilos = blob.nextFloat();
	
for (dias = 0; quilos >= 1; quilos --) {
	quilos = quilos /2;
	dias = dias+1;
	System.out.print("\nOs "+quilos+" da comida duraram "+dias+" dias");
	blob.close();
}
			
	}

}
