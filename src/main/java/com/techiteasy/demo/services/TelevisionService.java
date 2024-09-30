package com.techiteasy.demo.services;

import com.techiteasy.demo.dto.TelevisionInputDto;
import com.techiteasy.demo.dto.TelevisionSalesDto;
import com.techiteasy.demo.mapping.TelevisionMapper;
import com.techiteasy.demo.models.CIModule;
import com.techiteasy.demo.models.RemoteController;
import com.techiteasy.demo.models.Television;
import com.techiteasy.demo.repositories.RemoteControllerRepository;
import com.techiteasy.demo.repositories.TelevisionRepository;
import com.techiteasy.demo.dto.TelevisionDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
// Omdat ik een aparte 'TelevisionMapper' heb aangemaakt, heb ik ervoor gekozen om de DTO-conversielogica niet in de servicelaag te implementeren. Door de mapper-methode in de 'TelevisionService' te gebruiken, vond ik dit beter gestructureerd en onderhoudbaar. Hierdoor kan de servicelaag zich concentreren op de logica en interactie met de repository, terwijl de mapper zorgt voor de conversies tussen DTO's en entiteiten.


public class TelevisionService {
    private final TelevisionRepository televisionRepository;
    private final RemoteControllerRepository remoteControllerRepository;

    //Connectie van Service en de Repository dmv een constructor injection:
    public TelevisionService(TelevisionRepository televisionRepository,
            RemoteControllerRepository remoteControllerRepository) {
        this.televisionRepository = televisionRepository;
        this.remoteControllerRepository = remoteControllerRepository;
    }

    //Functie om een RemoteController aan een Television te koppelen
    public TelevisionDto assignRemoteControllerToTelevision(Long televisionId, Long remoteControllerId) {

        // Haal de Television op uit de database
        Television television = televisionRepository.findById(televisionId)
                .orElseThrow(() -> new EntityNotFoundException("Television with id " + televisionId + " not found"));

        // Haal de RemoteController op uit de database
        RemoteController remoteController = remoteControllerRepository.findById(remoteControllerId)
                .orElseThrow(() -> new EntityNotFoundException("RemoteController with id " + remoteControllerId + " not found"));

        // Koppel de RemoteController aan de Television
        television.setRemoteController(remoteController);

        // Sla de bijgewerkte Television op
        Television savedTelevision = televisionRepository.save(television);

        // Retourneer de bijgewerkte TelevisionDto
        return TelevisionMapper.toTelevisionDto(savedTelevision);
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
    public List<TelevisionDto> getAllTelevisions() {
        List<Television> televisions = televisionRepository.findAll();
        return televisions.stream()
                .map(TelevisionMapper::toTelevisionDto)
                .collect(Collectors.toList());
    }
    //Functie voor het ophalen van 1 Television:
    //Er wordt hier 'Optional<Television> gebruikt om te voorkomen dat er een 'NullPointerException' optreedt als de tv niet wordt gevonden.
    public Optional<TelevisionDto> getTelevisionById(Long id) {
        Optional<Television> television = televisionRepository.findById(id);
        return television.map(TelevisionMapper::toTelevisionDto);
    }

    public TelevisionDto createTelevision(TelevisionInputDto televisionInputDto) {
        Television television = TelevisionMapper.toTelevision(televisionInputDto);
        Television savedTelevision = televisionRepository.save(television);
        return TelevisionMapper.toTelevisionDto(savedTelevision);
    }

    //Functie voor het verwijderen van 1 Television:
    public void deleteTelevisionById(Long id) {
        if (televisionRepository.existsById(id)) {
            televisionRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Television with id " + id + " not found");
        }
    }

    //Deze methode haalt alle televisies op uit de repository, zet ze om naar 'TelevisionSalesDto' en retourneert een lijst.
    public List<TelevisionSalesDto> getTelevisionSalesInfo() {
            return televisionRepository.findAll().stream()
                    .map(TelevisionMapper::toTelevisionSalesDto)
                    .collect(Collectors.toList());
        }

    // Functie om een CiModule aan een Television te koppelen
    public TelevisionDto assignCiModuleToTelevision(Long televisionId, Long ciModuleId) {
        Television television = televisionRepository.findById(televisionId)
                .orElseThrow(() -> new EntityNotFoundException("Television with id " + televisionId + " not found"));

        CIModule ciModule = ciModuleRepository.findById(ciModuleId)
                .orElseThrow(() -> new EntityNotFoundException("CiModule with id " + ciModuleId + " not found"));

        ciModule.setTelevision(television);
        ciModuleRepository.save(ciModule);

        return TelevisionMapper.toTelevisionDto(television);
    }


    }


