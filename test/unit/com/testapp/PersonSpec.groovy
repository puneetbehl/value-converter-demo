package com.testapp

import spock.lang.Specification
import grails.test.mixin.TestMixin
import grails.test.mixin.web.ControllerUnitTestMixin

@TestMixin(ControllerUnitTestMixin)
class PersonSpec extends Specification {
	
	void "test nested constraints" () {
		when:
		Person person = new Person()
		
		then:
		!person.validate() &
		person.errors.getFieldError('streetAddress')?.code == 'nullable'
	}
	
	void "should not show error on address.contact"() {
		when:
		Person person = new Person()
		
		then:
		!person.validate() &
		person.errors.getFieldError('address.contact')?.code == null 
	}
	
}