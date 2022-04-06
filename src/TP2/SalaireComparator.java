package TP2;

import java.util.Comparator;

public abstract class SalaireComparator implements Comparator <employe> {
	public int Salaire (employe e1, employe e2){
		if (e1.getSalaire()>e2.getSalaire()){
			return 1;
		} else {
			return -1;
		}
		
	}

}
