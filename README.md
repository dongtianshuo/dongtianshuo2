# 计191 董天硕 2019311016
# 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
掌握面向对象的类设计方法（属性、方法）；  
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；  
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  
# 实验要求
#### 1.说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
老师1（101、cui、女、math）  
老师2（102、zhang、男、java）  
老师3（103、wang、女、c++）  
学生1（2019311016、董天硕、男、无）   
学生2（2019311017、小强、男、无）  
学生3（2019311018、小刚、男、无）  
课程1（1、math、1号教学楼、7、cui）  
课程2（2、java、1号教学楼、7、zhang）  
课程3（3、c++、1号教学楼、7、wang）
#### 2.编写上述实体类以及测试主类（注意类之间继承关系的适用）
#### 3.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
# 实验过程
首先设置了一个人员（personnel）类，并且定义了编号，姓名，性别3个变量。然后设置了学生（student）和老师（teacher）两个类，用extends继承人员（personnel）类中的三个变量，并各自定义了所学课程和所授课程。使用super（），用于实例化子类。并运用toString（）方法进行返回学生（student）和老师（teacher）两个类的值。  
设置了一个课程（courses）类，并定义了编号、课程名称、上课地点、时间、授课教师五个变量，其中的授课教师变量运用了老师类定义了授课老师变量。  
在主类（Test）中，首先分别定义了3个老师变量（t，e，s）和3个课程变量（c，o，u）和3个学生变量（s，d，n），输出了各自的值；然后进行学生选课系统，通过使用循环进行三个学生的选课，使用数组来方便3个学生的循环，选课通过进行输入，判断输入的值与对于的值是否相等，相等输入相应的值，不相等输出“输入错误”，选课之后进行打印学生课程信息；并同时进行学生退课系统，学生可以通过输入1进行选课也可以通过输入其他数字退出选课，若进行退课，则输入原来选课时对于的值进行退课，并再次打印学生课程信息；选课退课之后通过二维数组来进行课程信息的统计，通过判断语句判断学生是否选课，再通过一维数组中学生信息赋值给二维数组，二维数组就储存对于的信息；最后利用一个循环语句输出二位数组的值。  
# 流程图
![流程图](https://github.com/dongtianshuo/dongtianshuo2/blob/main/20201019201922.png)
# 核心代码
在人员类中定义了3个变量，当作父类使用。  
```
public class Personnel {
    int number;//编号
    String name;//姓名
    char gender;//性别
    Personnel(int number,String name,char gender){
        this.number = number;
        this.name = name;
        this.gender = gender;

    }
}
```
学生和老师类结构相同，作为子类通过继承人员父类，并使用super()，用于实例化子类，使用toString（）方法,返回相关对象的信息输出，使用set（）和get（）方法方便返回对于的值。  
```
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
```
学生选课系统中，通过使用循环进行三个学生的选课，使用数组来方便3个学生的循环；通过输入对应的值返回对于的内容,输入错误则输出“输入错误”，并定义变量p来进行学生信息中课程信息的输出；使用set（）来将对于的课程信息赋值给学生信息；退课系统类似。  
```
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
```
使用二维数组来进行课程信息的统计，通过判断语句判断学生是否选课，再通过一维数组中学生信息赋值给二维数组，二维数组就储存对于的信息。  
```
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
```
# 系统运行截图
![实验结果截图](https://github.com/dongtianshuo/dongtianshuo2/blob/main/jieguo.png)
# 实验总结
学会面向对象的类设计方法（属性、方法）；学会类的继承用法，通过构造方法实例化对象，其中子类（老师类和学生类）都继承了父类（人员类）；学会使用super()，用于实例化子类；学会使用Object根类的toString（）方法,应用在相关对象的信息输出中,这种方法更加方便便捷，利于使用；在这次实验中运用了判断、循环、数组，让我对这些知识更加巩固。我进一步掌握了Java的编程规则、知识要点和一些小技巧，特别是定义类中的属性以及方法的编程思想和风格有了进一步的认识和体会。  

同时，因正确的编出程序而带来的成就感让我对编程更加感兴趣。对于在这些实验过程中，请教老师、同学互助、查阅资料等基本的学习方式，使我更加领悟到集体和团队的力量，也树立了敢于攻坚的信心。  
