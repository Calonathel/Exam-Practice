
public class Tier {

	protected String name;
	
	public Tier (String name) {
		this.name = name;
		System.out.println("Tier " + name + " erzeugt");
	}
	
	public String toString() { return "Animal with name " + name; }
	
	
	
}
