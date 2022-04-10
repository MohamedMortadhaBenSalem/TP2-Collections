package Ex3;

import java.util.*;

public class Annuaire {
	HashMap<String, Fiche> ListeF;

	public Annuaire() {
		ListeF = new HashMap();
	}

	int getNBconttacts() {

		return ListeF.size();
	}

	public void addContact(String s) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter adresse and numero:");
		String adresse = obj.nextLine();
		int num = obj.nextInt();
		Fiche F = new Fiche("mortadha", num, adresse);
		ListeF.put(s, F);

	}

	Fiche getContact(String name) {
		return ListeF.get(name);
	}

	void affiche() {
		System.out.println("la taille de HashMap est : "
				+ this.getNBconttacts());
		for (Map.Entry mapentry : ListeF.entrySet()) {
			System.out.println("clé: " + mapentry.getKey() + " | valeur: "+ mapentry.getValue().toString());
		}

	}

	public void trier() {
		Map<String, Fiche> treeMap = new TreeMap<>();
		treeMap.putAll(ListeF);
		System.out.println("TreeMap: " + treeMap);
	}
}

	


