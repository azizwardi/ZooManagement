import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    List<Employe> el;
    public SocieteArrayList(){
        el = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        el.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0;i<el.size();i++){
            if(el.get(i).getNom().equals(nom)){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {

        return el.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        el.remove(employe);

    }

    @Override
    public void displayEmploye() {
        System.out.println(el);

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(el);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> nomDepartementComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom_dep().compareTo(o2.getNom_dep());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(el, nomDepartementComparator);

    }
}
