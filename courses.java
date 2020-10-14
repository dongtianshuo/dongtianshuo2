package Shiyan3;

public class courses {
    int number;//编号
    String coursesname;//课程名称
    String location;//上课地点
    int time;//时间
    teacher g;//所教教师
    public courses(int number,String coursesname,String location,int time,teacher g){
        this.number = number;
        this.coursesname = coursesname;
        this.location = location;
        this.time = time;
        this.g = g;
    }

    public String toString(){
        return "编号: "+number+" 课程名称: "+coursesname+" 地点: "+location+" 时间: "+time+" 教师: "+g;
    }
}
