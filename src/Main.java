import java.util.List;

public class Main {



    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.initPerson();
        manager.initLV();
        manager.initStudent();
        List<Person> listPersonMain = manager.getPerson();
        List<Student> studentList = manager.getStudent();

        for(Person person : listPersonMain){
            System.out.println("id = " + person.getId());
            System.out.println("Name = " + person.getName());
            System.out.println("Last Name = " + person.getLastName());
        }

        int counter = 0;

        for(Student student : studentList){
            if(student.getLvs() == null || student.getLvs().isEmpty()){
                counter++;

            }

        }
        System.out.println(counter);
    }
}
