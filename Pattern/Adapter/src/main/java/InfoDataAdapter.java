import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoDataAdapter implements Datasource  {
	
	private Info info;
	
	public InfoDataAdapter(Info i) {
		this.info = i;
	}

	public String getNomeCompleto() {
		return this.info.getNome() + " " + this.info.getCognome();
	}

	public int getEta() {
		LocalDate today = LocalDate.now();
		LocalDate d = this.info.getDataDiNascita()
				.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
		
		return Period.between(today, d).getYears();
	}
	
	
	

}
