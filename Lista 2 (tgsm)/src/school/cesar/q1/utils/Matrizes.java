package school.cesar.q1.utils;
import school.cesar.q1.domain.Matriz;
import java.util.Scanner;


public class Matrizes {
	
	public static Matriz multiplicar (Matriz uno, Matriz dos){
		if (uno.arraydearrays[0].length == dos.arraydearrays.length) {
			int storage = 0;
			int[][] resultado;
			resultado = new int[uno.arraydearrays.length][dos.arraydearrays[0].length];
			for (int i = 0; i < uno.arraydearrays.length; i++){
				for (int j = 0; j < dos.arraydearrays[0].length; j++){
					for (int k = 0; k < dos.arraydearrays.length; k++){
						storage = storage + (uno.arraydearrays[i][k] * dos.arraydearrays[k][j]);
					}
					resultado[i][j] = storage;
					storage = 0;
				}
			}
			Matriz retorno = new Matriz(uno.arraydearrays.length, dos.arraydearrays[0].length);
			retorno.arraydearrays = resultado;
			return(retorno);
		}
		else {
			System.out.println("Erro: Operacao invalida");
			return(null);
		}
	}

	public static void main(String[] args) {
		System.out.println("Multiplicando duas matrizes");
		Scanner myscan = new Scanner(System.in);
		System.out.println("Digite o numero de linhas da primeira matriz: ");
		int lin1 = myscan.nextInt();
		System.out.println("Digite o numero de colunas da primeira matriz: ");
		int col1 = myscan.nextInt();
		System.out.println("Digite o numero de linhas da segunda matriz: ");
		int lin2 = myscan.nextInt();
		System.out.println("Digite o numero de colunas da segunda matriz: ");
		int col2 = myscan.nextInt();
		myscan.close();
		Matriz m1 = new Matriz(lin1, col1);
		Matriz m2 = new Matriz(lin2, col2);
		System.out.println("As matrizes geradas foram: ");
		m1.imprimir();
		System.out.println("e");
		m2.imprimir();
		Matriz res = multiplicar(m1, m2);
		if (res == null) {
			System.out.println("A operacao falhou. Lembre-se que a multiplicacao so eh possivel se o numero de colunas da primeira matriz for equivalente ao numero de linhas da segunda!");
		}
		else {
			System.out.println("O resultado da multiplicao eh: ");
			res.imprimir();
		}
	}
}
