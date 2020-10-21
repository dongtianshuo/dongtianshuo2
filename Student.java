package Shiyan2;
public class Student extends Personnel {
    Courses r;//所选课程
    public Student(int number,String name,char gender,Courses r){
        super(number,name,gender);
        this.r = r;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public Courses getR(){
        return r;
    }
    public void setR(Courses r){
        this.r = r;
    }
    public String toString() {
        return "编号: "+number+" 姓名: "+name+" 性别: "+gender+" 所学课程: "+r;
    }
}
