package com.techiteasy.demo.controllers;

import com.techiteasy.demo.dto.CIModuleDto;
import com.techiteasy.demo.dto.CIModuleInputDto;
import com.techiteasy.demo.services.CIModuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cimodules")
public class CIModuleController {

    private final CIModuleService ciModuleService;

    // Constructor injectie voor CIModuleService
    public CIModuleController(CIModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }

    // GET - Alle CIModules ophalen
    @GetMapping
    public ResponseEntity<List<CIModuleDto>> getAllCIModules() {
        List<CIModuleDto> ciModules = ciModuleService.getAllCIModules();
        return ResponseEntity.ok(ciModules);
    }

    // POST - Nieuwe CIModule aanmaken
    @PostMapping
    public ResponseEntity<CIModuleDto> createCIModule(@RequestBody CIModuleInputDto ciModuleInputDto) {
        CIModuleDto createdCIModule = ciModuleService.createCIModule(ciModuleInputDto);
        return ResponseEntity.status(201).body(createdCIModule);
    }

    // GET - Een CIModule ophalen op basis van ID
    @GetMapping("/{id}")
    public ResponseEntity<CIModuleDto> getCIModuleById(@PathVariable Long id) {
        CIModuleDto ciModule = ciModuleService.getCIModuleById(id);
        return ResponseEntity.ok(ciModule);
    }
}
