public class KombinacniCislo {
	public static void main(String[] args) {
		long n = Integer.parseInt(args[0]);
		long k = Integer.parseInt(args[1]);
		
		if (k > n) {
			System.out.printf ("Nemuze byt vybrano %d prvku z mnoziny o %d prvcich.", k, n) ;
		} else {
		long faktorial = PocitaFaktorial(n) / (PocitaFaktorial(n-k) * PocitaFaktorial(k)) ;
		
		
		System.out.printf("%d", faktorial);
		}
	
	}
	
	
	
	private static long PocitaFaktorial (long cislo) {
		long faktorial = 1 ;
		for (long i = cislo; i > 0; i--) {
			faktorial *= i ;
		}	
		return faktorial ;
	}		
	
}