/**
 * 
 */
package com.dgstack.dev.struts.demo.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author digvijayb
 *
 */
public class ChangeLanguageAction extends Action {

	/**
	 * 
	 */
	public ChangeLanguageAction() {
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		if("hi".equals(request.getParameter("to"))){
			request.getSession().setAttribute(Globals.LOCALE_KEY, new  Locale("hi"));//Locale for hindi is not present by default so we to add one for hindi.
		}else if("fr".equals(request.getParameter("to"))){
			request.getSession().setAttribute(Globals.LOCALE_KEY,Locale.FRENCH);
		}else if("en".equals(request.getParameter("to"))){
			request.getSession().setAttribute(Globals.LOCALE_KEY,Locale.ENGLISH);
		}else if("es".equals(request.getParameter("to"))){
			request.getSession().setAttribute(Globals.LOCALE_KEY,new  Locale("es"));//Locale for spanish is not present by default so we to add one for spanish.
		}else if("de".equals(request.getParameter("to"))){
			request.getSession().setAttribute(Globals.LOCALE_KEY,Locale.GERMAN);
		} 
		
		return mapping.getInputForward();
	}

}
