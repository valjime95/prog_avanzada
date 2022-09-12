public class Perro{
	
	// Se definen las tres variables que se utilizan en la clase
	private String nombre;
	private String raza;
	private double peso;

	public Perro(String nombre){
		this.nombre = nombre;
	}

	public Perro(String nombre, String raza){
		this.nombre = nombre;
		this.raza = raza;
	}

	public Perro(String nombre, String raza, double peso){
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	}

	// método describir que no devuelve nada (void) pero que imprimir en consola el nombre, la raza y el peso del objeto.
	public void describe(){
		System.out.println("Nombre: "+ nombre + "  Raza: " + raza + "  Peso: "+ peso);
	}

	// Método público gerNombre que no recibe parámetros, y que va a devolver un String ---> el nombre del objeto.
	public String getNombre(){
		return nombre;
	}

	// método ladrar que tiene parámetros de entrada y no devulve nada (void) solo manda imprimir la linea en consola y utiliza la varible nombre de cada objeto
	public void ladrar(){
		System.out.println("woof woof ... ("+ nombre +" está ladrando)");
	}
}