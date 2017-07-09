package AusgabeAufgabe;

public class Continent extends MainIsland {

	public String toString() {
		progLang = !progLang;
		if (progLang) {
		return getApp();
		} else {
		System.out.println("in");
		return "Asien";
		}
		}
		protected String getApp() { return ": eine"; }
		public String 
		getApp(String which) { 
		return "Programmiersprache"; 
		}
		public static void main(String args[ ]) {
		new Island(false);
		new Continent();
		System.out.println(progLang);
		}
}
