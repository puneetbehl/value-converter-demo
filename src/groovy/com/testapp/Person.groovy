package com.testapp

import grails.validation.Validateable

@Validateable
class Person {
    String firstName
    Date dob
	Long tenantId
	String cellNumber
	Address address = new Address()
	
	static constraints = {
		cellNumber phoneNumber: true
		address nullable: false
	}
	
}