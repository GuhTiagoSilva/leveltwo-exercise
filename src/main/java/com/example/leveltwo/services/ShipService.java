package com.example.leveltwo.services;

import com.example.leveltwo.dto.SatelliteDTO;
import com.example.leveltwo.dto.ShipDTO;
import com.example.leveltwo.model.Satellite;
import com.example.leveltwo.model.Ship;
import com.example.leveltwo.repositories.SatelliteRepository;
import com.example.leveltwo.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShipService {

    @Autowired
    private ShipRepository repository;

    @Autowired
    private SatelliteRepository satelliteRepository;

    @Transactional
    public ShipDTO insert (ShipDTO dto){
        Ship ship = new Ship();
        copyDtoToEntity(dto, ship);
        return new ShipDTO(ship);
    }

    private void copyDtoToEntity(ShipDTO dto, Ship ship){
        ship.setName(dto.getName());
        long count = 1L;
        for(SatelliteDTO satelliteDTO : dto.getSatellites()){
            Satellite satellite = satelliteRepository.getById(count);
            ship.getSatellites().add(satellite);
            count++;
        }
    }

}
