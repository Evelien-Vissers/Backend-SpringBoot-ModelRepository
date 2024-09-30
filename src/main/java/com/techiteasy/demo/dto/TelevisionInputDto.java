package com.techiteasy.demo.dto;
import java.time.LocalDate;

// Deze TelevisionInputDto kan worden gebruikt om gegevens van de gebruiker te ontvangen (bijv. via een API-aanroep) voordat deze gegevens worden omgezet in een Television-entiteit en in de database worden opgeslagen. Het helpt om de input van de gebruiker gescheiden te houden van de database-entiteit.
public class TelevisionInputDto {

        private String type;
        private String brand;
        private String name;
        private Double price;
        private LocalDate purchaseDate;
        private LocalDate saleDate;
        private Double availableSize;
        private Integer refreshRate;
        private String screenType;
        private String screenQuality;
        private Boolean smartTv;
        private Boolean wifi;
        private Boolean voiceControl;
        private Boolean hdr;
        private Boolean bluetooth;
        private Boolean ambilight;
        private Integer originalStock;
        private Integer sold;

        // Getters en Setters
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

        public void setSaleDate(LocalDate saleDate) {
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
    }

