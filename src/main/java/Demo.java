public class Demo {
    public static void main(String[] args) {
//Person p = new Person();
Person p1 = new Student();
    }
}
class Person{
    String firstname;
    String lastname;
    public Person(){
        System.out.println("person class called");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void eat(){
        System.out.println("Person is eating");
    }
}

class Student extends Person{
    String schoolName;

    public Student() {
        super();
        System.out.println("Student class called");
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println("Student studying");
    }
}