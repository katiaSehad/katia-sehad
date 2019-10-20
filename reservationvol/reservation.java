package reservationvol;

import java.util.Date;

public class reservation {
	Date date;
	double id;
	String etat;
	public void annuler(){
		etat="annulé";
	}
	
	public void confirmer(){
		etat="confirmer";
		}
	public void payer(){
		etat ="en-attente";
	}

}
