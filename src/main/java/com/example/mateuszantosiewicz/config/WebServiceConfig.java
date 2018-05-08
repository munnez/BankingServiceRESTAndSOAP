package com.example.mateuszantosiewicz.config;


import com.example.mateuszantosiewicz.getclientsbynip.endpoints.GetClientsByNipEndpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Autowired
    Bus bus;

    @Bean
    public GetClientsByNipEndpoint getClientsByNip() {
        return new GetClientsByNipEndpoint();
    }


    @Bean
    public Endpoint getClients() {
        EndpointImpl endpoint = new EndpointImpl(bus, getClientsByNip());
        endpoint.publish("/getClientsByNip");
        return endpoint;
    }


}
