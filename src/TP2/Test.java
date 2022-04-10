package TP2;

public class Test {

	public static void main(String[] args) {
		employe e1 = new employe(1,"mortadha",2100,1);
		employe e2 = new employe(2,"amine",5000,1);
		employe e3 = new employe(3,"aymen",2400,1);
		departement dep = new departement(1,300);
		dep.ajoutEmploye(e1);
		dep.ajoutEmploye(e2);
		dep.ajoutEmploye(e3);
		departement dep1 = new departement(3,210);
		employe e4 = new employe(4,"wael",2900,3);
		dep1.ajoutEmploye(e4);
		dep.afficheDep();
		System.out.println("max="+dep.getEmplSalMax());
		if (dep.existeE(1)) {
			System.out.println("existe");
		}
		else {
			System.out.println("n'existe pas");
	}
		

	entreprise en = new entreprise("AfterCode");
	en.ajoutDep(dep);
	en.ajoutDep(dep1);
	en.UpdateDep(e1,3);
	en.afficheE();
	en.depMinCapacite();
	if (en.exist(1)) {
		System.out.println("existe");
	}
	else {
		System.out.println("n'existe pas");
}



}
}
