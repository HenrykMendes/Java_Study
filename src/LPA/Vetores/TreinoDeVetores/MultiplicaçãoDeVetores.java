package TreinoDeVetores;
import java.util.Scanner;
@SuppressWarnings ("all")
public class MultiplicaçãoDeVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorA []= new int [8];
        int vetorB []= new int [8];
        int i;
for ( i=0;i<8;i++){
    //Digite 08 valores inteiros
        System.out.print("Digite o "+(i)+" valor: ");
        vetorA [i] = sc.nextInt();
        vetorB[i] =vetorB[i]*2;
}
//para cada valor no cumprimento de vetorA, ou seja 08, i++
for (i = 0;i<vetorA.length;i++){
    vetorB[i] = vetorA[i]*2;
}
//para cada vez que fizer um loop, a variavel "valor" atualiza seu valor com o valor do vetor "vetorB"
for (int valor : vetorB){
System.out.print("\n"+valor);
}

/*for (int mult : vetorA){
mult=mult*2;
System.out.println(mult);/*/

}
    }

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = Ali] + 2, */