public class Statistika {
	public static void main(String[] args) {
			
			double soucet = 0.0;
			double soucet_ctverec = 0.0;
			double maximum = -Double.MAX_VALUE;
			double minimum = Double.MAX_VALUE;
			int pocet = 0;
			
			java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while (sc.hasNextDouble()) {
				double cislo = sc.nextDouble();
				
				soucet += cislo;
				soucet_ctverec += cislo*cislo;
				
				if (cislo < minimum) {
					minimum = cislo;
				}
					
				if (cislo > maximum) {
					maximum = cislo;
					
				++pocet;
				}
		}	
			double prumer = soucet / pocet;
			double odchylka = Math.sqrt (soucet_ctverec / pocet - (prumer*prumer));
			if (pocet != 0){
				System.out.printf("Soucet cisel = %f.\n", soucet);
				System.out.printf("Nejmensi z cisel = %f.\n", minimum);
				System.out.printf("Nejvetsi z cisel = %f.\n", maximum);
				System.out.printf("Prumer = %f.\n", prumer);
				System.out.printf("Smerodatna odchylka = %f.\n", odchylka);
			} else { 
				System.out.println("Zadne hodnoty nebyly zadany.");
			}
			
	}
}	