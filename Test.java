package Shiyan3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        courses q=null;
        teacher t = new teacher(101, "cui", 'W', "math");
        teacher e = new teacher(102, "zhang", 'M', "java");
        teacher a = new teacher(103, "wang", 'W', "c++");
        teacher h = new teacher(0, "无", 'F', "无");

        courses c = new courses(1, "math", "1号教学楼", 7, t);
        courses o = new courses(2, "java", "1号教学楼", 7, e);
        courses u = new courses(3, "c++", "1号教学楼", 7, a);
        courses r = new courses(0, "无", "无", 0, h);
        System.out.println("教师信息");
        System.out.println(t);
        System.out.println(e);
        System.out.println(a);
        System.out.println("课程信息");
        System.out.println(c);
        System.out.println(o);
        System.out.println(u);
        System.out.println("选课(请输入1，2，3): ");
        int xuanze  = in.nextInt();
        if (xuanze == 1) {
            q=c;
            System.out.println("已选课: " + c);
        }
        else if (xuanze == 2) {
            q=o;
            System.out.println("已选课: " + o);
        }
        else if (xuanze == 3) {
            q=u;
            System.out.println("已选课: " + u);
        }
        else {
            System.out.println("输入错误");
        }
        student s = new student(2019311016, "董天硕", 'M',q);
        System.out.println("学生信息");
        System.out.println(s);
        System.out.println("退课(请输入您已选课程1，2，3): ");
        int xuanz = in.nextInt();
        if (xuanz == 1) {
            System.out.println("已退课: " + c);
        }
        else if (xuanz == 2) {
            System.out.println("已退课: " + o);
        }
        else if (xuanz == 3) {
            System.out.println("已退课: " + u);
        }
        else {
            System.out.println("输入错误");
        }
        student d = new student(2019311016, "董天硕", 'M',r);
        System.out.println("学生信息");
        System.out.println(d);
    }
}
