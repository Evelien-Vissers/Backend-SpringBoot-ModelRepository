package com.techiteasy.demo.mapping;

import com.techiteasy.demo.dto.RemoteControllerDto;
import com.techiteasy.demo.dto.RemoteControllerInputDto;
import com.techiteasy.demo.models.RemoteController;

public class RemoteControllerMapper {

    // Entiteit naar DTO
    public static RemoteControllerDto toRemoteControllerDto(RemoteController remoteController) {
        RemoteControllerDto dto = new RemoteControllerDto();
        dto.setId(remoteController.getId());
        dto.setCompatibleWith(remoteController.getCompatibleWith());
        dto.setBatteryType(remoteController.getBatteryType());
        dto.setName(remoteController.getName());
        return dto;
    }

    // InputDto naar Entiteit
    public static RemoteController toRemoteController(RemoteControllerInputDto remoteControllerInputDto) {
        RemoteController remoteController = new RemoteController();
        remoteController.setCompatibleWith(remoteControllerInputDto.getCompatibleWith());
        remoteController.setBatteryType(remoteControllerInputDto.getBatteryType());
        remoteController.setName(remoteControllerInputDto.getName());
        return remoteController;
    }
}
