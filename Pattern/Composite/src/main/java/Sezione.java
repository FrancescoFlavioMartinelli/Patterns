import java.util.List;

public class Sezione extends Component {
	
	private String titolo;

	private List<Component> listaComponent;

	@Override
	public void stampa() {

		System.out.println("Sezione: " + this.titolo);
		for(Component c : listaComponent) {
			c.stampa();
		}
	}

	@Override
	public int nPagine() {
		int res = 0;
		for(Component c : listaComponent) {
			res += c.nPagine();
		}
		return res;
	}
}
