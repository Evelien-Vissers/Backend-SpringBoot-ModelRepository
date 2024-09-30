package com.techiteasy.demo.services;

import com.techiteasy.demo.dto.WallBracketDto;
import com.techiteasy.demo.dto.WallBracketInputDto;
import com.techiteasy.demo.mapping.WallBracketMapper;
import com.techiteasy.demo.models.WallBracket;
import com.techiteasy.demo.repositories.WallBracketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WallBracketService {

    private final WallBracketRepository wallBracketRepository;

    public WallBracketService(WallBracketRepository wallBracketRepository) {
        this.wallBracketRepository = wallBracketRepository;
    }

    // Ophalen van alle WallBrackets
    public List<WallBracketDto> getAllWallBrackets() {
        return wallBracketRepository.findAll().stream()
                .map(WallBracketMapper::toWallBracketDto)
                .collect(Collectors.toList());
    }

    // Ophalen van een WallBracket op basis van ID
    public WallBracketDto getWallBracketById(Long id) {
        WallBracket wallBracket = wallBracketRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("WallBracket not found with id: " + id));
        return WallBracketMapper.toWallBracketDto(wallBracket);
    }

    // Aanmaken van een nieuwe WallBracket
    public WallBracketDto createWallBracket(WallBracketInputDto wallBracketInputDto) {
        WallBracket wallBracket = WallBracketMapper.toWallBracket(wallBracketInputDto);
        WallBracket savedWallBracket = wallBracketRepository.save(wallBracket);
        return WallBracketMapper.toWallBracketDto(savedWallBracket);
    }
}
