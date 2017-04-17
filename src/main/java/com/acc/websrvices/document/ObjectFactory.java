
package com.acc.websrvices.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.geronimo.samples.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DollarToRupees_QNAME = new QName("http://jaxws.samples.geronimo.apache.org", "dollarToRupees");
    private final static QName _RupeesToEuro_QNAME = new QName("http://jaxws.samples.geronimo.apache.org", "rupeesToEuro");
    private final static QName _DollarToRupeesResponse_QNAME = new QName("http://jaxws.samples.geronimo.apache.org", "dollarToRupeesResponse");
    private final static QName _RupeesToEuroResponse_QNAME = new QName("http://jaxws.samples.geronimo.apache.org", "rupeesToEuroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.geronimo.samples.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RupeesToEuroResponse }
     * 
     */
    public RupeesToEuroResponse createRupeesToEuroResponse() {
        return new RupeesToEuroResponse();
    }

    /**
     * Create an instance of {@link DollarToRupeesResponse }
     * 
     */
    public DollarToRupeesResponse createDollarToRupeesResponse() {
        return new DollarToRupeesResponse();
    }

    /**
     * Create an instance of {@link DollarToRupees }
     * 
     */
    public DollarToRupees createDollarToRupees() {
        return new DollarToRupees();
    }

    /**
     * Create an instance of {@link RupeesToEuro }
     * 
     */
    public RupeesToEuro createRupeesToEuro() {
        return new RupeesToEuro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.samples.geronimo.apache.org", name = "dollarToRupees")
    public JAXBElement<DollarToRupees> createDollarToRupees(DollarToRupees value) {
        return new JAXBElement<DollarToRupees>(_DollarToRupees_QNAME, DollarToRupees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RupeesToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.samples.geronimo.apache.org", name = "rupeesToEuro")
    public JAXBElement<RupeesToEuro> createRupeesToEuro(RupeesToEuro value) {
        return new JAXBElement<RupeesToEuro>(_RupeesToEuro_QNAME, RupeesToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRupeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.samples.geronimo.apache.org", name = "dollarToRupeesResponse")
    public JAXBElement<DollarToRupeesResponse> createDollarToRupeesResponse(DollarToRupeesResponse value) {
        return new JAXBElement<DollarToRupeesResponse>(_DollarToRupeesResponse_QNAME, DollarToRupeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RupeesToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.samples.geronimo.apache.org", name = "rupeesToEuroResponse")
    public JAXBElement<RupeesToEuroResponse> createRupeesToEuroResponse(RupeesToEuroResponse value) {
        return new JAXBElement<RupeesToEuroResponse>(_RupeesToEuroResponse_QNAME, RupeesToEuroResponse.class, null, value);
    }

}
