import java.util.Scanner;

public class main {
	
	interface InterfazCalculadora<T>{
		public T calcular(T a, T b);
	}

	public static void main(String[] args) {
		
		new main().menu();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		int eleccion = sc.nextInt();
		
		switch (eleccion) {
		case 1:
			System.out.println("Introduce los numeros a sumar");
			InterfazCalculadora<Integer> suma = (n1, n2) -> n1 + n2;
			sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			op = suma.calcular(a, b);
			System.out.println("El resultado es: " + op);
			break;
		
		case 2:
			System.out.println("Introduce los numeros a restar");
			InterfazCalculadora<Integer> resta = (n1, n2) -> n1 - n2;
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			op = resta.calcular(a, b);
			System.out.println("El resultado es: " + op);
			break;
			
		case 3:
			System.out.println("Introduce los numeros a multiplicar");
			InterfazCalculadora<Integer> mul = (n1, n2) -> n1 * n2;
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			op = mul.calcular(a, b);
			System.out.println("El resultado es: " + op);
			break;
		
		case 4:
			System.out.println("Introduce los numeros a dividir");
			InterfazCalculadora<Integer> div = (n1, n2) -> n1/n2;
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			op = div.calcular(a, b);
			System.out.println("El resultado es: " + op);
			break;
			
		case 5:
			System.out.println("Introduce los numeros para hacer la potencia");
			InterfazCalculadora<Integer> pot = (n1, n2) -> (int) Math.pow(n1.intValue(), n2.intValue());
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			op = pot.calcular(a, b);
			System.out.println("El resultado es " + op);
		}		

	}
	
	private void menu() {
		System.out.println("Elige la operación a que quieres realizar");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Potencia");
	}

}
