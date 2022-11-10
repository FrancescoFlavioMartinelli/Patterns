
public class Pagina extends Component {
	
	private int pagina;
	private String contenuto;
	
	@Override
	public void stampa() {
		System.out.println("Pagina: " + this.pagina);
		System.out.println(this.contenuto);
	}
	
	@Override
	public int nPagine() {
		return 1;
	}

}
