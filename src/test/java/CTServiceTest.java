
import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ct.bean.User;
import ct.service.IUserService;

public class CTServiceTest{
    
    private ApplicationContext context;
    private IUserService userService;
    
    @BeforeMethod
    public void setUp(){
        context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userService = context.getBean(IUserService.class);
    }
    
    @AfterMethod
    public void tearDown(){
    	//userService.clear();
    }
    
    @Test
    public void testTestProjectMaintain()
    {
        AssertJUnit.assertNotNull(userService);
        User user = new User();
        user.setUserName("testUser");
        user.setPassword("testPasswd");
        user.setDescription("description");
        userService.saveUser(user);
    }
    
    @Test
    public void testTestProjectMaintain1()
    {
        AssertJUnit.assertNotNull(userService);
        User user = buildRandomUser();
        userService.saveUser(user);
    }
    
    private User buildRandomUser(){
        User user = new User();
        user.setUserName(randomString(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'}, 4));
        user.setPassword(randomString(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'}, 4));
        user.setDescription("description");
        return user;
    }
    
    private static String randomString(char[] characterSet, int length) {
        Random random = new SecureRandom();
        char[] result = new char[length];
        for (int i = 0; i < result.length; i++) {
            // picks a random index out of character set > random character
            int randomCharIndex = random.nextInt(characterSet.length);
            result[i] = characterSet[randomCharIndex];
        }
        return new String(result);
    }
}
