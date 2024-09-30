package com.techiteasy.demo.mapping;

import com.techiteasy.demo.dto.RemoteControllerDto;
import com.techiteasy.demo.dto.TelevisionInputDto;
import com.techiteasy.demo.dto.TelevisionSalesDto;
import com.techiteasy.demo.models.Television;
import com.techiteasy.demo.dto.TelevisionDto;

//Gekozen voor een aparte TelevisionMapper klasse voor een betere scheiding van verantwoordelijkheden (ipv in de service klasse)
public class TelevisionMapper {

    //Functie om Television om te zetten naar TelevisionDto
    public static TelevisionDto toTelevisionDto(Television television) {
        //Gebruik van var om nieuwe instantie van TelevisionDto aan te maken
        var dto = new TelevisionDto(

        // Toewijzingen naar de dto variabele
                television.getId(),
                television.getType(),
                television.getBrand(),
                television.getName(),
                television.getPrice(),
                television.getPurchaseDate(),
                television.getSaleDate(),
                television.getAvailableSize(),
                television.getRefreshRate(),
                television.getScreenType(),
                television.getScreenQuality(),
                television.getSmartTv(),
                television.getWifi(),
                television.getVoiceControl(),
                television.getHdr(),
                television.getBluetooth(),
                television.getAmbilight(),
                television.getOriginalStock(),
                television.getSold()
        );

        //Koppel RemoteControllerDto indien de Television een RemoteController heeft
        if (television.getRemoteController() != null) {
            RemoteControllerDto remoteControllerDto = RemoteControllerMapper.toRemoteControllerDto(television.getRemoteController());
            dto.setRemoteController(remoteControllerDto);
        }

        return dto; // Teruggeven van de volledig ingevulde TelevisionDto
    }
    public static Television toTelevision(TelevisionInputDto dto) {
        var television = new Television();

        television.setType(dto.getType());
        television.setBrand(dto.getBrand());
        television.setName(dto.getName());
        television.setPrice(dto.getPrice());
        television.setPurchaseDate(dto.getPurchaseDate());
        television.setSaleDate(dto.getSaleDate());
        television.setAvailableSize(dto.getAvailableSize());
        television.setRefreshRate(dto.getRefreshRate());
        television.setScreenType(dto.getScreenType());
        television.setScreenQuality(dto.getScreenQuality());
        television.setSmartTv(dto.getSmartTv());
        television.setWifi(dto.getWifi());
        television.setVoiceControl(dto.getVoiceControl());
        television.setHdr(dto.getHdr());
        television.setBluetooth(dto.getBluetooth());
        television.setAmbilight(dto.getAmbilight());
        television.setOriginalStock(dto.getOriginalStock());
        television.setSold(dto.getSold());

        return television;
    }

    //Deze methode zet een 'Television'-object om naar een 'TelevisionSalesDto'
    public static TelevisionSalesDto toTelevisionSalesDto(Television television) {
        TelevisionSalesDto dto = new TelevisionSalesDto();
        dto.setId(television.getId());
        dto.setPrice(television.getPrice());
        dto.setOriginalStock(television.getOriginalStock());
        dto.setSold(television.getSold());
        return dto;
    }
    }

