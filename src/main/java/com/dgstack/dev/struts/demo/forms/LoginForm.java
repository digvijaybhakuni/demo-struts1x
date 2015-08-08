/**
 * 
 */
package com.dgstack.dev.struts.demo.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author digvijayb
 *
 */
public class LoginForm extends ActionForm {

	
	private String username;
	private String password;
	
	
	/**
	 * 
	 */
	public LoginForm() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		if(errors==null){
			errors = new ActionErrors();
		}
		if(this.getUsername()==null || this.getUsername().isEmpty()){
			errors.add("dgstack.username.err",
			    	new ActionMessage("dgstack.error.username.empty"));
		}
		if(this.getPassword()==null || this.getPassword().isEmpty()){
			errors.add("dgstack.password.err",
			    	new ActionMessage("dgstack.error.password.empty"));
		}
		return errors;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.setUsername("");
		this.setPassword("");
	}
}
