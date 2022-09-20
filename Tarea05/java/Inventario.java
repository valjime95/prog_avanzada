public class Inventario{
	// Se crea una variable de tipo entero la cual se inicializa en 100 (dado el ejercicio) siendo static para poderla mandar llamar dentro del método estático otorgarID, el cual va aumentando una unidad la variable ID a medidad que se van creando más objetos.
	public static Integer id = 100;
	public static Integer otorgarId(){
		return id++;
	}
}