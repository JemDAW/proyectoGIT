/*
*@author Jemima Molina Esteve
*/
import java.util.Scanner;
public class Switch
{

public static void main(String [] args)
{

	Scanner input = new Scanner (System.in);

	System.out.println("Introduce el primer número, por favor: ");

	int numero1= input.nextInt();

	System.out.println("Introduce el segundo número, por favor: ");

	int numero2= input.nextInt();

	System.out.println(" 1: sumar\n 2: restar\n 3: multiplicar\n 4: dividir\n Cualquier otra opción es incorrecta.\n ¿Qué operación quieres hacer?: ");

	int operacion= input.nextInt();


	switch(operacion){
		case 1:
		System.out.println(numero1+numero2);
		break;
		case 2:
		System.out.println(numero1-numero2);
		break;
		case 3:
		System.out.println(numero1*numero2);
		break;
		case 4:
		System.out.println(numero1/numero2);
		break;
		default:
		System.out.println("Opción incorrecta.");
	}


	}
}