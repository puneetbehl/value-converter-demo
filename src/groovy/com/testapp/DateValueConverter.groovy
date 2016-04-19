package com.testapp

import org.grails.databinding.converters.ValueConverter

class DateValueConverter implements ValueConverter {
	
	boolean canConvert(value) {
		value instanceof String
	}
	
	def convert(value) {
		return new Date()
	}
	
	Class<?> getTargetType() {
        Date
    }
}