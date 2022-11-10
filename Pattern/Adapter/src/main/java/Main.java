import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Info i = new Info("Nome", "Cognome", new Date("2021-10-11"));
		UserData u = new UserData("Nome Completo", 3);
		
		InfoDataAdapter id = new InfoDataAdapter(i);
		
		if(u.getEta() > id.getEta()) {
			System.out.print("U è più grande");
		} else {
			System.out.print("I è più grande");
		}
		
		UserData ui = new UserData();
		ui.getData(id);
	}

}
