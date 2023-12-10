import java.util.Objects;

public class Departement implements Comparable<Departement> {

    private int id;
    private String nom_dep;
    private int nb_empl;

    public Departement(int id, String nom_dep, int nb_empl) {
        this.id = id;
        this.nom_dep = nom_dep;
        this.nb_empl = nb_empl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id == departement.id && Objects.equals(nom_dep, departement.nom_dep);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_dep='" + nom_dep + '\'' +
                ", nb_empl=" + nb_empl +
                '}';
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + id;
        result = result * 31 + nom_dep.hashCode();
        return result;
    }


    public int getId() {
        return id;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public int getNb_empl() {
        return nb_empl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public void setNb_empl(int nb_empl) {
        this.nb_empl = nb_empl;
    }

    @Override
    public int compareTo(Departement o) {
        return id - o.getId();
    }
}

