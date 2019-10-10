package school.cesar.q1.domain;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
	public int [][] arraydearrays;
	
	private Random generator = new Random();
	
	public Matriz(int unik){
		arraydearrays = new int[unik][unik];
		for (int i = 0; i < unik; i++) {
			for (int j = 0; j < unik; j++) {
				arraydearrays[i][j] = generator.nextInt(101);
			}
		}
		
	}
	
	public Matriz(int lin, int col){
		arraydearrays = new int[lin][col];
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				arraydearrays[i][j] = generator.nextInt(101);
			}
		}
	}
	
	public int[] getDiagonal(){
		if (arraydearrays.length == arraydearrays[0].length){
			int[] retorno;
			retorno = new int[arraydearrays.length];
			for (int i = 0; i < arraydearrays.length; i++){
				retorno[i] = arraydearrays[i][i];
			}
			return(retorno);
		}
		else {
			System.out.println("Erro: a Matriz nao eh quadrada");
			int[] mensagemDeErro;
			mensagemDeErro = new int[arraydearrays.length];
			for (int i = 0; i < arraydearrays.length; i++){
				mensagemDeErro[i] = 0;
			}
			return(mensagemDeErro);
		}
	}
	
	public void imprimir(){
		for (int i = 0; i < arraydearrays.length; i++) {
			for (int j = 0; j < arraydearrays[0].length; j++) {
			System.out.printf("%d, ", arraydearrays[i][j]);	
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Criando e operando uma matriz randomizada");
		Scanner myscan = new Scanner(System.in);
		System.out.println("Digite o numero de linhas da matriz: ");
		int lin = myscan.nextInt();
		System.out.println("Digite o numero de colunas da matriz: ");
		int col = myscan.nextInt();
		myscan.close();
		Matriz sub = new Matriz(lin, col);
		System.out.println("A matriz criada eh: ");
		sub.imprimir();
		System.out.println("A diagonal principal da matriz criada eh: ");
		int [] diagonaru = sub.getDiagonal();
		for (int i = 0; i < diagonaru.length; i++) {
			System.out.printf("%d, ", diagonaru[i]);
		}
	}
	
}
