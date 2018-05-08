package com.example.mateuszantosiewicz.getclientsbynip.model;


import com.example.mateuszantosiewicz.models.Client;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientsByNipResponse")
public class GetClientsByNipResponse {

    List<Client>  clients;


}
