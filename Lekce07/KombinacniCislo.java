public class KombinacniCislo {
	public static void main(String[] args) {
		long cislo = Integer.parseInt(args[0]);
		
		long faktorial = PocitaFaktorial(cislo);
		
		System.out.printf("%d", faktorial);
	
	}
	
	private static long PocitaFaktorial (long cislo) {
		long faktorial = 1 ;
		for (long i = cislo; i > 0; i--) {
			faktorial *= i ;
		}	
		return faktorial ;
	}		
	
}