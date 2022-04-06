package TP2;

public class Test {

	public static void main(String[] args) {
		employe e1 = new employe(1,"mortadha",2100,6);
		employe e2 = new employe(2,"amine",5000,5);
		employe e3 = new employe(3,"aymen",2400,6);
		employe e4 = new employe(4,"wael",2900,3);
		departement dep = new departement(5,210);
		dep.ajoutEmploye(e1);
		dep.ajoutEmploye(e2);
		dep.ajoutEmploye(e3);
		dep.ajoutEmploye(e4);
		dep.afficheDep();
		System.out.println("max="+dep.getEmplSalMax());
		if (dep.existeE(1)) {
			System.out.println("existe");
		}
		else 	
			System.out.println("n'existe pas");

		}
}
