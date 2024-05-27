package com.yao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yao.di.Book;
import com.yao.ditest.*;

import java.sql.SQLOutput;

public class TestUser {

    public void testUserObject(){
        //加载spring配置文件，进行对象创建。
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println("user is" + user);
        user.add();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");


        Animal animal2 = context.getBean(Animal.class);
        System.out.println(animal2);
        animal2.eat();
        System.out.println("user is" + user);
        user.add();

        //测试JavaBean性能
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean.xml");
        Book book1 = (Book)context.getBean("book");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getBname());

        Book book3 = (Book)context.getBean("bookCon");
        System.out.println(book3.getBname());
        System.out.println(book3.getAuthor());

        Emp emp1= (Emp)context.getBean("emp", Emp.class);
        emp1.work();




    }
}
