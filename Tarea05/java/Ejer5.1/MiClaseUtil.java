public class MiClaseUtil{
// Se hace una sobrecarga del método Max(), el cual regresa
// el valor máximo de un arreglo de números. La sobrecarga se
// lleva a cabo por que se quiere poder admitir arreglos con
// todos los valores de tipo numéricos que existen en java.
// Los métodos se define como public y static para que pueda ser llamado
// desde alguna otra clase sin tener que hacer una instancia default:
// 	la calse MiClaseUtil. 

	public static int Max(int [] array){
        int maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

	public static short Max(short [] array){
        short maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

	public static byte Max(byte [] array){
        byte maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

	public static long Max(long [] array){
        long maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

	public static float Max(float [] array){
        float maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

	public static double Max(double [] array){
        double maximo = array[0];
         
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo)
                maximo = array[i];      
        }
        return maximo;
	}

}
