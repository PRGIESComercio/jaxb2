/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iescomercio.jaxb;
 
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 
public class XMLToObject {
	public static void main(String[] args) {
 
	 try {
                // Creación del archivo para leer
		File file = new File("C:\\file.xml");
		
                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class); 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                
                // Nos creamos un objeto de tipo Cliente a partir del fichero
		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
 
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
 
	}
}