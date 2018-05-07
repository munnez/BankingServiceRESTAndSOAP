package com.example.mateuszantosiewicz.controllers;

import com.example.mateuszantosiewicz.models.Client;
import com.example.mateuszantosiewicz.models.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("clients")
public class ClientController {
    @Autowired
    ClientDAO clientDAO;

    @GetMapping()
    public List<Client> getCoach() {

        List<Client> clientsList = new ArrayList<>();
        clientDAO.findAll().forEach(clientsList::add);
        return clientsList;
    }
}
