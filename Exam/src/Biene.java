
public class Biene extends Insekt {
	
	public Biene() {
		this("Maja");
		System.out.println("Insekt");
		System.out.println(this);
	}
	
	public Biene (String s) {
		super(s);
		System.out.println(s);
	}
	
	public static void main (String[] args) {
		new Biene();
	}
}
