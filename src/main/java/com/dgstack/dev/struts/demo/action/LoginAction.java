/**
 * 
 */
package com.dgstack.dev.struts.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dgstack.dev.struts.demo.forms.LoginForm;

/**
 * @author digvijayb
 *
 */
public class LoginAction extends Action {

	/**
	 * 
	 */
	public LoginAction() {
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		ActionForward actionForward =null;
		if("DGSTACK".equalsIgnoreCase(loginForm.getUsername()) && "PASS".equals(loginForm.getPassword())){
			request.getSession().setAttribute("username", loginForm.getUsername());
			actionForward = mapping.findForward("success");
		}else{
			request.setAttribute("loginError", true);
			actionForward = mapping.getInputForward();
			
		}
		return actionForward;
	}

}
