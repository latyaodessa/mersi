/**
 * Created by andrefedorenko on 09.07.17.
 */
public class Person {

    private int id;
    private String name;
    private String lastName;

    public Person(int id, String name, String lastName){
        this.id = id;
        this.lastName = lastName;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
