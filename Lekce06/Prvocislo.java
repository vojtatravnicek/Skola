public class Prvocislo {
    public static void main(String[] args) {
		int cislo = Integer.parseInt (args [0]) ;
			boolean prvocislo = true ;
			for (int a = 2; a < cislo - 1; a+=1) {
				if (cislo % a == 0) {
					prvocislo = false; 
					break;
				}
			}
			if (prvocislo) 
				System.out.printf ("%d je prvocislo", cislo) ;
			else 
				System.out.printf ("%d neni prvocislo", cislo) ;
		}
	}