/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Olivier
 */

    @WebService(targetNamespace = "http://localhost:8084/Module31/Calculator")
            
        interface CalculatorInterface {
        
        @WebMethod(operationName = "add")
        Double add(Double n1, Double n2);
        @WebMethod(operationName = "sub")
        Double sub(Double n1, Double n2);
  
}
