package excepciones_I;

import javax.swing.JOptionPane;

public class V145_Comprueba_Mail_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = JOptionPane.showInputDialog("Introduce mail");

		try {
			examina_mail(mail);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La dirección no es correcta.");
		}
	}

	static void examina_mail(String mail) throws ArrayIndexOutOfBoundsException {

		int arroba = 0;
		boolean punto = false;

		if (mail.length() <= 3) {
			// Aunque no tenga nada que ver, se utiliza esta excepción para el
			// ejemplo
			// ArrayIndexOutOfBoundsException mi_excepcion = new
			// ArrayIndexOutOfBoundsException();
			// throw mi_excepcion;
			throw new ArrayIndexOutOfBoundsException();

		} else {
			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba++;
				}
				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}
			if (arroba == 1 && punto) {
				System.out.println("El mail es correcto");
			} else {
				System.out.println("El mail no es correcto");
			}
		}
	}
}
