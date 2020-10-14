package Shiyan3;

public class student extends personnel{
    courses r;//所选课程
    public student(int number,String name,char gender,courses r){
        super(number,name,gender);
        this.r = r;
    }
    public String toString() {
        return "编号: "+number+" 姓名: "+name+" 性别: "+gender+" 所学课程: "+r;
    }
}