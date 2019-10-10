package school.cesar.q2;
import java.util.Scanner;

public class EquacaoSegundoGrau{

	public double a;
	public double b;
	public double c;
	
	EquacaoSegundoGrau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double[] getRaizes(){
		double[] raizes = new double[2];
		double delta;
		delta = (Math.sqrt(Math.pow(this.b, 2) - 4*this.a*this.c));
		if (delta > 0) {
			raizes[0] = ((-b+delta)/2*a);
			raizes[1] = ((-b-delta)/2*a);
			return(raizes);
		}
		else {
			System.out.println("Erro: Delta menor que 0");
			return(null);
		}
	}
	
	public boolean equals (EquacaoSegundoGrau obj) {
		boolean thetruth = true;
		if (this.a != obj.a) {
			thetruth = false;
		}
		if (this.b != obj.b) {
			thetruth = false;
		}
		if (this.c != obj.c) {
			thetruth = false;
		}
		if (this.getRaizes()[0] != obj.getRaizes()[0]) {
			thetruth = false;
		}
		if (this.getRaizes()[1] != obj.getRaizes()[1]) {
			thetruth = false;
		}
		return(thetruth);
	}
	
	public String toString () {
		String retorno = "a = " + this.a + ", b = " + this.b + ", c = " + this.c + ", raiz1 = " + this.getRaizes()[0] + ", raiz2 = " + this.getRaizes()[1] + ".";
		return(retorno);
	}
	
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.println("Digite o termo a na equacao de segundo grau: ");
		double a = myscan.nextDouble();
		System.out.println("Digite o termo b: ");
		double b = myscan.nextDouble();
		System.out.println("Digite o termo c: ");
		double c = myscan.nextDouble();
		EquacaoSegundoGrau test = new EquacaoSegundoGrau(a, b, c);
		System.out.print(test.toString());
		System.out.printf("\n");
		System.out.println("Digite o termo a na outra equacao de segundo grau: ");
		a = myscan.nextDouble();
		System.out.println("Digite o termo b: ");
		b = myscan.nextDouble();
		System.out.println("Digite o termo c: ");
		c = myscan.nextDouble();
		EquacaoSegundoGrau test2 = new EquacaoSegundoGrau(a, b, c);
		System.out.print(test2.toString());
		System.out.printf("\n");
		if (test.equals(test2)) {
			System.out.println("Sao iguais");
		}
		else {
			System.out.println("Nao sao iguais");
		}
		myscan.close();
	}

}
