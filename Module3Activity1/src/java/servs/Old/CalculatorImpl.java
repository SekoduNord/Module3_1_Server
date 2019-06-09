/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import java.io.IOException;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Olivier
 */
public class CalculatorImpl {


    public static void main(String... args) throws IOException {
        Endpoint ep = Endpoint.publish("http://localhost:9090/Calculator", new CalculatorWebService());
        System.out.println("Hit enter to quit");
        System.in.read();
        ep.stop();

    }

}
