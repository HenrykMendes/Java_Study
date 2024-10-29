package lpa.vetores.TreinoDeVetores;
import java.util.Scanner;
@SuppressWarnings ("all")
public class vetoraoquadrado {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vetorA[] = new int [5];
    int vetorB[] = new int [5];
    int i;
    
for (i = 0;i<5;i++){
    System.out.print ("Digite "+i+"º número: ");
    vetorA[i]= sc.nextInt();
    }
    for (i = 0; i<vetorA.length;i++){
        vetorB[i] = vetorA[i] * vetorA[i]; 
    }
        for (int quadrado : vetorB){
        System.out.println(quadrado);
    }
  }
}
/*3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = Ali] Ali]. */