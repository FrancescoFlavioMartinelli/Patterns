public class UserData implements Datasource { 
 private String nomeCompleto; 
 private int eta; 
 
 public UserData(String n, int e) {
	 this.nomeCompleto = n;
	 this.eta = e;
 }
 public UserData() { }
 
 public void getData(Datasource ds) { 
	 this.nomeCompleto = ds.getNomeCompleto(); 
	 this.eta = ds.getEta();
	 
 }
 
// static public UserData buildData(Datasource ds) {
//	return new UserData(ds.getNomeCompleto(), ds.getEta());
// }

public String getNomeCompleto() {
	return this.nomeCompleto;
}

public int getEta() {
	return this.eta;
}
 
} 