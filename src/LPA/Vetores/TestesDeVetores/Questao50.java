package Lista04;

import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao50 {
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String candidatoString;
    int votosInt,partido,i, menor = Integer.MIN_VALUE;
    int vetor[]=new int[5]; 

    for (i=0;i<5;i++){
    System.out.print("Digite o "+(1+i)+"º candidato. "
    +"Nome: ");
    candidatoString = sc.nextLine();
        System.out.print("Digite o partido: ");
        partido = sc.nextInt();
            System.out.print("Número de votos: ");
                vetor[i] = sc.nextInt();
        }
        
        for (i=0;i<5;i++){
 {
    menor = vetor[i];
    //Seguindo essa lógica, como vou associar o número de votos com o cadastro?
}
        }
    }
}
/*50)Faça um algoritmo que leia, para 20 candidatos a deputado, seu cadastro, partido (inteiro 
entre 1 e 10) e número de votos, e escreva o cadastro, partido e número de votos do 
candidato mais votado de cada partido,em ordem crescente de partido.  */