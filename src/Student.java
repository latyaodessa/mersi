import java.util.List;

/**
 * Created by andrefedorenko on 10.07.17.
 */
public class Student extends Person {

    private int matNr;
    private List<LV> lvs;

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public List<LV> getLvs() {
        return lvs;
    }

    public void setLvs(List<LV> lvs) {
        this.lvs = lvs;
    }
}
