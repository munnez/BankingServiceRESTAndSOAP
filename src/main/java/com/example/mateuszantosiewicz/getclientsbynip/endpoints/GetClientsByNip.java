package com.example.mateuszantosiewicz.getclientsbynip.endpoints;


import com.example.mateuszantosiewicz.getclientsbynip.GetClientsByNipConst;
import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipRequest;
import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.validation.Valid;

@WebService(name = "GetClientsByNip", targetNamespace = GetClientsByNipConst.NAMESPACE_URI)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetClientsByNip {
    @WebResult(name="getClientsByNip")
    GetClientsByNipResponse getClientsByNip(@WebParam(name = "getClientsByNipRequest") @Valid GetClientsByNipRequest request);
}
