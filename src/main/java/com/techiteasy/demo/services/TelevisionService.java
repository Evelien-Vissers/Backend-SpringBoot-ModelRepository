package com.techiteasy.demo.services;

import com.techiteasy.demo.mapping.TelevisionMapper;
import com.techiteasy.demo.models.Television;
import com.techiteasy.demo.repositories.TelevisionRepository;
import com.techiteasy.demo.dto.TelevisionDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class TelevisionService {
    private final TelevisionRepository televisionRepository;

    //Connectie van Service en de Repository dmv een constructor injection:
    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }
    //Gebruik mapper:
    public TelevisionDto getTelevisionDtoById(Long id) {
        Television television = televisionRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Television with id " + id + "not found"));
            return TelevisionMapper.toTelevisionDto(television);
        }


    //Functie voor opslaan van 1 Television:
    public Television createTelevision(Television television) {
    return televisionRepository.save(television);
    }

    //Functie voor het ophalen van alle Televisions:
    public List<Television> getAllTelevisions() {
        return televisionRepository.findAll();
    }
    //Functie voor het ophalen van 1 Television:
    //Er wordt hier 'Optional<Television> gebruikt om te voorkomen dat er een 'NullPointerException' optreedt als de tv niet wordt gevonden.
    public Optional<Television> getTelevisionById(Long id) {
        return televisionRepository.findById(id);
    }

    //Functie voor het verwijderen van 1 Television:
    public void deleteTelevisionById(Long id) {
        if (televisionRepository.existsById(id)) {
            televisionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Television with id " + id + " not found");
        }
    }
}

