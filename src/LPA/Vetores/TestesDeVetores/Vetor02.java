package lpa.vetores.TestesDeVetores;
import java.util.Arrays;

public interface Vetor02 {
 
    

public static void main(String[] args) {
   /* String mes[] = {"Jan", "Fev","Mar","Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    int Dias[] = {31,29,31,30,31,30,31,31,30,31,30,31};
    int i;
    for (i=0; i<mes.length; i++){
    System.out.println(mes[i] +" " + Dias[i]);*/


int v[] = {9,8,7,6,5,4,3,2,1};
Arrays.sort(v);
for (int cont: v){
    System.out.println(cont+" ");

        }
    }
}


