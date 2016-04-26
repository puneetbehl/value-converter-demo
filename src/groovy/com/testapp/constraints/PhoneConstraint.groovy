package com.testapp.constraints

import org.codehaus.groovy.grails.validation.AbstractConstraint
import org.springframework.validation.Errors
import java.util.regex.Pattern

class PhoneConstraint extends AbstractConstraint {

    static final String CONSTRAINT_NAME = "phoneNumber"
    static final Pattern REGEXP = Pattern.compile(/\d{10}/)
    static final String DEFAULT_CODE = "invalid"
    static final String DEFAULT_MESSAGE_CODE = "default.phoneNumber.invalid.message"

    @Override
    protected void processValidate(Object target, Object propertyValue, Errors errors) {
        if (propertyValue && !REGEXP.matcher(propertyValue).matches()) {
            Object[] args = [constraintPropertyName, constraintOwningClass, propertyValue]
            rejectValue(target, errors, DEFAULT_MESSAGE_CODE, DEFAULT_CODE, args)
        }
    }

    @Override
    boolean supports(Class type) {
        return type && String.class.isAssignableFrom(type)
    }

    @Override
    String getName() {
        CONSTRAINT_NAME
    }
}