package com.lzx.fescarinfrustructor.config;

import com.lzx.fescarinfrustructor.annotation.CodesafeModelAttribute;
import feign.Feign;
import feign.RequestInterceptor;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
@ConditionalOnClass({Feign.class})
public class FeignConfiguration {
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;

    private final Set<String> requestMethods = new HashSet<String>() {
        {
            add("GET");
            add("DELETE");
        }
    };

    @Bean
    public RequestInterceptor customFeignIntercepter(){
        return new CustomFeignIntercepter();
    }

    /*@Bean
    public Encoder encoder() {
        Encoder defaultEncoder = new SpringEncoder(this.messageConverters);
        return new SpringFormEncoder((object, bodyType, template) -> {
            if (requestMethods.contains(template.request().method())) {
                Class clazz = (Class) bodyType;
                if (clazz.getAnnotation(CodesafeModelAttribute.class) != null) {
                    for (Field field : clazz.getDeclaredFields()) {
                        field.setAccessible(true);
                        try {
                            Object data = field.get(object);
                            if (data == null) continue;
                            if (field.getType().getName().equals("java.util.List")) {
                                List<String> s = new ArrayList<>();
                                for (Object o : (List<?>) data) {
                                    if (o != null) s.add(o.toString());
                                }
                                template.query(field.getName(), s.toArray(new String[]{}));
                            } else {
                                template.query(field.getName(), data.toString());
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    return;
                }
            }
            defaultEncoder.encode(object, bodyType, template);
        });
    }*/
}
