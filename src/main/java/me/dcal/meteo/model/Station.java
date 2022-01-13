package me.dcal.meteo.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "station")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_station", unique = true)
    Integer idStation;
    @Column(name = "nom")
    String nom;
    @Column(name = "longitude")
    String longitude;
    @Column(name = "latitude")
    String latitude;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "station", targetEntity = Meteo.class, fetch = FetchType.LAZY)
    List<Meteo> meteos;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getIdStation() {
        return idStation;
    }

    public void setIdStation(Integer idStation) {
        this.idStation = idStation;
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

    public List<Meteo> getMeteos() {
        return meteos;
    }

    public void setMeteos(List<Meteo> meteos) {
        this.meteos = meteos;
    }
}
