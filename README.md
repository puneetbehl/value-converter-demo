# Grails Custom Data Converters Demo

####  What I want to do?

Basically, we have a mutli-tenant application where we need to parse date from string (in params) to Date object based on Tenant's timezone. For example - 

* For tenant 1 in IST zone, and '04/19/2015' in params means '04/18/2015 18:00 UTC' in db.
* For tenant 2 in CST zone, and '04/19/2015' in params means '04/19/2015 05:30 UTC' in db.

#### What's in this Sample Application?

We have created a `DateValueConverter.groovy` class in `src/groovy/com/testapp` as: 

```
package com.testapp

import org.grails.databinding.converters.ValueConverter

class DateValueConverter implements ValueConverter {
	
	boolean canConvert(value) {
		value instanceof String
	}
	
	def convert(value) {
		Date date = null
		// convert from value to date with specific timezone
		date
	}
	
	Class<?> getTargetType() {
        Date
    }
}
```

Following is the code from `grails-app/config/spring/resources.groovy`
```
beans = {
	
	dateConverter com.testapp.DateValueConverter
	
}
```

#### How to test?

Following the `index` action from `TestController` :
```
// .... 
    def index(Person person) { 
	
		println params
		
		println ""
		
		println person.dob
		
		render "ok"
	}
// ....
```

As it should be clear from the above that in order to test, try to hit <http://localhost:8080/test/index?firstName=John&dob=1980/04/19>. And you should see dob value in console.
