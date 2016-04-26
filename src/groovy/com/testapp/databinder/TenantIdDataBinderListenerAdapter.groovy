package com.testapp.databinder

import org.grails.databinding.events.DataBindingListenerAdapter
import org.grails.databinding.events.DataBindingListener
/*import grails.web.api.WebAttributes*/
import groovy.transform.CompileStatic

class TenantIdDataBinderListenerAdapter extends DataBindingListenerAdapter implements DataBindingListener {
 	
	 void afterBinding(Object target, Object errors) {
		 if( target.hasProperty('tenantId') && !target.tenantId ) {
			 target.tenantId = 5l
		 }
		 super.afterBinding(target, errors)
	 }
}