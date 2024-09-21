package com.techiteasy.demo.controllers;

import com.techiteasy.demo.dto.TelevisionDto;
import com.techiteasy.demo.dto.TelevisionInputDto;
import com.techiteasy.demo.exceptions.RecordNotFoundException;
import com.techiteasy.demo.mapping.TelevisionMapper;
import com.techiteasy.demo.models.Television;
import com.techiteasy.demo.services.TelevisionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/televisions")
public class TelevisionController {

    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    // GET - request voor alle televisies
    @GetMapping
    public ResponseEntity<List<TelevisionDto>> getAllTelevisions() {
        List<TelevisionDto> televisionDto = televisionService.getAllTelevisions();
        return ResponseEntity.ok(televisionDto);
    }

    // GET - request voor 1 televisie
    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDto> getTelevisionById(@PathVariable Long id) {
        Optional<TelevisionDto> television = televisionService.getTelevisionById(id);

        return television.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


    // POST - request voor het aanmaken van 1 televisie
    @PostMapping
    public ResponseEntity<TelevisionDto> createTelevision(@RequestBody TelevisionInputDto televisionInputDto) {
        Television television = TelevisionMapper.toTelevision(televisionInputDto);
        Television savedTelevision = televisionService.createTelevision(television);
        return ResponseEntity.status(HttpStatus.CREATED).body(TelevisionMapper.toTelevisionDto(savedTelevision));
    }

    // DELETE - request voor het verwijderen van 1 televisie
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevisionById(@PathVariable Long id) {
        try {
            televisionService.deleteTelevisionById(id);
            return ResponseEntity.noContent().build();
        } catch (RecordNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
