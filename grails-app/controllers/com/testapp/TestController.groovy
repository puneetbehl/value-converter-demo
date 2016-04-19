package com.testapp

class TestController {

    def index(Person person) { 
	
		println params
		
		println ""
		
		println person.dob
		
		render "ok"
	}
}
