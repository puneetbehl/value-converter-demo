package com.testapp.constraints

import com.testapp.Person
import grails.test.mixin.TestMixin
import grails.test.mixin.web.ControllerUnitTestMixin
import spock.lang.Specification

@TestMixin(ControllerUnitTestMixin)
class PhoneConstraintSpec extends Specification {
	void "test phone number constraint"() {
		when:
		Person person = new Person(cellNumber: "7327942389473827492")
		
		then:
		!person.validate() &
		person.errors.getFieldError('cellNumber').code == 'invalid'
	}
		
}