// importamos la bibliteca Math para poder usar la función de raíz cuadrada con el fin de calcular el area usando la fórmula de Horn.
import java.lang.Math;

public class Triangulo{

	protected float lado1, lado2, lado3; 

	public Triangulo(float lado1,float lado2,float lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo(float lado1){
		this.lado1 = lado1;
		this.lado2 = lado1;
		this.lado3 = lado1;
	}

	public Triangulo(float lado1,float lado2){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado2;
	}

	protected double calcularArea(){
		// formula de heron
	float s = (lado1+lado2+lado3)/2;
	double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
	return area;
	}

	protected float calcularPerimetro(){
		return lado1 + lado2 + lado3;
	}

	protected void imprimirLados(){
		System.out.printf("[%.2f, %.2f, %.2f]",lado1,lado2,lado3);
	}
}