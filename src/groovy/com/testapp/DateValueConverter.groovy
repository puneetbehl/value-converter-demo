package com.testapp

import org.grails.databinding.converters.ValueConverter

class DateValueConverter implements ValueConverter {
	
	boolean canConvert(value) {
		value instanceof String
	}
	
	def convert(value) {
		new Date()
	}
	
	Class<?> getTargetType() {
        Date.class
    }
}