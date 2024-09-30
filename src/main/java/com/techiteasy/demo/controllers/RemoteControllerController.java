package com.techiteasy.demo.controllers;

import com.techiteasy.demo.dto.RemoteControllerDto;
import com.techiteasy.demo.dto.RemoteControllerInputDto;
import com.techiteasy.demo.services.RemoteControllerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/remotecontrollers")
public class RemoteControllerController {

    private final RemoteControllerService remoteControllerService;

    // Constructor injectie voor RemoteControllerService
    public RemoteControllerController(RemoteControllerService remoteControllerService) {
        this.remoteControllerService = remoteControllerService;
    }

    // GET - Alle RemoteControllers ophalen
    @GetMapping
    public ResponseEntity<List<RemoteControllerDto>> getAllRemoteControllers() {
        List<RemoteControllerDto> remoteControllers = remoteControllerService.getAllRemoteControllers();
        return ResponseEntity.ok(remoteControllers);
    }

    // POST - Nieuwe RemoteController aanmaken
    @PostMapping
    public ResponseEntity<RemoteControllerDto> createRemoteController(@RequestBody RemoteControllerInputDto remoteControllerInputDto) {
        RemoteControllerDto createdRemoteController = remoteControllerService.createRemoteController(remoteControllerInputDto);
        return ResponseEntity.status(201).body(createdRemoteController);
    }

    // GET - Een RemoteController ophalen op basis van ID
    @GetMapping("/{id}")
    public ResponseEntity<RemoteControllerDto> getRemoteControllerById(@PathVariable Long id) {
        RemoteControllerDto remoteController = remoteControllerService.getRemoteControllerById(id);
        return ResponseEntity.ok(remoteController);
    }
}
