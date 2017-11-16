package Collection.University;

/**
 * Created by RishatRg on 06.11.2017.
 */
public class Lecturer implements Human{
    int ID;
    String FirstName;
    String LastName;
    String Patronymic;
    String kafedra;
    int Age;

    public Lecturer(int ID, String lastName, String firstName, String patronymic,int Age, String kafedra) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Patronymic = patronymic;
        this.kafedra = kafedra;
        this.Age=Age;
    }

    @Override
    public String toString() {
        return ID +". "+LastName+ ' ' + FirstName .toCharArray()[0]+". "+ Patronymic.toCharArray()[0]+". "+
                "( кафедра: " + kafedra+ ")\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }
}


