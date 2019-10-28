package com.study.javautil.utils;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


public class BeanValidator {
    private static BeanValidator dtoValidator;
    private static Validator javaxValidator;

    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javaxValidator = factory.getValidator();
        dtoValidator = new BeanValidator();
    }

    private BeanValidator() {
    }

    /**
     * 获取单例
     * @return
     */
    public static BeanValidator getInstance() {
        return dtoValidator;
    }
    public <T> String validate(T dto) {
        Set<ConstraintViolation<T>> constraintViolations = javaxValidator.validate(dto);
        if (constraintViolations == null || constraintViolations.isEmpty()) {
            return null;
        }

        for (ConstraintViolation<?> constraintViolation : constraintViolations) {
            if (StringUtils.isNotEmpty(constraintViolation.getMessage())){
                return constraintViolation.getMessage();
            }
        }
        return null;
    }
}
