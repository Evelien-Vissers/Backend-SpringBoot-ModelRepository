package com.techiteasy.demo.dto;

import java.time.LocalDate;
import java.util.List;

public class TelevisionDto {

    private Long id;
    private String type;
    private String brand;
    private String name;
    private Double price;
    private LocalDate purchaseDate; //Datum voor inkoop
    private LocalDate saleDate; //Datum voor verkoop
    private Double availableSize; //Mogelijk een enum als je dit als optie wilt
    private Integer refreshRate; //Mogelijk een enum als je dit als optie wilt
    private String screenType; //Enum voor schermtype
    private String screenQuality; //Enum voor schermkwaliteit
    private Boolean smartTv;
    private Boolean wifi;
    private Boolean voiceControl;
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambilight;
    private Integer originalStock;
    private Integer sold;
    private RemoteControllerDto remoteController; //Toevoeging van RemoteControllerDto
    private List<CIModuleDto> ciModules; //Toevoeging van CIModuleDto

    //Constructor met parameters
    public TelevisionDto(Long id, String type, String brand, String name, Double price, LocalDate purchaseDate,
                         LocalDate saleDate, Double availableSize, Integer refreshRate, String screenType,
                         String screenQuality, Boolean smartTv, Boolean wifi, Boolean voiceControl,
                         Boolean hdr, Boolean bluetooth, Boolean ambilight, Integer originalStock, Integer sold) {

        this.id = id;
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.saleDate = saleDate;
        this.availableSize = availableSize;
        this.refreshRate = refreshRate;
        this.screenType = screenType;
        this.screenQuality = screenQuality;
        this.smartTv = smartTv;
        this.wifi = wifi;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.bluetooth = bluetooth;
        this.ambilight = ambilight;
        this.originalStock = originalStock;
        this.sold = sold;
    }

    //Getters en setters - de methodes die worden gebruikt om toegang te krijgen tot en het wijzigen van de waarden van de velden in een object.
    //Getters - methodes die toestaan om de waarde van een prive-veld/variabele van een object op te halen en worden gebruikt om informatie van een object te lezen zonder de waarde van het veld direct te wijzigen
    //Setters - methodes waarmee je de waarde van een prive-veld kan wijzigen en wordt gebruikt om een waarde toe te wijzen aan een veld in een object.

    //Getters en Setters voor RemoteControllerDto
    public RemoteControllerDto getRemoteController() {
        return remoteController;
    }

    public void setRemoteController(RemoteControllerDto remoteController) {
        this.remoteController = remoteController;
    }

    public List<CIModuleDto> setRemoteController(RemoteControllerDto remoteController) {
        this.remoteController = remoteController;
    }

       //Getters en Setters voor CIModuleDto
        public List<CIModuleDto> getCIModules() {
            return ciModules;
    }

        public void setCiModules(List<CIModuleDto> ciModules) {
        this.ciModules = ciModules;

        public long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public LocalDate getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(LocalDate purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public LocalDate getSaleDate() {
            return saleDate;
        }
        public void setSaleDate (LocalDate saleDate) {
            this.saleDate = saleDate;
        }

        public Double getAvailableSize() {
            return availableSize;
        }

        public void setAvailableSize(Double availableSize) {
            this.availableSize = availableSize;
        }

        public Integer getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(Integer refreshRate) {
            this.refreshRate = refreshRate;
        }

        public String getScreenType() {
            return screenType;
        }

        public void setScreenType(String screenType) {
            this.screenType = screenType;
        }

        public String getScreenQuality() {
            return screenQuality;
        }

        public void setScreenQuality(String screenQuality) {
            this.screenQuality = screenQuality;
        }

        public Boolean getSmartTv() {
            return smartTv;
        }

        public void setSmartTv(Boolean smartTv) {
            this.smartTv = smartTv;
        }

        public Boolean getWifi() {
            return wifi;
        }

        public void setWifi(Boolean wifi) {
            this.wifi = wifi;
        }

        public Boolean getVoiceControl() {
            return voiceControl;
        }

        public void setVoiceControl(Boolean voiceControl) {
            this.voiceControl = voiceControl;
        }

        public Boolean getHdr() {
            return hdr;
        }

        public void setHdr(Boolean hdr) {
            this.hdr = hdr;
        }

        public Boolean getBluetooth() {
            return bluetooth;
        }

        public void setBluetooth(Boolean bluetooth) {
            this.bluetooth = bluetooth;
        }

        public Boolean getAmbilight() {
            return ambilight;
        }

        public void setAmbilight(Boolean ambilight) {
            this.ambilight = ambilight;
        }

        public Integer getOriginalStock() {
            return originalStock;
        }

        public void setOriginalStock(Integer originalStock) {
            this.originalStock = originalStock;
        }

        public Integer getSold() {
            return sold;
        }

        public void setSold(Integer sold) {
            this.sold = sold;
        }
}}





