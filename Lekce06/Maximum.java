public class Maximum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
		int maximum = sc.nextInt() ;
		while (sc.hasNextInt()) {
			int a = sc.nextInt () ;			
			if (a > maximum) { 
				maximum = a ;
			}
		}
		System.out.printf ("Nejvetsi cislo je: %d", maximum) ;
    }
}
