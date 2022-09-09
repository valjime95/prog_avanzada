// Ejercicios Arreglos

// Para imprimir el contenido del arreglo
import java.util.Arrays;

public class Arreglos {
	public static void main(String args[]) {
		// Creamos un primer arreglo
		int arregloUno[] = new int[3];
		System.out.println(Arrays.toString(arregloUno));

		// Creamos un segundo arreglo a partir del primero (apuntador)
		int arregloDos[] = arregloUno;
		System.out.println(Arrays.toString(arregloDos));

		// ** Creamos una copia del primero (primera opción)
		int arregloUnoCopia1[] = Arrays.copyOf(arregloUno, 3);

		// ** Creamos una copia (manual) del primero (segunda opción)
		int arregloUnoCopiaManual[] = new int[3];
		for(int i = 0; i < 3; i++){
			arregloUnoCopiaManual[i] = arregloUno[i];
		}
		// Modificamos el arregloUno
		arregloUno[0] = 2;
		arregloUno[1] = 1;
		arregloUno[2] = 0;

		// Imprimimos ambos arreglos
		System.out.println(Arrays.toString(arregloUno));
		System.out.println(Arrays.toString(arregloDos));
		System.out.println(Arrays.toString(arregloUnoCopia1));
		System.out.println(Arrays.toString(arregloUnoCopiaManual));

	}
}