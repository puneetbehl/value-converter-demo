package com.testapp

class TestController {

    def index(Person person) { 
	
		if(person.hasErrors()) {
			println person.errors.allErrors
			render "error"
		}
	
		println params
		
		println ""
		
		println "DOB: $person.tenantId"
		println "TenanId: $person.tenantId"
		
		render "ok"
	}

}
