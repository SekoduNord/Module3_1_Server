/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Olivier
 */
//Service Endpoint Interface
@WebService(serviceName = "CalculatorWebService")
@SOAPBinding(style = Style.DOCUMENT)

public class CalculatorWebService implements CalculatorClass.Calculator{

    /**
     * This is a sample web service operation
     */


    /**
     * This is a add web service operation
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return operation result
     */
    
    @Override
    @WebMethod(operationName = "add")
    public Double add(
            @WebParam(name = "number1") Double n1,
            @WebParam(name = "number2") Double n2) {
        return n1 + n2;
    }
    /**
     * This is a sub web service operation
     *
     * @param n1 number 1
     * @param n2 number 2
     * @return operation result
     */
    
    @Override
    @WebMethod(operationName = "sub")
    public Double sub(
            @WebParam(name = "number1") Double n1,
            @WebParam(name = "number2") Double n2) {
        return n1 - n2;
    }




}
