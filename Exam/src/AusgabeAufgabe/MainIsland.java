package AusgabeAufgabe;

public class MainIsland extends Island {

	public MainIsland() {
		System.out.println(this.toString());
		System.out.println(this.getApp("Insel"));
		System.out.println(this.toString());
		}
		public String toString() { return "eine gro�e"; }
		private String getApp(String which) { return which; }
		protected String getApp() { return "ist eine"; }
		
}
