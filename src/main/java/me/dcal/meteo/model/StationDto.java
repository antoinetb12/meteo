package me.dcal.meteo.model;

import javax.persistence.Column;
import java.util.List;

public class StationDto {
    Integer idStation;
    String nom;
    String longitude;
    String latitude;
    List<MeteoDto> meteos;
    public Integer getIdStation() {
        return idStation;
    }

    public void setIdStation(Integer idStation) {
        this.idStation = idStation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public List<MeteoDto> getMeteos() {
        return meteos;
    }

    public void setMeteos(List<MeteoDto> meteos) {
        this.meteos = meteos;
    }
}
