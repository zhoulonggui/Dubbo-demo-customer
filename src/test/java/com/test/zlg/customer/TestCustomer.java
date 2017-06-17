package com.test.zlg.customer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlg.test.po.User;
import com.zlg.test.provider.DemoService;

/**
 * @Title: TestCustomer.java
 * @Package: com.test.zlg.customer
 * @Description: TODO
 * @author: zhoulonggui
 * @date: 2017年6月17日 下午9:23:51
 * @version: V1.0
 */
public class TestCustomer {

	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
  
        DemoService demoService = (DemoService) context.getBean("demoService");  
        String hello = demoService.sayHello("zhoulonggui");  
        System.out.println(hello);  
  
        List<User> list = (List<User>)demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println("name:" + list.get(i).getName());  
            }  
        }  
        System.in.read();  
    } 
	
}
