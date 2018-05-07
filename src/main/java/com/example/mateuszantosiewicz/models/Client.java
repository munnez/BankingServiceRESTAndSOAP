package com.example.mateuszantosiewicz.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "clients")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer clientId;
    private String name;
    private String surname;
    private String pesel;
    private String nip;
    private BigDecimal creditAmount;
}
