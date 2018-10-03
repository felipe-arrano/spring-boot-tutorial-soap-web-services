//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.02 a las 04:21:46 PM CLST 
//


package com.in28minutes.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDetails" type="{http://in28minutes.com/students}StudentDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentDetails"
})
@XmlRootElement(name = "GetStudentDetailsResponse")
public class GetStudentDetailsResponse {

    @XmlElement(name = "StudentDetails", required = true)
    protected StudentDetails studentDetails;

    /**
     * Obtiene el valor de la propiedad studentDetails.
     * 
     * @return
     *     possible object is
     *     {@link StudentDetails }
     *     
     */
    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    /**
     * Define el valor de la propiedad studentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDetails }
     *     
     */
    public void setStudentDetails(StudentDetails value) {
        this.studentDetails = value;
    }

}
