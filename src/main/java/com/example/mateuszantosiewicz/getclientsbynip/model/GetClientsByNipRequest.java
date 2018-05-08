package com.example.mateuszantosiewicz.getclientsbynip.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientsByNipRequest")
public class GetClientsByNipRequest {
    @XmlElement(required = true)
    private String nip;
}
