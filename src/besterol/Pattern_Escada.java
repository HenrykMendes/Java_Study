package besterol;

public class Pattern_Escada {
	

	public static void main(String[] args) {

		int n = 5;
		for (int contI = 1; contI <= n; contI++) {
			//"ContI" é igual a 1, quando ele compara e vê que é
			//menor que "n", ele se torna 2 e entra no segundo "for"
			for (int contJ = 1; contJ <= contI; contJ++) {
				System.out.print("*");
			/*"ContJ" = 1, Já que "ContI" é 2 e ContJ é menor que ContI
			 * ele vai entrar no laço e exibir o asterisco.
			 * No proximo, o processo se repete, agora "ContI" é 3 e entrando no "ContJ"
			 * Ele vai ser 2, o processo vai se repetir até "contI" ser igual a 5
			 */
			}
			System.out.println();
		}
	}
}