package com.testapp

import grails.validation.Validateable

@Validateable( nullable = true )
class Address {
	String streetAddress
	String city
	String state
	String postalCode
	String contact
	
	static constraints = {
		streetAddress nullable: false
		contact phoneNumber: true
	}
}