package com.example.mateuszantosiewicz.getclientsbynip.endpoints;

import com.example.mateuszantosiewicz.getclientsbynip.GetClientsByNipConst;
import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipRequest;
import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipResponse;
import com.example.mateuszantosiewicz.getclientsbynip.process.GetClientsByNipProcess;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService(serviceName = "GetClientsByNipService", portName = "GetClientsByNipPort",
        targetNamespace = GetClientsByNipConst.NAMESPACE_URI)
public class GetClientsByNipEndpoint implements GetClientsByNip {

    @Autowired
    GetClientsByNipProcess process;

    public GetClientsByNipResponse getClientsByNip(GetClientsByNipRequest request)  {

            return process.call(request);

}
}
