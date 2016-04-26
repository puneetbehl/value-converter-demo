import com.testapp.DateValueConverter
import com.testapp.databinder.TenantIdDataBinderListenerAdapter

// Place your Spring DSL code here
beans = {
	
	dateConverter DateValueConverter
	tenantIdDataBinderListenerAdapter TenantIdDataBinderListenerAdapter
	
}
