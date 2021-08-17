package com.example.leveltwo.dto;

import com.example.leveltwo.model.Satellite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SatelliteDTO implements Serializable {

    private Long id;
    private String name;
    private Double distance;
    private List<String> messages = new ArrayList<>();

    public SatelliteDTO(){

    }

    public SatelliteDTO(Satellite entity){
        id = entity.getId();
        name = entity.getName();
        distance = entity.getDistance();
        messages.add(entity.getMessage());
    }

    public SatelliteDTO(Long id, String name, Double distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
