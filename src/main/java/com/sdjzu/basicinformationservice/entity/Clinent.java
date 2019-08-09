package com.sdjzu.basicinformationservice.entity;

public class Clinent {
    private Long id;

    private String clinentName;

    private String clinentId;

    private String clinentSecret;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClinentName() {
        return clinentName;
    }

    public void setClinentName(String clinentName) {
        this.clinentName = clinentName;
    }

    public String getClinentId() {
        return clinentId;
    }

    public void setClinentId(String clinentId) {
        this.clinentId = clinentId;
    }

    public String getClinentSecret() {
        return clinentSecret;
    }

    public void setClinentSecret(String clinentSecret) {
        this.clinentSecret = clinentSecret;
    }
}