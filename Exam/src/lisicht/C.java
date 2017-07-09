package lisicht;

import resicht.D;
import resicht.E;

public class C {
	private int mc = 1;
	
	public int f (B b) { return b.mb2; }
	
	public static void main (String[] args) {
		
		A a = new A();
		B b = new B();
		B bz = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		System.out.println(a.f());
		System.out.println(b.f(bz));
		System.out.println(b.g(c));
		System.out.println(c.f(b));
		System.out.println(d.f(b));
		System.out.println(e.f());
		System.out.println(e.g(d));
	}
}
