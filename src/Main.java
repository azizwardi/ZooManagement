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

        System.out.println("-------------------------------------------------");
        AffectationHashMap HM = new AffectationHashMap();
        Employe e2 = new Employe(1, "chef", "secteur", "cs", 20);
        Employe e3 = new Employe(2, "weld", "chef", "dust", 13);
        Employe e4 = new Employe(3, "wardi", "aziz", "A2", 9);
        Departement d1 = new Departement(1, "J24", 2);
        Departement d2 = new Departement(2, "J25", 2);

        HM.ajouterEmployeDepartement(e2, d1);
        HM.ajouterEmployeDepartement(e3, d1);
        HM.ajouterEmployeDepartement(e4, d2);
        HM.afficherEmployesEtDepartements();
        HM.supprimerEmploye(e2);
        HM.afficherEmployes();
        HM.afficherDepartments();
        System.out.println(HM.rechercherEmploye(e2));
        System.out.println(HM.rechercherDepartement(d1));
        System.out.println(HM.trierMap());
        HM.supprimerEmployeEtDepartement(e3, d2);
        HM.afficherEmployesEtDepartements();
    }
}