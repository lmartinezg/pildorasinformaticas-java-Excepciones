package excepciones_I;

import javax.swing.JOptionPane;

public class V148_Varias_excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("No se permite dividir por cero.");
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un número entero.");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getClass():   " + e.getClass());
			System.out.println("getName():    " + e.getClass().getName());
		}

	}

	static void division() {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor:"));
		System.out.println("El resultado es: " + num1 / num2);
	}

}
