package com.tzhu.ssm.appcomm;


import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class BaseSpringJunit {
    //import org.apache.log4j.Logger;
    public static Logger log = Logger.getLogger(BaseSpringJunit.class);


}
