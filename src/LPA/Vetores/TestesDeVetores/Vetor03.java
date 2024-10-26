
package TestesDeVetores;
import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("all")
public class Vetor03 {
    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);
        int v[] = new int[5];
        int contador;
    

for (contador = 0; contador < 5;contador++){
    System.out.println("Digite "+contador+" valores inteiros: ");
        v[contador] = ordem.nextInt();
}
    Arrays.sort(v);
        for(int valor: v){
            System.out.println(valor + " ");

}

ordem.close();
}

    }

