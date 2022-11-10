import java.util.List;

public class Libro extends Component {
	
	private List<String> autori;
	private String titolo;
	
	private List<Sezione> sezioni;

	@Override
	public void stampa() {
		System.out.println("TITOLO:" + this.titolo);
		for(Sezione s : sezioni) {
			s.stampa();
		}
		
	}

	@Override
	public int nPagine() {
		int res = 0;
		for(Sezione s : sezioni) {
			res += s.nPagine();
		}
		return res;
	}
	
	

}
