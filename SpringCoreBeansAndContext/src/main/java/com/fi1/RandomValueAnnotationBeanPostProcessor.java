package com.fi1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Component
public class RandomValueAnnotationBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean = [" + bean + "], beanName = [" + beanName + "]");
        // Get fields, get annotations for each field
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType() == RandomValue.class) {
                    System.out.println("annotation = [" + annotation + "]");
                    System.out.println("we found our annotation");
                }
            }
        }
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean = [" + bean + "], beanName = [" + beanName + "]");
        return null;
    }
}
