# 计191 董天硕 2019311016
# 实验目的
#### 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
#### 掌握面向对象的类设计方法（属性、方法）；
#### 掌握类的继承用法，通过构造方法实例化对象；
#### 学会使用super()，用于实例化子类；
#### 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
# 实验要求
#### 说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
#### 对象示例：	人员（编号、姓名、性别）
#### 教师（编号、姓名、性别、所授课程）
#### 			学生（编号、姓名、性别、所选课程）
#### 			课程（编号、课程名称、上课地点、时间、授课教师）
#### 1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
#### 2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
# 实验过程
#### 
# 流程图
# 核心代码
#### 
```
public class personnel {
    int number;//编号
    String name;//姓名
    char gender;//性别
    personnel(int number,String name,char gender){
        this.number = number;
        this.name = name;
        this.gender = gender;

    }
}
```
```
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
```
# 系统运行截图
![实验结果截图](https://github.com/dongtianshuo/dongtianshuo2/blob/main/Snipaste_2020-10-06_20-32-27.png)
# 实验总结

