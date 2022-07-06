package service;
import java.util.List;
import java.util.Scanner;
public class clientjava {
public static void main(String[] args) {
	EtudiantService stub = new EtudiantWS().getEtudiantServicePort();
    Scanner sc = new Scanner(System.in);
		int choice, id;
    String nom, prenom;
    System.out.println("\tVeuillez choisir  l'action a execute:");
    System.out.println("\t1-Creer un nouveau etudiant");
    System.out.println("\t2-Mettre a jour info etudiant");
    System.out.println("\t3-Supprimer etudiant");
    System.out.println("\t4-afficher la liste des etudiants");
    
    System.out.print("Choix:\t");
    choice = sc.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Veuillez saisir le:");
            System.out.print("\tNom:");
            nom = sc.next();
            System.out.print("\tPrenom:");
            prenom = sc.next();
            System.out.println(stub.create(nom, prenom));
            break;
        case 2:
            System.out.println("Veuillez saisir :");
            System.out.print("id de l'etudiant a modifie:");
            id = sc.nextInt();
            System.out.print("\tNom:");
            nom = sc.next();
            System.out.print("\tPrenom:");
            prenom = sc.next();
            System.out.println(stub.update(nom, prenom,id));
            break;
        case 3:
            System.out.print("Veuillez saisir l'id de l'etudiant a supprime: ");
            id = sc.nextInt();
            System.out.println(stub.delete(id));
            break;
            
        case 4: 
        List<Etudiant> ets=stub.getEtudiants();
        System.out.print("+-------+--------+------+\n");
        System.out.print("|ID\t+Nom\t+Prenom\t|\n");
        System.out.print("+-------+--------+------+\n");
		for(Etudiant e: ets){

		System.out.print("|"+e.getId()+"\t|"+e.getNom()+"\t|"+e.getPrenom()+"\t|\n");
		}
		System.out.print("+-------+--------+------+\n");
        break;
        default:
            System.out.println("Option invalide");
            break;
    }

}
}
