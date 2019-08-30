public class Student {
    private String fName; private String lName; private float gpa;

    public Student() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public float getGpa() {
        return gpa;
    }

    public String toString(){
        return "Last Name: "+ lName;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
