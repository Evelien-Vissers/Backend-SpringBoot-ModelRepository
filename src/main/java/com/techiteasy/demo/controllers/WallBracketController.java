package com.techiteasy.demo.controllers;

import com.techiteasy.demo.dto.WallBracketDto;
import com.techiteasy.demo.dto.WallBracketInputDto;
import com.techiteasy.demo.services.WallBracketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/wallbrackets")
public class WallBracketController {

    private final WallBracketService wallBracketService;

    // Constructor injectie voor WallBracketService
    public WallBracketController(WallBracketService wallBracketService) {
        this.wallBracketService = wallBracketService;
    }

    // GET - Alle WallBrackets ophalen
    @GetMapping
    public ResponseEntity<List<WallBracketDto>> getAllWallBrackets() {
        List<WallBracketDto> wallBrackets = wallBracketService.getAllWallBrackets();
        return ResponseEntity.ok(wallBrackets);
    }

    // POST - Nieuwe WallBracket aanmaken
    @PostMapping
    public ResponseEntity<WallBracketDto> createWallBracket(@RequestBody WallBracketInputDto wallBracketInputDto) {
        WallBracketDto createdWallBracket = wallBracketService.createWallBracket(wallBracketInputDto);
        return ResponseEntity.status(201).body(createdWallBracket);
    }

    // GET - Een WallBracket ophalen op basis van ID
    @GetMapping("/{id}")
    public ResponseEntity<WallBracketDto> getWallBracketById(@PathVariable Long id) {
        WallBracketDto wallBracket = wallBracketService.getWallBracketById(id);
        return ResponseEntity.ok(wallBracket);
    }
}
