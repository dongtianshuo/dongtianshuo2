package Shiyan2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Courses q=null;
        Student[] l = new Student[3];
        String[][] l1 = new String[3][3];
        Teacher t = new Teacher(101, "cui", 'W',"math");
        Teacher e = new Teacher(102, "zhang", 'M',"java");
        Teacher a = new Teacher(103, "wang", 'W', "c++");
        Teacher h = new Teacher(0,"无",'W',"无");
        Courses r = new Courses(0, "无", "无", 0, h );
        Courses c = new Courses(1, "math", "1号教学楼", 7, t );
        Courses o = new Courses(2, "java", "1号教学楼", 7, e);
        Courses u = new Courses(3, "c++", "1号教学楼", 7, a);
        Student s = new Student(2019311016, "董天硕", 'M', r);
        Student d = new Student(2019311017, "小强", 'M', r);
        Student n = new Student(2019311018, "小刚", 'M', r);
        l[0] = s;
        l[1] = d;
        l[2] = n;
        System.out.println("学生信息");
        System.out.println(s);
        System.out.println(d);
        System.out.println(n);
        System.out.println("教师信息");
        System.out.println(t);
        System.out.println(e);
        System.out.println(a);
        System.out.println("课程信息");
        System.out.println(c);
        System.out.println(o);
        System.out.println(u);
        for (int i=0;i<3;i++) {
            System.out.println("选课(请输入1，2，3): ");
            int xuanze = in.nextInt();
            if (xuanze == 1) {
                q = c;
                System.out.println("已选课: " + c);
            } else if (xuanze == 2) {
                q = o;
                System.out.println("已选课: " + o);
            } else if (xuanze == 3) {
                q = u;
                System.out.println("已选课: " + u);
            } else {
                System.out.println("输入错误");
            }
            l[i].setR(q);
            System.out.println("学生信息");
            System.out.println(l[i]);

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("是否退课");
            int z = in.nextInt();
            if (z==1) {
                System.out.println("退课(请输入您已选课程1，2，3): ");
                int xuanz = in.nextInt();
                if (xuanz == 1) {
                    System.out.println("已退课: " + c);
                } else if (xuanz == 2) {
                    System.out.println("已退课: " + o);
                } else if (xuanz == 3) {
                    System.out.println("已退课: " + u);
                } else {
                    System.out.println("输入错误");
                }
                l[i].setR(r);
                System.out.println("学生信息");
                System.out.println(l[i]);
            }
        }
        for (int i=0;i<3;i++) {
            if (l[i].r==c){
                l1[0][i]=l[i].getName();
            }
            else if (l[i].r==o){
                l1[1][i]=l[i].getName();
            }
            else if (l[i].r==u){
                l1[2][i]=l[i].getName();
            }
            else if (l[i].r==r)
                System.out.println("该学生没有选课:"+l[i]);
        }
        for (int i=0;i<3;i++){
            System.out.println("math:"+l1[0][i]);
        }
        for (int i=0;i<3;i++){
            System.out.println("java:"+l1[1][i]);
        }
        for (int i=0;i<3;i++){
            System.out.println("c++;"+l1[2][i]);
        }
    }
}
