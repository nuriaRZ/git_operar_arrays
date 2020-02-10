package operar_arrays;

public class arrays {
	public static void main(String[] args) {
		int array[]= new int[10];
		imprimirArray(array);

	}

	
	
	private static void rellenarArray(int array[]) {
		
		for (int i=0; i<array.length; i++) {
			array[i]=(int)Math.round(Math.random()*20);
						
		}
	}
	
	private static void imprimirArray(int array[]) {
		for (int i=0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");			
		}
	}
	
	private static void nuevoMetodo2(int array[]) {
		for (int i=0; i<array.length; i++) {
			array[i]=(int)Math.round(Math.random()*20);
						
		}
	}


}
