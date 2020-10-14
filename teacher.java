package Shiyan3;

public class teacher extends personnel {
    String courses;//所教课程
    public teacher(int number, String name, char gender, String courses) {
        super(number,name,gender);
        this.courses = courses;
    }
    public String toString() {
        return "编号: "+number+" 姓名: "+name+" 性别: "+gender+" 所授课程: "+courses;
    }
}
