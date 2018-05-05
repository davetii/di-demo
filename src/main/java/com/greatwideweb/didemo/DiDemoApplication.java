package com.greatwideweb.didemo;

import com.greatwideweb.didemo.controllers.ConstructorInjector;
import com.greatwideweb.didemo.controllers.MyController;
import com.greatwideweb.didemo.controllers.PropertyInjectedController;
import com.greatwideweb.didemo.controllers.SetterInjector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController my = (MyController) ctx.getBean("myController");
        System.out.println("MyController" + my.hello());

        PropertyInjectedController prop = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println("PropertyInjectedController says" + prop.sayHello());

        SetterInjector setter = (SetterInjector) ctx.getBean("setterInjector");
        System.out.println("SetterInjector says" + setter.sayHello());

        ConstructorInjector con = (ConstructorInjector) ctx.getBean("constructorInjector");
        System.out.println("ConstructorInjector says" + con.sayHello());

    }
}
