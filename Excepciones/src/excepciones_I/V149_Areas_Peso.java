// Referencias:
//
// Vídeo 149 - Clausula finally
//
// Método Scanner.close() para liberar recursos.
// Clausula finally{} en bloques try/catch para código que se tenga que ejecutar siempre

package excepciones_I;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class V149_Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lado, base, altura, radio;

		// -------------------------------------------------------------------
		// Tarea 1 - Calcular áreas

		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opción:\n 1: Cuadrado\n 2: Rectángulo\n 3: Triángulo\n 4: Círculo");

		try {
			figura = entrada.nextInt();
			// El close() solo se ejecutaría si no hay excepción, pero si la hay
			// no se ejecutaría y el Scanner se quedaría abierto.
			// entrada.close();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error.");
		} finally {
			// Al pasar el close() al finally, el close() se ejecutará siempre.
			entrada.close();
		}

		switch (figura) {
		case 1:
			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
			System.out.println("El área del rectángulo es: " + base * altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
			System.out.println("El área del triángulo es: " + base * altura / 2);
			break;
		case 4:
			radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
			System.out.println("El área del círculo es: " + 2 * Math.PI * radio);
			break;
		default:
			System.out.println("La opción no es correcta.");
		}

		// -------------------------------------------------------------------
		// Tarea 2 - Calcular peso

		altura = Integer.parseInt((JOptionPane.showInputDialog("Introduce tu altura en cm.")));
		System.out.println("Si eres hombre, tu peso ideal es: " + (altura - 110) + "Kg.");
		System.out.println("Si eres MUJER, tu peso ideal es: " + (altura - 120) + "Kg.");

	}

	static int figura;
}
