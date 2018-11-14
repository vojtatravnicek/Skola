public class Krizek {
	public static void main(String[] args) {
		int velikost = Integer.parseInt(args[0]);
		
		if (velikost <= 1){
			System.out.printf ("Ciselny vstup je prilis maly . . . :,(") ; 
		} else{
			for (int i = 0; i < velikost; i++) {
				Mezery (' ',velikost);
				Znaky ('X', velikost) ;
				System.out.println () ;
			}
			
			for (int j = 0; j < 2 * velikost / 3; j++) {
				JedenRadek ('X', velikost) ;
				System.out.println () ;
			}
			
			for (int k = 0; k < velikost; k++) {
				Mezery (' ',velikost);
				Znaky ('X', velikost) ;
				System.out.println () ;
			}
		}
	}	
	
			
			
			private static void Mezery (char znak, int velikost) {
				int pocetMezer = velikost + velikost / 3 ;
				while (pocetMezer > 0) {
					System.out.printf ("%c", znak) ;
					-- pocetMezer ;
						
				}
			}	
			
			
			private static void Znaky (char znak, int velikost) {
				int pocetX = velikost ;
				while (pocetX > 0) {
					System.out.printf ("%c", znak) ;
					-- pocetX ;
					
				}
			}
			
			
			private static void JedenRadek (char znak, int velikost) {
				int XvRadku = 3 * velikost + velikost / 3 + velikost / 3 ;
				while(XvRadku > 0){
					System.out.printf ("%c", znak) ;
					-- XvRadku  ;
				}
				
			}
				
}