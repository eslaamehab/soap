
package com.cibeg.esb.financial.services.v5_0.correspondence;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.cibeg.esb.financial.objects.v5_0.correspondence.CrospendanceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cibeg.esb.financial.services.v5_0.correspondence package. 
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

    private final static QName _ExecuteCorrespondenceOperationRequest_QNAME = new QName("http://www.cibeg.com/esb/financial/services/v5.0/correspondence", "executeCorrespondenceOperationRequest");
    private final static QName _ExecuteCorrespondenceOperationResponse_QNAME = new QName("http://www.cibeg.com/esb/financial/services/v5.0/correspondence", "executeCorrespondenceOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cibeg.esb.financial.services.v5_0.correspondence
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteCorrespondenceOperationResponseType }
     * 
     */
    public ExecuteCorrespondenceOperationResponseType createExecuteCorrespondenceOperationResponseType() {
        return new ExecuteCorrespondenceOperationResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrospendanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrospendanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cibeg.com/esb/financial/services/v5.0/correspondence", name = "executeCorrespondenceOperationRequest")
    public JAXBElement<CrospendanceType> createExecuteCorrespondenceOperationRequest(CrospendanceType value) {
        return new JAXBElement<CrospendanceType>(_ExecuteCorrespondenceOperationRequest_QNAME, CrospendanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCorrespondenceOperationResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExecuteCorrespondenceOperationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cibeg.com/esb/financial/services/v5.0/correspondence", name = "executeCorrespondenceOperationResponse")
    public JAXBElement<ExecuteCorrespondenceOperationResponseType> createExecuteCorrespondenceOperationResponse(ExecuteCorrespondenceOperationResponseType value) {
        return new JAXBElement<ExecuteCorrespondenceOperationResponseType>(_ExecuteCorrespondenceOperationResponse_QNAME, ExecuteCorrespondenceOperationResponseType.class, null, value);
    }

}
