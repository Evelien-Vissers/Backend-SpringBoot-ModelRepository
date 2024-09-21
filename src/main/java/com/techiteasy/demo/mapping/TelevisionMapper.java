package com.techiteasy.demo.mapping;

import com.techiteasy.demo.models.Television;
import com.techiteasy.demo.dto.TelevisionDto;

//Gekozen voor een aparte TelevisionMapper klasse voor een betere scheiding van verantwoordelijkheden (ipv in de service klasse)
public class TelevisionMapper {

    //Functie om Television om te zetten naar TelevisionDto
    public static TelevisionDto toTelevisionDto(Television television) {
        return new TelevisionDto(
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
    }
}
