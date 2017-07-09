package lisicht;

public class B {

	private int mb1 = 1;
	protected int mb2 =2;
	
	public int f(B b) { return mb1 + b.mb1; }
	
	public int g(C c) { return mb1 + c.mc; }
}
