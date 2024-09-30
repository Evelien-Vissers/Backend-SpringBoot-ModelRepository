package com.techiteasy.demo.mapping;

import com.techiteasy.demo.dto.WallBracketDto;
import com.techiteasy.demo.dto.WallBracketInputDto;
import com.techiteasy.demo.models.WallBracket;

public class WallBracketMapper {

    // Entiteit naar DTO
    public static WallBracketDto toWallBracketDto(WallBracket wallBracket) {
        WallBracketDto dto = new WallBracketDto();
        dto.setId(wallBracket.getId());
        dto.setSize(wallBracket.getSize());
        dto.setAdjustable(wallBracket.getAdjustable());
        dto.setName(wallBracket.getName());
        dto.setPrice(wallBracket.getPrice());
        return dto;
    }

    // InputDto naar Entiteit
    public static WallBracket toWallBracket(WallBracketInputDto wallBracketInputDto) {
        WallBracket wallBracket = new WallBracket();
        wallBracket.setSize(wallBracketInputDto.getSize());
        wallBracket.setAdjustable(wallBracketInputDto.getAdjustable());
        wallBracket.setName(wallBracketInputDto.getName());
        wallBracket.setPrice(wallBracketInputDto.getPrice());
        return wallBracket;
    }
}
