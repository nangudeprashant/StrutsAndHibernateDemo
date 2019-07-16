package com.javaLive.interceptors;

import java.util.Iterator;
import java.util.Map;

import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javaLive.action.DatabaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class SimpleInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(SimpleInterceptor.class); // SLF4J
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		/* let us do some pre-processing */
		final ActionContext context = invocation.getInvocationContext();
		String output = "Pre-Processing";
		@SuppressWarnings("unchecked")
		Map<String, Object> parameters = (Map<String, Object>) context.get(ActionContext.PARAMETERS.toString());
		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			String value=null;
			Object obj = entry.getValue();
	        if (obj instanceof String[]){
	            String[] strArray = (String[]) obj;
	            if (strArray!=null) {
	            	value = strArray[0];
	            }
	    System.out.println("Key = " + entry.getKey() + ", Value = " + value );
	    logger.info("Key = " + entry.getKey() + ", Value = " + value);
		}
		}
		 ValueStack stack=invocation.getStack(); 
		    Iterator it =  stack.getRoot().iterator();
		    while( it.hasNext() )
		    {
		        Object object = it.next();
		        //DatabaseAction is my action class
		        if( object instanceof DatabaseAction )
		        {
		        	DatabaseAction usuario = (DatabaseAction)object;
		            usuario.setStudentAddress( usuario.getStudentAddress().toUpperCase() );
		        }
		    }
		/* let us call action or next interceptor */
		String result = invocation.invoke();

		/* let us do some post-processing */
		output = "Post-Processing";
		System.out.println(output);

		return result;
	}
}
