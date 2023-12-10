public class Main {
    public static void main(String[] args) {

        SocieteArrayList esprit = new SocieteArrayList();
        Employe e1 = new Employe(0,"weld","chef","cs",0);
        esprit.ajouterEmploye(e1);
        esprit.ajouterEmploye(new Employe(2,"aziz","wardi","java",1));
        esprit.ajouterEmploye(new Employe(1,"chef","secteur","secteur kol",2));

        esprit.displayEmploye();
        System.out.println("first " + esprit.rechercherEmploye("aziz"));
        System.out.println("second " + esprit.rechercherEmploye(e1));
        esprit.supprimerEmploye(e1);

        System.out.println("-------------------------------------------------");

        esprit.trierEmployeParId();
        esprit.displayEmploye();

        System.out.println("-------------------------------------------------");

        esprit.trierEmployeParNomDépartementEtGrade();
        esprit.displayEmploye();

        System.out.println("-------------------------------------------------");
        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(2, "cs", 20)); //Add Works
        D.ajouterDepartement(new Departement(1, "secteur", 20));
        D.ajouterDepartement(new Departement(0, "java", 20));
        D.displayDepartement();
        System.out.println(D.rechercherDepartement("cs"));
        System.out.println(D.trierDepartementById());
    }
}