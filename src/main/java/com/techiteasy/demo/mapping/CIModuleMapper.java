package com.techiteasy.demo.mapping;

import com.techiteasy.demo.dto.CIModuleDto;
import com.techiteasy.demo.dto.CIModuleInputDto;
import com.techiteasy.demo.models.CIModule;

public class CIModuleMapper {

    // Entiteit naar DTO
    public static CIModuleDto toCIModuleDto(CIModule ciModule) {
        CIModuleDto dto = new CIModuleDto();
        dto.setId(ciModule.getId());
        dto.setName(ciModule.getName());
        dto.setType(ciModule.getType());
        dto.setPrice(ciModule.getPrice());
        return dto;
    }

    // InputDto naar Entiteit
    public static CIModule toCIModule(CIModuleInputDto ciModuleInputDto) {
        CIModule ciModule = new CIModule();
        ciModule.setName(ciModuleInputDto.getName());
        ciModule.setType(ciModuleInputDto.getType());
        ciModule.setPrice(ciModuleInputDto.getPrice());
        return ciModule;
    }
}
