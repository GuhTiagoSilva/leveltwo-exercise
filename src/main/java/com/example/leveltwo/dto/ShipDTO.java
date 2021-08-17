package com.example.leveltwo.dto;

import com.example.leveltwo.model.Ship;

import java.util.ArrayList;
import java.util.List;

public class ShipDTO {
    private Long id;
    private String name;
    private List<SatelliteDTO> satellites = new ArrayList<>();

    public ShipDTO(){

    }

    public ShipDTO(Ship entity){
        id = entity.getId();
        name = entity.getName();
    }
    public ShipDTO(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<SatelliteDTO> getSatellites() {
        return satellites;
    }
}
