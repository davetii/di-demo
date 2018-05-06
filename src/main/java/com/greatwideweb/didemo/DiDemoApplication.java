package com.greatwideweb.didemo;

import com.greatwideweb.didemo.controllers.MyController;
import com.greatwideweb.examplebeans.FakeDataSource;
import com.greatwideweb.examplebeans.FakeJmsBroker;
import com.greatwideweb.examplebeans.FakeSupportDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan(basePackages = {"com.greatwideweb.didemo.controllers", "com.greatwideweb.didemo"})
public class DiDemoApplication {

    @Autowired
    static Environment env;

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController my = (MyController) ctx.getBean("myController");
        FakeDataSource fds = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        FakeJmsBroker fjb = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        FakeSupportDetails fsd = (FakeSupportDetails) ctx.getBean(FakeSupportDetails.class);

        System.out.println("DataSource user: " + fds.getUser());
        System.out.println("JMS user: " + fjb.getUser());
        System.out.println("Level 1 Support: " + fsd.getLevel1());

    }
}
