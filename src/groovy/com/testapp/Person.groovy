package com.testapp

import grails.validation.Validateable

@Validateable
class Person {
    String firstName
    Date dob
}