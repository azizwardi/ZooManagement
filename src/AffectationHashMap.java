import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> details;

    public AffectationHashMap(){
        details = new HashMap<>();
    }

    public AffectationHashMap(Map<Employe, Departement> details) {
        this.details = details;
    }

    public Map<Employe, Departement> getDetails() {
        return details;
    }

    public void setDetails(Map<Employe, Departement> details) {
        this.details = details;
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        e.setNom_dep(d.getNom_dep()); //to make sure the department of the employee is not different from the department itself.
        details.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe, Departement> entry : details.entrySet()){
            System.out.println(entry.getKey().getNom() + ", " + entry.getKey().getPrenom() + ": Department: " + entry.getValue().getNom_dep());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (details.containsKey(e))
            details.remove(e);
        else
            System.out.println("Employee n'existe pas.");
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if(details.containsKey(e) && details.containsValue(d))
            details.remove(e, d);
        else
            System.out.println("Employee or Departement n'existe pas.");
    }

    public void afficherEmployes(){
        Set<Employe> employees = details.keySet();
        Iterator<Employe> iterator = employees.iterator();
        System.out.println("Employees IDs:");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getId());
        }
    }

    public void afficherDepartments(){
        Collection<Departement> departments = details.values();
        System.out.println("Departments: ");
        for(Departement d : departments){
            System.out.println(d.getId() + ", " + d.getNom_dep());
        }
    }

    public boolean rechercherEmploye(Employe e){
        return details.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return details.containsValue(d);
    }

    TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> Compartor = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeMap<Employe, Departement> newDetails = new TreeMap<>(Compartor);
        newDetails.putAll(details);
        return newDetails;
    }
}