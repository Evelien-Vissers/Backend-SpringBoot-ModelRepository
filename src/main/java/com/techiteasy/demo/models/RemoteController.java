package com.techiteasy.demo.models;

import jakarta.persistence.*;

@Entity
public class RemoteController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String compatibleWith;
    private String batteryType;
    private String name;

    @OneToOne(mappedBy="remoteController")
    private Television television;


//Getters & Setters
    public Long getId() {
    return id;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
}

