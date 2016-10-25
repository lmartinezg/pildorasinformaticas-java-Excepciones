// Referencias:
//
// Vídeo 147.- Excepciones propias
//
// Crear clase con la excepción heredando de las standard,
// con dos constructores, uno sin parámetros
// y otro con un parámetro tipo String para el mensaje de error
//
// Método e.printStackTrace()

package excepciones_I;

import javax.swing.JOptionPane;

public class V147_Comprueba_Mail_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = JOptionPane.showInputDialog("Introduce mail");

		try {
			examina_mail(mail);
		} catch (Longitud_mail_erronea e) {
			System.out.println("La dirección no es correcta.");
			e.printStackTrace();
		}

	}

	// static void examina_mail(String mail) throws
	// ArrayIndexOutOfBoundsException {
	static void examina_mail(String mail) throws Longitud_mail_erronea {

		int arroba = 0;
		boolean punto = false;

		if (mail.length() <= 3) {
			// Aunque no tenga nada que ver, se utiliza esta excepción para el
			// ejemplo
			// ArrayIndexOutOfBoundsException mi_excepcion = new
			// ArrayIndexOutOfBoundsException();
			// throw mi_excepcion;
			// throw new ArrayIndexOutOfBoundsException();
			throw new Longitud_mail_erronea("El mail no puede tener menos de tres caracteres.");
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

class Longitud_mail_erronea extends Exception {
	// class Longitud_mail_erronea extends RuntimeException {
	public Longitud_mail_erronea() {
		super();
	}

	public Longitud_mail_erronea(String msg_error) {
		super(msg_error);
	}
}