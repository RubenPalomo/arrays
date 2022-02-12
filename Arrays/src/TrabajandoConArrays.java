import java.util.Arrays;
import java.util.Scanner;

public class TrabajandoConArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner(System.in);
		int[] array = new int[10];
		String option = "";
		int i;
		boolean err = false;

		System.out.print("Bienvenido a 'Trabajando con Arrays'");

		do {

			System.out.println("\nSi desea añadir los valores del array manualmente pulse 'M'. Si prefiere valores automáticos pulse 'A'. Para salir escriba 'EXIT'");
			option = entradaDatos.next().toLowerCase();

			switch (option) {
			case ("m"):
				for (i = 0; i < array.length; i++) {
					System.out.print("Por favor, introduzca el valor para la posición " + i + " del array: ");

					try {
						array[i] = entradaDatos.nextInt();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.print("Introduzca un valor numérico.");
						entradaDatos.next();
						err = true;
						break;
					}
				}

				if (err) {
					err = false;
					break;
				} else {
					System.out.print("Valores del array: ");
					for (i = 0; i < array.length; i++) {
						System.out.print(array[i] + " ");
					}

					System.out.print("\nValores ordenados: ");
					Arrays.sort(array);
					for (i = 0; i < array.length; i++) {
						System.out.print(array[i] + " ");
					}
				}
				break;

			case ("a"):
				for (i = 0; i < array.length; i++) {
					array[i] = (int) (Math.random() * 100);
				}
				System.out.print("Valores del array: ");
				for (i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				System.out.print("\nValores ordenados: ");
				Arrays.sort(array);
				for (i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				break;
			case ("exit"):
				System.out.println("Gracias por usar este programa.\nHecho por Rubén Palomo Fontán");
				break;
			default:
				System.err.print("Introduzca un valor correcto.");
			}

		} while (!option.equals("exit"));
	}
}