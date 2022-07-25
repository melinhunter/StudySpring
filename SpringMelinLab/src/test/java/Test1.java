import com.melin.lab.autowired.test1.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author melin
 * @since 2022/7/22
 */
public class Test1 {
    @Test
    public void test001(){
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext("com.melin.lab.autowired.test1");

    }

    @Test
    public void test002(){
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext("com.melin.lab.autowired.test1");
        UserService service = ioc.getBean(UserService.class);
        service.draw();
    }
}
