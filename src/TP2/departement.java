package TP2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class departement {
	private int idDep;
	private int Capacity;
	Set<employe> LEmployes;
	public departement(int idDep, int capacity) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
		LEmployes = new HashSet ();
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public Set<employe> getLEmployes() {
		return LEmployes;
	}
	public void setLEmployes(Set<employe> lEmployes) {
		LEmployes = lEmployes;
	}
	
	public void ajoutEmploye(employe E){
		int S=E.getCin();
	
		if (E.getCin()>0){
	
				LEmployes.add(E);
				S++;
		}}

	public void retirerEmploye(employe E){
		  LEmployes.remove(E);
			}
	
	public void afficheDep(){
		  LEmployes.forEach(System.out::println);

	}
	
	public boolean existeE(int cin){
		if(LEmployes.contains(cin));{
		return true;
		}
	}
	
	public employe getEmplSalMax(){
	    TreeSet<employe> treeSet = new TreeSet<employe>(LEmployes);
	    return treeSet.last();
			}
	
	

	




	}
