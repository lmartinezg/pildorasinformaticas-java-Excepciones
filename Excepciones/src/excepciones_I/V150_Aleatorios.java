// Referencias:
//
// Vídeo: 150 - El debugger de eclipse
//

package excepciones_I;

import javax.swing.JOptionPane;

public class V150_Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz:"));
		int num_aleat[] = new int[elementos];
		for (int i = 0; i < num_aleat.length; i++) {
			// Falla al no haber puesto los paréntesis. El cast se hace solo
			// sobre Math.random()
			// num_aleat[i] = (int) Math.random() * 100;
			// Se añaden los paréntesis para que el cast sea sobre toda la
			// operqación
			num_aleat[i] = (int) (Math.random() * 100);
		}
		for (int elem : num_aleat) {
			System.out.println(elem);
		}
	}

}
