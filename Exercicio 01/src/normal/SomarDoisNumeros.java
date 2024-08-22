package normal;
import java.util.Scanner;

class SomarDoisNumeros {

	public static void main(String[] args) {
		//Declaração do Scanner		
		Scanner sc = new Scanner(System.in);
		//Declaração das variaveis		
		int numero1, numero2, soma;
		//Solicitar e adquirir os dois numeros que precisam ser somados
		System.out.println("Digite dois números inteiros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		//Soma dos algoritmos
		soma = numero1 + numero2;
		//Mostrar o resultado
		System.out.println("Soma:" + soma);
		sc.close();
	}

	@Override
	public String toString() {
		return "SomarDoisNumeros []";
	}

}
