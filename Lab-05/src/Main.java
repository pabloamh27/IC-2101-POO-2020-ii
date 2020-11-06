import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner consola = new Scanner(System.in);
		JSONparser parser = new JSONparser();
		Controlador controlador = parser.cargarAparatos();
		String respuesta = "";
		
		//Menu
		while (respuesta.equals("salir") == false) {
			System.out.println("\nBienvenid@ a su casa inteligente, ingrese 'salir' para salir del menu. "
					+ "\nDesea 1.encender o 2.apagar? \n");
			respuesta = consola.next();
			//Validador de salir para ahorrar memoria y no correr todo el programa.
			if (respuesta.equals("salir")) {
				break;
			}
			//Enciende el dispositivo
			else if (respuesta.equals("1")) {
				System.out.println("\nQue dispositivo desea encender?: \n" + controlador);
				respuesta = consola.next();
				if (respuesta.equals("salir")) {
					break;
				}
				int idseleccionado = Integer.parseInt(respuesta);
				if (controlador.get(idseleccionado-1) == null) {
					System.out.println("Ingrese un numero valido!");
				}
				controlador.get(idseleccionado-1).encender();
			}
			//Apaga el dispositivo
			else if (respuesta.equals("2")) {
				System.out.println("\nQue dispositivo desea apagar?: \n" + controlador);
				respuesta = consola.next();
				if (respuesta.equals("salir")) {
					break;
				}
				int idseleccionado = Integer.parseInt(respuesta);
				if (controlador.get(idseleccionado-1) == null) {
					System.out.println("Ingrese un numero valido!");
				}
				controlador.get(idseleccionado-1).apagar();
			}
			else {
				System.out.println("Ingrese un numero valido!");
			}
	
		}
		
	}

}
