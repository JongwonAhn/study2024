package hello.coree.scan.filter;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class ComponentFilterAppTest {

    @Test
    void filterScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        BeanA beanA = ac.getBean("beanA", BeanA.class);
    }

    @Configuration
    @ComponentScan(includeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyIncludeComponent.class),
            excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyExcludeComponent.class))
    static class ComponentFilterAppConfig{

    }
}
