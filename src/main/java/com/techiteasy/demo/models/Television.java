package com.techiteasy.demo.models;
//De 'models' vertegenwoordigen de data-objecten die worden opgeslagen in de database. Deze klasse kan gebruikt worden om een tabel te genereren in de database via JPA.

import jakarta.persistence.*;

import java.rmi.Remote;
import java.time.LocalDate;
import java.util.List;

//@Entity markeert deze klasse als een JPA-entiteit (wat betekent dat deze overeenkomst met een tabel in de database)
@Entity
public class Television {

    @Id //Dit attribuut geeft aan dat het veld 'id' de primaire sleutel is.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Deze annotatie zorgt ervoor dat de waarde van 'id' automatisch wordt gegenereerd door de database wanneer een nieuwe rij wordt ingevoegd
    private Long id;
    //Notitie MR: het is beter om het type "Long" ipv "long" te gebruiken. De voorkeur gaat altijd uit naar de wrapper klassen (= hoofdletter variant)
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

    //Data worden opgeslagen als DATE of TIMESTAMP types in de database
    //Enums worden opgeslagen als VARCHAR of ENUM type in de database

    //OneToOne-relatie met RemoteController
    //De 'CascadeType.All' zorgt ervoor dat alle cascade-operaties (zoals persist, merge, remove) worden toegepast op de gekoppelde Remotecontroller wanneer er iets gebeurt met de Television.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "remote_controller_id", referencedColumnName = "id")
    private RemoteController remoteController;

    //OneToMany-relatie met CIModule
    @OneToMany(mappedBy = "television", cascade = CascadeType.ALL)
    private List<CIModule> ciModules;

    //Getters en setters - de methodes die worden gebruikt om toegang te krijgen tot en het wijzigen van de waarden van de velden in een object.
    //Getters - methodes die toestaan om de waarde van een prive-veld/variabele van een object op te halen en worden gebruikt om informatie van een object te lezen zonder de waarde van het veld direct te wijzigen
    //Setters - methodes waarmee je de waarde van een prive-veld kan wijzigen en wordt gebruikt om een waarde toe te wijzen aan een veld in een object.

    //Getters en Setters voor RemoteController, CIMOdules en WallBracket
    public RemoteController getRemoteController() {
        return remoteController;
    }

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }
    public List<CIModule> getCiModules() {
        return ciModules;
    }

    public void setCiModules(List<CIModule> ciModules) {
        this.ciModules = ciModules;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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


