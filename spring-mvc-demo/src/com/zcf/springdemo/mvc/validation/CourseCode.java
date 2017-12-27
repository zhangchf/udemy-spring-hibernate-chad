package com.zcf.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangchf on 27/12/2017.
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {
    String value() default "LUV";
    String message() default "must with with LUV";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
