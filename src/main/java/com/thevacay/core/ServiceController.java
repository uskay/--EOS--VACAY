package com.thevacay.core;

import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by uskay on 1/26/15.
 */
public class ServiceController {

    public IResponse execute(String serviceName, String resourceName, IRequest bean, BindingResult bindingResult, HttpServletRequest rawRequest){

        //Check bindingResult
        if(bindingResult.hasErrors()){
            return null;
        }

        String rootPackage = "com.thevacay";
        String servicePackage = "service." + serviceName;
        String className = serviceName.substring(0,1).toUpperCase() + serviceName.substring(1) + "Service";

        try {
            Class<?> clazz = Class.forName(rootPackage + "." + servicePackage + "." + className);
            Method executeMethod = null;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods){

                ServiceAnnotation serviceAnnotation = m.getAnnotation(ServiceAnnotation.class);
                if(resourceName == null || serviceAnnotation == null){
                    continue;
                }
                if(resourceName.equals(serviceAnnotation.resource())){
                    executeMethod = m;
                    break;
                }
            }


            if(executeMethod == null) {
                return null;
            }

            Object obj = clazz.newInstance();
            return (IResponse) executeMethod.invoke(obj, new Object[]{bean});

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

}
