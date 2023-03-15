package Atividade;

public class Fatorial {
	
	public static void main(String [] args) {
		int n = 5;
		System.out.println("Fatorial de " +n+ ": " + fatorial(n));		
	}
	
	public static int fatorial(int numero) {
		if(numero == 1) {
			return 1;
		}
		else {
			return numero * fatorial(numero - 1);
		}
	}
}
