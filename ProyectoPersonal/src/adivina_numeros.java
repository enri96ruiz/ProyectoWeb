import java.util.Scanner;

import javax.swing.JOptionPane;

public class adivina_numeros {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("Elige una opci�n:\n1:Adivinar la contrase�a"
				+ "\n2Adivinar el n�mero que estoy pensando"
				+ "\n3�Cu�ntos a�os tendr� en... ?"
				+ "\n4:Salir"
				+ "");

		opcion=teclado.nextInt();
		
		switch(opcion) {
		
		case 1:
			String clave="enrique";
			String pass="";
			int intentos1=0;
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("introduce contrase�a");
			if(clave.equals(pass)==false) {
				intentos1++;
				System.out.println("Contrase�a incorrecta");
			}
		}
		System.out.println("");
			System.out.println("Contrase�a correcta!!!");
			System.out.println("enhorabuena has conseguido descifrar la contrase�a"
					+ " en "+intentos1+ " intentos !!!");
			System.out.println("");
			break;
		case 2:
		
		int aleatorio=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		//mientras numero sea diferente de aleatorio
		while (numero!=aleatorio) {
			intentos++;
			System.out.println("�Podr�as averiguar el n�mero que estoy pensando? Introduce "
					+ "un n�mero por favor");
			numero=entrada.nextInt();
			if (aleatorio<numero) {
				System.out.println("numero m�s bajo ");
				}
				else if (aleatorio>numero) {
					System.out.println("numero m�s alto");
				}
			
		}
		System.out.println("correcto lo has conseguido en "+intentos+ " intentos");
		break;
		case 3:
			String nombre=JOptionPane.showInputDialog("Introduzca su nombre, por favor");
			String edad=JOptionPane.showInputDialog("Introduce a�o nacimiento");
			int edadEntero=Integer.parseInt(edad);
			String anio=JOptionPane.showInputDialog("Introduce a�o");
			int anioEntero=Integer.parseInt(anio);
			int edadTotal=anioEntero-edadEntero;
			System.out.println("Tu nombre es "+nombre+" en el a�o "+anioEntero+" tendr�s "+edadTotal+ " a�os");
			break;
		case 4:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("La opci�n no es correcta");
		}
		}while(opcion!=4);
		
	}

}
