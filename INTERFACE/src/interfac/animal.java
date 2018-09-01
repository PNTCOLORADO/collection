package interfac;

public abstract class animal {
	public abstract void sound();
	public abstract void smeel();

}
public class sheep extends animal{
	public void sound() {
		System.out.println("meeeeeeeeeeeee");
	}
	public void smeel() {
		System.out.println("good");
	}
	
	public static void main (String[] args) {
		animal a=new sheep();
		a.sound();
		a.smeel();
	}
}
