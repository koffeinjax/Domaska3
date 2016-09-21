/**
 * Created by User on 21.09.2016.
 */
public class Teacher extends Person {
    String tsubject;
    double tsalary;
    public Teacher (String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        tsalary=salary;
        tsubject=subject;
    }

    public String getTsubject() {
        return tsubject;
    }
    public void setTsubject(String tsubject) {
        this.tsubject = tsubject;
    }
    public double getTsalary() {
        return tsalary;
    }
    public void setTsalary(double tsalary) {
        this.tsalary = tsalary;
    }
    public String toString() {
        return super.toString() + " Subject: " + tsubject + " Salary: "+ tsalary;
    }
}
