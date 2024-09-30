package com.techiteasy.demo.services;

import com.techiteasy.demo.dto.RemoteControllerDto;
import com.techiteasy.demo.dto.RemoteControllerInputDto;
import com.techiteasy.demo.mapping.RemoteControllerMapper;
import com.techiteasy.demo.models.RemoteController;
import com.techiteasy.demo.repositories.RemoteControllerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RemoteControllerService {

    private final RemoteControllerRepository remoteControllerRepository;

    public RemoteControllerService(RemoteControllerRepository remoteControllerRepository) {
        this.remoteControllerRepository = remoteControllerRepository;
    }

    // Ophalen van alle RemoteControllers
    public List<RemoteControllerDto> getAllRemoteControllers() {
        return remoteControllerRepository.findAll().stream()
                .map(RemoteControllerMapper::toRemoteControllerDto)
                .collect(Collectors.toList());
    }

    // Ophalen van een RemoteController op basis van ID
    public RemoteControllerDto getRemoteControllerById(Long id) {
        RemoteController remoteController = remoteControllerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("RemoteController not found with id: " + id));
        return RemoteControllerMapper.toRemoteControllerDto(remoteController);
    }

    // Aanmaken van een nieuwe RemoteController
    public RemoteControllerDto createRemoteController(RemoteControllerInputDto remoteControllerInputDto) {
        RemoteController remoteController = RemoteControllerMapper.toRemoteController(remoteControllerInputDto);
        RemoteController savedRemoteController = remoteControllerRepository.save(remoteController);
        return RemoteControllerMapper.toRemoteControllerDto(savedRemoteController);
    }
}
