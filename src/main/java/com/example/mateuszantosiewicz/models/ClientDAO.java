package com.example.mateuszantosiewicz.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientDAO extends CrudRepository<Client,Long> {
    public List<Client> findByNip(String nip);
}
