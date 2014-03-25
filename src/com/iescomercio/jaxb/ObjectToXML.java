/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iescomercio.jaxb;
 
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class ObjectToXML {
	public static void main(String[] args) {
 
	  Customer customer = new Customer();
	  customer.setId(100);
	  customer.setName("mkyong");
	  customer.setAge(29);
 
	  try {
                // Archivo a generar
		File file = new File("C:\\file.xml");
                
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		// Salida del fichero XML con formato bonito tabulación etc.
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		// Tiramos el XML al fichero
                jaxbMarshaller.marshal(customer, file);
		// Mostramos la salida por consola 
                jaxbMarshaller.marshal(customer, System.out);
 
	      } catch (JAXBException e) {
		e.printStackTrace();
	      }
 
	}
}