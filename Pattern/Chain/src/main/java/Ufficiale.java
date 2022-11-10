
public abstract class Ufficiale {
	
	Ufficiale superiore;
	
	int stipendio;

	public void setSuperiore(Ufficiale u) {
		this.superiore = u;
	}
	
	public void check(int importo) {
		if(this.stipendio > importo) {
			System.out.println("L'importo è lo stipendio di " + this.getClass().getSimpleName());
		} else {
			this.superiore.check(importo);
		}
	}
	

}
