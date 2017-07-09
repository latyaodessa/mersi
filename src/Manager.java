import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrefedorenko on 09.07.17.
 */
public class Manager {

    private List<Person> listPerson;
    private List<LV> listLV;
    private List<Student> studentList;

    public void initPerson(){
        listPerson = new ArrayList<>();

        for(int i=0; i < 10; i++ ){
            //Person p = new Person(i,String.valueOf(i) + "idkName", String.valueOf(i) + "idkLastName");
            listPerson.add(new Person(i,String.valueOf(i) + "idkName", String.valueOf(i) + "idkLastName"));
        }
    }

    public void initLV(){

        listLV = new ArrayList<>();

        for(int i=0; i < 100; i++ ){
            LV lv = new LV();
            lv.setLvid(i);
            lv.setLvName(String.valueOf(i) + "idkLvName");
            listLV.add(lv);

        }
    }

    public void initStudent(){

        studentList = new ArrayList<>();

        for(int i=0; i < 100; i++ ){
            Student student = new Student(i,String.valueOf(i) + "idkName", String.valueOf(i) + "idkLastName");
            student.setMatNr(i+100);

            for(LV lv : listLV){
                if(i%2 == 0){
                    student.setLvs(listLV);
                }
            }

        }
    }

    public List<Person> getPerson(){
        return listPerson;
    }

    public List<LV> getLV(){
        return listLV;
    }

    public List<Student> getStudent(){
        return studentList;
    }
}

