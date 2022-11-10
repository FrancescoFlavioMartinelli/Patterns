
public class Main {

	public static void main(String[] args) {
		Pagina p = new Pagina(1, "lorem ipsum");
		Pagina p = new Pagina(1, "lorem ipsum");
		Pagina p = new Pagina(1, "lorem ipsum");
		Pagina p = new Pagina(1, "lorem ipsum");

		Sezione s1 = new Sezione("lorem ipsum");
		Sezione s1 = new Sezione("lorem ipsum");
		Sezione s1 = new Sezione("lorem ipsum");
		Sezione s1 = new Sezione("lorem ipsum");
		
		Libro l = new Libro("", new ArrayList<String>());
		
		s1.setListaComponent();

		
		
		l.stampa();
		System.out.println(l.nPagine());
	}

}
