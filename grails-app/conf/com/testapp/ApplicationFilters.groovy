package com.testapp

class ApplicationFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
				println "In application filter"
/*				params.tenantId = 11l*/
				
/*				println ">>>>$params"*/
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
