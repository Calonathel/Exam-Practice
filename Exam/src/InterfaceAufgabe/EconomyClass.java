package InterfaceAufgabe;

public class EconomyClass extends Inevitable implements Miserable {
	public EconomyClass(String s) {
		this.printS(s);
	}
	
	public static void main (String[] args) {
		EconomyClass ec = new EconomyClass("Heinz");
	}
}
