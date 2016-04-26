package com.testapp

import grails.validation.Validateable

@Validateable( nullable = true )
class Address {
	String streetAddress
	String city
	String state
	String postalCode
	
	static constraints = {
		streetAddress nullable: false
	}
}