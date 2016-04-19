package com.testapp

import org.grails.databinding.converters.AbstractStructuredBindingEditor

class StructuredDateEditor extends AbstractStructuredBindingEditor<Date> {

    public Date getPropertyValue(Map values) {
		println "Called .... "
        new Date()
    }
}