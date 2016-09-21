/**
 * Created by User on 21.09.2016.
 */
public class Student extends Person {
    String sIdNum;
    Double sGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        sIdNum = idNum;
        sGPA = gpa;
    }

    public String getsIdNum() {
        return sIdNum;
    }

    public void setsIdNum(String sIdNum) {
        this.sIdNum = sIdNum;
    }

    public Double getsGPA() {
        return getsGPA();
    }

    public void setsGPA(Double sGPA) {
        this.sGPA = sGPA;
    }
    public String toString() {
        return super.toString()+ "  IdNum: " + sIdNum + "  GPA: " + sGPA ;
    }
}
