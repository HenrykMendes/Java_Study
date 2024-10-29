package lpa.vetores.TreinoDeVetores;

import java.util.Scanner;

public class IgualdadeDeVetores{
public static void main (String []args){
    Scanner sc = new Scanner(System.in);
int vetorA[] = new int[5];
int vetorB[] = new int[5];
int i;

for (i = 0;i<5;i++){
    System.out.print("Digite o "+i+"º: ");
    vetorA[i] = sc.nextInt();
        }
for (i = 0; i <vetorA.length;i++){
    vetorB[i] = vetorA[i];
   
}
System.out.println(vetorA[i]);
System.out.println(vetorB[i]);

sc.close();
    }
}
/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os t'mesrnos" elementos do vetor A, ou
seja, B[il = Ali]. */