import java.util.Date;

public class Info { 
 private String nome; 
 private String cognome; 
 private Date dataDiNascita; 
 
 public Info(String n, String c, Date d) {
	 this.nome = n;
	 this.cognome = c;
	 this.dataDiNascita = d;
 }
 
 public String getNome() { return nome;} 
 public void setNome(String nome) { this.nome = nome;} 
 public String getCognome() { return cognome;} 
 public void setCognome(String cognome) { this. cognome = cognome;} 
 public Date getDataDiNascita() { return dataDiNascita;} 
 public void DataDiNascita (Date dataDiNascita) { this. dataDiNascita = dataDiNascita;} 
}
