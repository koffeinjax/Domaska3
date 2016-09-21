/**
 * Created by User on 21.09.2016.
 */
public class CollegeStudent extends Student {
    int colYear;
    String colMajor;
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        colMajor=major;
        colYear=year;
    }

    public int getColYear() {
        return colYear;
    }

    public void setColYear(int colYear) {
        this.colYear = colYear;
    }

    public String getColMajor() {
        return colMajor;
    }

    public void setColMajor(String colMajor) {
        this.colMajor = colMajor;
    }
    public String toString() {
        return super.toString()+ "  Year: " + colYear + "  Major: " + colMajor;
    }
}
