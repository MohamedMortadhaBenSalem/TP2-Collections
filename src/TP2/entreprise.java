package TP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class entreprise {
private String nomEntreprise;
HashMap<Integer, departement > Liste_Deps;
public entreprise(String nomEntreprise) {
	super();
	this.nomEntreprise = nomEntreprise;
	Liste_Deps = new HashMap<Integer,departement>();
}
public String getNomEntreprise() {
	return nomEntreprise;
}
public void setNomEntreprise(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
}
public HashMap<Integer, departement> getListe_Deps() {
	return Liste_Deps;
}
public void setListe_Deps(HashMap<Integer, departement> liste_Deps) {
	this.Liste_Deps = liste_Deps;
}
public void ajoutDep(departement d){
	Liste_Deps.put(d.getIdDep(),d);
}

public void retirerDep(departement d){
	Liste_Deps.remove(d.getIdDep());
}

public void afficheE() {
	  System.out.println("L'entreprise:" +getNomEntreprise());
	  for(departement d:Liste_Deps.values()){
		  d.afficheDep();
	  }
}
public void UpdateDep(employe E, int idDep){
	Liste_Deps.get(E.getNumDep()).retirerEmploye(E);
	E.setNumDep(idDep);
	Liste_Deps.get(idDep).ajoutEmploye(E);
}
public void depMinCapacite(){
	List <departement> c=new ArrayList(Liste_Deps.values());
	Collections.sort(c);
	System.out.println(c.get(0).getCapacity());
}

public boolean exist(int cin){
	if(Liste_Deps.containsValue(cin));
	return true;
}
}

