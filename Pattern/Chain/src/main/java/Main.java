
public class Main {

	public static void main(String[] args) {
		
		Capitano c = new Capitano();
		Maggiore m = new Maggiore();
		Tenente t = new Tenente();
		
		c.setSuperiore(m);
		m.setSuperiore(t);

		
		c.check(1300);
	}

}
