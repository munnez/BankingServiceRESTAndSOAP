package com.example.mateuszantosiewicz.getclientsbynip.process;


import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipRequest;
import com.example.mateuszantosiewicz.getclientsbynip.model.GetClientsByNipResponse;

import com.example.mateuszantosiewicz.models.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GetClientsByNipProcess {
@Autowired
ClientDAO clientDAO;

    public GetClientsByNipResponse call(GetClientsByNipRequest request) {
        GetClientsByNipResponse response = new GetClientsByNipResponse();
       response.setClients(clientDAO.findByNip(request.getNip()));
        return response;
    }


}
