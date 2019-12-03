package com.ning.test;

import com.ning.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//如何给bean的属性赋值
//通过构造方法设置值
//设置注入(通过set方法) 属性是基本类型或String
public class Test {
    public static void main(String[] args) {
//        People people = new People();

        //对象是在加载这个配置文件的时候就被创建
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getBean里第一个参数是bean标签里的id值，第二个参数是返回值类型 如果没有第二个参数，默认是object
        //getBeanDefinitionNames,spring容器中目前所有管理的所有对象
        People peo = ac.getBean("peo", People.class);
        System.out.println(peo.getList().size());
        System.out.println(peo);

    }
}
