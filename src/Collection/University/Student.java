package Collection.University;



/**
 * Created by RishatRg on 06.11.2017.
 */
public class Student implements Human {

    int ID;
    String FirstName;
    String LastName;
    String Patronymic;
    String Group;
    int Age;


    public Student(int ID, String lastName, String firstName, String patronymic, int Age, String Group) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Patronymic = patronymic;
        this.Group = Group;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return ID + ". " + LastName+ ' ' + FirstName .toCharArray()[0] + ". " + Patronymic.toCharArray()[0] + ". " +
                "( группа: " + Group + ")\n";
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String getPatronymic() {
        return Patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int age) {
        Age = age;
    }
/*
    public int compareTo(Student any) {
        for (int i = 0; i < any.getFirstName().toCharArray().length||i<getFirstName().toCharArray().length; i++) {

            if(any.getFirstName().toCharArray()[i]> FirstName.toCharArray()[i])
                return -1 ;
            else if(any.getFirstName().toCharArray()[i]< FirstName.toCharArray()[i])
                    return 1;
            else return 0;
        }
    }
*/
}
