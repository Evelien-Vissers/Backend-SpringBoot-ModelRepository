package com.techiteasy.demo.services;

import com.techiteasy.demo.dto.CIModuleDto;
import com.techiteasy.demo.dto.CIModuleInputDto;
import com.techiteasy.demo.mapping.CIModuleMapper;
import com.techiteasy.demo.models.CIModule;
import com.techiteasy.demo.repositories.CIModuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CIModuleService {

    private final CIModuleRepository ciModuleRepository;

    public CIModuleService(CIModuleRepository ciModuleRepository) {
        this.ciModuleRepository = ciModuleRepository;
    }

    // Ophalen van alle CIModules
    public List<CIModuleDto> getAllCIModules() {
        return ciModuleRepository.findAll().stream()
                .map(CIModuleMapper::toCIModuleDto)
                .collect(Collectors.toList());
    }

    // Ophalen van een CIModule op basis van ID
    public CIModuleDto getCIModuleById(Long id) {
        CIModule ciModule = ciModuleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("CIModule not found with id: " + id));
        return CIModuleMapper.toCIModuleDto(ciModule);
    }

    // Aanmaken van een nieuwe CIModule
    public CIModuleDto createCIModule(CIModuleInputDto ciModuleInputDto) {
        CIModule ciModule = CIModuleMapper.toCIModule(ciModuleInputDto);
        CIModule savedCIModule = ciModuleRepository.save(ciModule);
        return CIModuleMapper.toCIModuleDto(savedCIModule);
    }
}
