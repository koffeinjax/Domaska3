/**
 * Created by User on 21.09.2016.
 */
public class Person {
    private String pname;
    private int page;
    private String pgender;

    public Person(String name, int age, String gender) {
        page=age; pname=name; pgender=gender;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String getPgender() {
        return pgender;
    }
    public void setPgender(String pgender) {
        this.pgender = pgender;
    }
    public String toString()  {
        return pname + ", age: " + page + ", gender: " + pgender;
    }
}
