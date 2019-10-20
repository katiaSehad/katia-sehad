package reservationvol;

import java.util.Date;

public class vol {
 private String identifiant ;
 private Date depart;
 private Date arrivee;
 public long duree(){
	  return (this.arrivee).getTime() - (this.depart).getTime();
	}
 public void ouvrir(){
	 
 }
 public void fermee(){}
public String getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(String identifiant) {
	this.identifiant = identifiant;
}
 
 }

