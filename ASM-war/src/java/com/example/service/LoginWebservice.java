/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import Beans.UsersFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import jdk.nashorn.internal.runtime.UserAccessorProperty;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "LoginWebservice")
public class LoginWebservice {
    @EJB 
    private UsersFacadeLocal usersFacade;
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "checklogin")
    public boolean checkLogin(@WebParam(name = "username") String username,@WebParam(name = "password") String password)
    {
        return usersFacade.checkLogin(username, password);
    }
}
