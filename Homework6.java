class Course {
    protected String code;
    protected String name;
    public Course() {

    }
    public Course(String s1, String s2){
        this.code = s1;
        this.name = s2;
    }
    String getCode() {
        return code;
    }
    String getName() {
        return name;
    }
}

class OnlineCourse extends Course {
    public OnlineCourse(String s1, String s2){
        super(s1,s2);
    }
    public String toString(){
        return "OnlineCourse: \"Code: \"" + super.code + "\", Name: \"" + super.name + "\", Type: Online“";
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String s1, String s2) {
        super(s1,s2);
    }
    public String toString() {
        return "OfflineCourse: \"Code: \"" + super.code + "\", Name: \"" + super.name + "\", Type: Offline“";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}
