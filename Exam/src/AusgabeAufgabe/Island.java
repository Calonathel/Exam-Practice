package AusgabeAufgabe;

public class Island {
	
	protected static boolean progLang;
	public Island() { }
	public Island(boolean b) {
	progLang = b;
	if (progLang) {
	System.out.println("Borneo");
	} else {
	System.out.println("Java");
	}
	}
}

