/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Olivier
 */
@WebService(serviceName = "Calculator")
public class Calculator implements CalculatorInterface {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "add")
    @Override
    public Double add(Double n1, Double n2) {
        return n1 + n2;
    }

    @WebMethod(operationName = "sub")
    @Override
    public Double sub(Double n1, Double n2) {
        return n1 - n2;
    }
}
