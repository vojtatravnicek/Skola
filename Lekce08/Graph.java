public class Graph {
	public static void main(String[] args) {
		awh.IntList hodnoty = awh.IntList.create();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (sc.hasNextInt()) {
			hodnoty.add(sc.nextInt()) ;
		}
		
		for (int i = 0; i < hodnoty.size(); i++){
			int hodnota = hodnoty.get(i)/uprava(hodnoty);
			for (int j = 0; j < hodnota; j++){
				System.out.print("X");
			}	
			System.out.println();
		}	
	}

	private static int uprava (awh.IntList hodnoty){
		int pomer = maximum(hodnoty)/60;
		return pomer;
	}
	
	private static int maximum (awh.IntList hodnoty){
		int maximum = hodnoty.get(0) ;
		for (int i = 0; i < hodnoty.size(); i++){
			int a = hodnoty.get(i);			
			if (a > maximum) { 
				maximum = a ;
			}
		}
		return maximum;
	}
}	