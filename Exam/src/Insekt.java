
public class Insekt extends Tier {
	
	public Insekt (String name) {
		super(name);
		System.out.println(super.toString());
	}
	
	public String toString() {return "Insect " + name; }
}
