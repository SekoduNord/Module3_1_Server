/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import javax.jws.WebService;

/**
 *
 * @author Olivier
 */

    @WebService(targetNamespace = "http://localhost:9090/Calculator")
            
        interface CalculatorInterface {
               
        Double add(Double n1, Double n2);
        Double sub(Double n1, Double n2);
  
}
