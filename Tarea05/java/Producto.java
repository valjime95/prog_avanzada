public class Producto{
	// La clase Producto sólo tendrá un método público( definido así para que se pudiera llamar desde la clase Test), el cual regresa una llamada al método estático, .ortorgarID() de la clase Inventario (ID).
	public Integer getId(){
		return Inventario.otorgarId(); 
	}
}