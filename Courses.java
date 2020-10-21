package Shiyan2;
public class Courses {
    int number;//编号
    String coursesname;//课程名称
    String location;//上课地点
    int time;//时间
    Teacher t;//所教教师
    public Courses(int number,String coursesname,String location,int time,Teacher t){
        this.number = number;
        this.coursesname = coursesname;
        this.location = location;
        this.time = time;
        this.t = t;
    }
    public Teacher getT(){
        return t;
    }
    public void setT(Teacher t){
        this.t = t;
    }
    public String toString(){
        return "编号: "+number+" 课程名称: "+coursesname+" 地点: "+location+" 时间: "+time+" 教师: "+t;
    }
}
