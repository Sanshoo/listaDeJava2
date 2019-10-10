package school.cesar.q2;
import java.util.Scanner;

public class EquacaoSegundoGrau{

	private double a;
	private double b;
	private double c;
	
	EquacaoSegundoGrau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double[] getRaizes(){
		double[] raizes = new double[2];
		raizes[0] = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
		raizes[1] = ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
		return(raizes);
	}
	
	public boolean equals (EquacaoSegundoGrau obj) {
		return((this.a == obj.a) && (this.b == obj.b) && (this.c == obj.c) && (this.getRaizes() == obj.getRaizes()));
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
		System.out.println("Digite o termo a na outra equacao de segundo grau: ");
		a = myscan.nextDouble();
		System.out.println("Digite o termo b: ");
		b = myscan.nextDouble();
		System.out.println("Digite o termo c: ");
		c = myscan.nextDouble();
		EquacaoSegundoGrau test2 = new EquacaoSegundoGrau(a, b, c);
		System.out.print(test2.toString());
		if (test.equals(test2)) {
			System.out.println("Sao iguais");
		}
		else {
			System.out.println("Nao sao iguais");
		}
		myscan.close();
	}

}
