//文件名必须与public类名相同，并且扩展名必须为.java
//java最初叫做OAK，由James Gosling在1995年开发，现在改名为Java。
/*
Java平台分为三个部分：SE(Standard Edition)、EE(Enterprise Edition)、ME(Micro Edition)。
SE是Java的标准版，包含了开发环境、运行环境、API、开发工具、数据库支持、图形用户界面等。
EE是Java的企业版，包含了Java的全部功能，并且可以部署到服务器上运行。
ME是Java的微型版，包含了Java的核心功能，适合嵌入式系统、移动设备等。
*/

/*
特点：
1.面向对象：Java是一门面向对象的语言，支持封装、继承、多态等概念。
2.可移植性：Java可以编译到任何平台上运行，包括Windows、Linux、Mac OS、Android、iOS等。
3.安全性：Java有垃圾回收机制，可以自动管理内存，防止内存泄漏。
*/

//.java文件编译后为.class文件，.class文件可解释直接运行
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int a;
    //输入一个数字
    Scanner sc = new Scanner(System.in);
    //读取输入
    a = sc.nextInt();
    //输出
    System.out.println("You entered: " + a);

    //这里创建了一个MyClass类的对象，并调用了它的x成员变量
    MyClass obj = new MyClass();
    System.out.println(obj.x);

    //调用Add类的add函数
    int result = new Add().add(5, 10);
    System.out.println("5 + 10 = " + result);
  }

  
}

//函数实现用类的形式，而不是用main函数的形式
class Add {
  public int add(int a, int b) {
    return a + b;
  }
}


//一个文件可以包含多个类，但是一个文件只能有一个public类。
//在这里，我们定义了一个名为MyClass的类，它有一个名为x的成员变量。
class MyClass {
  int x = 10;
}


//JVM 编译器会把 Main.java 编译成 Main.class 文件，然后运行该文件。(翻译官)
