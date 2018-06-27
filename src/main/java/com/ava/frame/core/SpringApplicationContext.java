package com.ava.frame.core;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Map;
@Component
public class SpringApplicationContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    @SuppressWarnings("unchecked")
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContext.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        Object object = null;
        if (applicationContext != null) {
            object = applicationContext.getBean(name);
        }
        return (T) object;
    }

    public static <T extends Annotation> Map<String, Object> getBeansWithAnnotation(Class<T> t) {
        return applicationContext.getBeansWithAnnotation(t);
    }
}
