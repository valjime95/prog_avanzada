import java.util.Arrays;
public class EjercicioHeap{
	private int id = 0;
	public static void main(String [] args){
		int x = 0;
		EjercicioHeap[] eh = new EjercicioHeap[5];
		while (x < 5){
			eh[x] = new EjercicioHeap();
			eh[x].id = x;
			x++;
		}
		// eh[0] = eh[3];
		// eh[3] = eh[1];
		// eh[3].id = 6;
		// eh[2] = eh[4];
		// eh[4] = null;
		// eh[3] = eh[2];
		// eh[4] = eh[0];

		eh[3] = eh[1];
		eh[4] = eh[1];
		eh[3] = null;
		eh[4] = eh[0];
		eh[0] = eh[3];
		eh[3] = eh[2];
		eh[2] = eh[0];

		System.out.println(eh[4].id);
		// 0.id = 3
		// 1.id = 6
		// 2.id = 4
		// 3.id = 4
		// 4.id = 3
	}
}