package lpa.vetores.TestesDeVetores;
import java.util.Arrays;
import java.util.Scanner;
public class Questao55 {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
int i,j;
int vetor [] = new int[10];
System.out.println("O valor das cartas deve ser entre 1 e 13");
    for(i=0;i<13;i++){
        System.out.println("\nvalor "+(i+1)+" de cartas: ");
        vetor[i] = sc.nextInt();
        if (vetor[i]>13) {
            System.out.print("Valor fora da margem aceitavel");
            }
        }
            for(j = 0;j<10;j++){
                System.out.print("Escolher "+(j+1)+"º nipe"
                +"1- Ouros;"
                +"2- Copas;"
                +"3- Paus;"
                +"4- Espadas;"
                +": ");
                vetor[j] = sc.nextInt();
            }
for(i=0;i<10;i++){
    int OrdemDeNipe=0;
    int OrdemDeValor=0;

        }
    }    
}