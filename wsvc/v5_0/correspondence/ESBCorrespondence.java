package com.cibeg.esb.wsvc.v5_0.correspondence;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2023-07-17T18:01:46.876+02:00
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://www.cibeg.com/esb/wsvc/v5.0/correspondence/", name = "ESB_Correspondence")
@XmlSeeAlso({com.cibeg.esb.common.v5_0.enums.ObjectFactory.class, com.cibeg.esb.financial.services.v5_0.correspondence.ObjectFactory.class, com.cibeg.esb.common.v1_0.header.ObjectFactory.class, com.cibeg.esb.financial.objects.v5_0.correspondence.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBCorrespondence {

    @WebMethod(action = "http://www.cibeg.com/esb/wsvc/v5.0correspondence/retrievecorrespondenceOperation")
    @WebResult(name = "executeCorrespondenceOperationResponse", targetNamespace = "http://www.cibeg.com/esb/financial/services/v5.0/correspondence", partName = "ExecuteCorrespondenceOperationRs")
    public com.cibeg.esb.financial.services.v5_0.correspondence.ExecuteCorrespondenceOperationResponseType correspondence(

        @WebParam(partName = "ExecuteCorrespondenceOperationRq", name = "executeCorrespondenceOperationRequest", targetNamespace = "http://www.cibeg.com/esb/financial/services/v5.0/correspondence")
        com.cibeg.esb.financial.objects.v5_0.correspondence.CrospendanceType executeCorrespondenceOperationRq,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.INOUT, name = "MsgHdr", targetNamespace = "http://www.cibeg.com/esb/common/v1.0/header", header = true)
        javax.xml.ws.Holder<com.cibeg.esb.common.v1_0.header.BasicMessageHeaderType> messageHeader
    );
}
