// Referencias:
//
// Vídeo 142.- Excepciones

package excepciones_I;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class V142_Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		metodo1();
		metodo2();
		metodo3();
	}

	static void metodo1() {
		int[] mi_matriz = new int[5];

		mi_matriz[0] = 5;
		mi_matriz[1] = 30;
		mi_matriz[2] = 25;
		mi_matriz[3] = 7;
		mi_matriz[4] = 9;
		// Error en tiempo de ejecución (más de 5 valores en la matriz)
		// Error de la clase: java.lang.ArrayIndexOutOfBoundsException
//		mi_matriz[5] = 25;

		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Posición: " + i + " = " + mi_matriz[i]);
		}

	}

	static void metodo2() {

		// Petición de datos personales

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));

		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
		System.out.println("Fin de ejecución del programa.");

	}

	static void metodo3() {

		Image imagen;

		// Manejo de excepción IO por archivo no encontrado.
		// Es obligatoriom el bloque try/cath para los errores IOException 
		try {
			imagen = ImageIO.read(new File("src/recursos/circ.gif"));

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Archivo de imagen no encontrado.");
		}
	}

}
