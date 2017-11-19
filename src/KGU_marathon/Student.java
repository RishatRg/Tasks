package KGU_marathon;

import java.util.Comparator;

/**
 * Created by RishatRg on 15.10.2017.
 */

public class Student {
   protected String firstName ;
   protected String lastName ;
   protected double time;

   public Student(String firstName,String lastName,double time)
   {
       this.firstName=firstName;
       this.lastName=lastName;
       this.time=time;
   }
   public Student()
    {
    }
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

}
