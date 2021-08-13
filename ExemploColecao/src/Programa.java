import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for(int i = 1; i < 10; i++) {
			lista.add(i);
		}
		System.out.println(lista);
	}
}
