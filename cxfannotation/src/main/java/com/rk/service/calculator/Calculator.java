package com.rk.service.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-25T00:15:55.544+05:30
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://www.rk.com/service/Calculator/", name = "Calculator")
@XmlSeeAlso({com.rk.schema.calculator.ObjectFactory.class, com.rk.schema.mwdsheader.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Calculator {

    @WebMethod(operationName = "AddOrMultiply", action = "http://www.rk.com/service/Calculator/AddOrMultiply")
    @WebResult(name = "calculateDataResponse", targetNamespace = "http://www.rk.com/schema/Calculator", partName = "calculateDataResponse")
    public com.rk.schema.calculator.CalculateDataResponse addOrMultiply(

        @WebParam(partName = "calculateDataRequest", name = "calculateDataRequest", targetNamespace = "http://www.rk.com/schema/Calculator")
        com.rk.schema.calculator.CalculateDataRequest calculateDataRequest,
        @WebParam(partName = "mwdsHeaderInfo", name = "mwdsHeaderInfo", targetNamespace = "http://www.rk.com/schema/MwdsHeader", header = true)
        com.rk.schema.mwdsheader.MwdsHeaderInfo mwdsHeaderInfo,
        @WebParam(partName = "mwdsHeaderInfoResponse", mode = WebParam.Mode.OUT, name = "mwdsHeaderInfoResponse", targetNamespace = "http://www.rk.com/schema/MwdsHeader", header = true)
        javax.xml.ws.Holder<com.rk.schema.mwdsheader.MwdsHeaderInfoResponse> mwdsHeaderInfoResponse
    );
}
