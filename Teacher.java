package Shiyan2;
public class Teacher extends Personnel {
    String courses;//所教课程
    public Teacher(int number, String name, char gender,String courses) {
        super(number,name,gender);
        this.courses = courses;
    }
    public String toString() {
        return "编号: "+number+" 姓名: "+name+" 性别: "+gender+" 所授课程: "+courses;
    }
}
