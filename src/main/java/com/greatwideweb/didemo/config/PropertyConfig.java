package com.greatwideweb.didemo.config;

import com.greatwideweb.examplebeans.FakeDataSource;
import com.greatwideweb.examplebeans.FakeJmsBroker;
import com.greatwideweb.examplebeans.FakeSupportDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
 @PropertySource("classpath:datasource.properties"),
 @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${greatwideweb.ds.user}")
    String user;
    @Value("${greatwideweb.ds.password}")
    String password;
    @Value("${greatwideweb.ds.url}")
    String url;

    @Value("${greatwideweb.jms.user}")
    String jmsUser;
    @Value("${greatwideweb.jms.password}")
    String jmsPassword;
    @Value("${greatwideweb.jms.url}")
    String jmsURL;

    @Value("${greatwideweb.support.level1}")
    String level1;

    @Value("${greatwideweb.support.level2}")
    String level2;

    @Value("${greatwideweb.support.level3}")
    String level3;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fds = new FakeDataSource();
        fds.setPassword(password);
        fds.setUrl(url);
        fds.setUser(user);
        return fds;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fjb = new FakeJmsBroker();
        fjb.setPassword(jmsPassword);
        fjb.setUrl(jmsURL);
        fjb.setUser(jmsUser);
        return fjb;
    }

    @Bean
    public FakeSupportDetails fakeSupportDetails() {
        FakeSupportDetails fsd = new FakeSupportDetails();
        fsd.setLevel1(level1);
        fsd.setLevel2(level2);
        fsd.setLevel3(level3);
        return fsd;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;

    }

}
