import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
public class Person {
    private String ID; // should never change sequence of digits
    private String firstName;
    private String lastName;
    private String title;  // a prefix: Mr. Mrs. Ms, Prof. Dr. Hon. Etc.
    private int YOB; // Year of birth  // Range should be 1940 - 2000

    public Person(String ID, String firstName, String lastName, String title, int YOB) { // Constructor
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFormalName() {
        return this.title + " " + this.firstName + " " + this.lastName;
    }

    public String toCSVDataRecord() {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
    }

    public int getAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - YOB);
    }

    public int getAge(int year) {
        return (year - YOB);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';

    }
}