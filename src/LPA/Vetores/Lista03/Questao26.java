package Lista03;

import java.util.Scanner;
@SuppressWarnings ("all")//sc.close();
public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int [10];
        int vetorB[] = new int [10];
        int vetorC[] = new int [10];
        byte a,b,c;
        for (a = 0; a<10;a++){
            System.out.print((a+1)+"º valorA: ");
            vetorA[a] = sc.nextInt();
        }
        for (b = 0; b<10;b++){
            System.out.print((b+1)+"º valorB: ");
            vetorB[b] = sc.nextInt();
        }
        for (c = 0; c<10;c++){
            System.out.print((c+1)+"º valorC: ");
            vetorC[c] = sc.nextInt();
        }
for (a=0;a<10;a++){
    boolean armazenados =false;
    for (b=0;b<10;b++){
        for(c=0;c<10;c++){
            if (vetorA[a] == vetorC[c]) {
                    armazenados = true;
        }
    }
    if (!armazenados) {
        System.out.print(vetorA[c]);
                }
            }       
        }
  sc.close();  }
}
/*)Escrever um algoritmo que lê 3 vetores A[1..10], c[1.10] e C[1..10] e escreve os elementos 
que estão em A e B (interseção) mas não estão em C. Escreva os valores na ordem em que eles 
aparecem no vetor A. Os três vetores devem ser lidos separadamente (em primeiro lugar, todo 
o vetor A, após, o vetor B e por fim o vetor C). */