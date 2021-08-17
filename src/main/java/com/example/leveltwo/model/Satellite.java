package com.example.leveltwo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_satellite")
public class Satellite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double distance;
    private String message;
    @ManyToOne
    @JoinColumn(name = "ship_id")
    private Ship ship;

    public Satellite(){

    }

    public Satellite(Long id, String name, Double distance, String message, Ship ship) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.message = message;
        this.ship = ship;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
