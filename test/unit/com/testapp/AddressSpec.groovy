package com.testapp

import spock.lang.Specification
import grails.test.mixin.TestMixin
import grails.test.mixin.web.ControllerUnitTestMixin


@TestMixin(ControllerUnitTestMixin)
class AddressSpec extends Specification {
	void testValidate() {
		when:
		Address address = new Address() 
		
		then:
		!address.validate() &
		address.errors.getFieldError('streetAddress').code == 'nullable'
		
	}
}