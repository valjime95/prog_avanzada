public class Arbol{

	private String tipo;
	public double altura;

	public Arbol(){
		this.tipo = "Genérico";
	}

	public Arbol(String tipo){
		this.tipo = tipo;
	}

	public Arbol(double altura){
		this.altura = altura;
	}

	public Arbol(String tipo, double altura){
		this.tipo = tipo;
		this.altura = altura;
	}

	public void imprimirDescripcion(){
		System.out.println("Este es un árbol de tipo " + tipo + " que mide " + altura + " metros");
	}


}
