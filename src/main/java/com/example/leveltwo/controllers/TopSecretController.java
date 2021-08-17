package com.example.leveltwo.controllers;

import com.example.leveltwo.dto.PositionDTO;
import com.example.leveltwo.dto.ResponseDTO;
import com.example.leveltwo.dto.ShipDTO;
import com.example.leveltwo.services.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/topsecret")
public class TopSecretController {

    @Autowired
    private ShipService service;

    @PostMapping
    public ResponseEntity<ResponseDTO> insert(@RequestBody ShipDTO dto){
        service.insert(dto);
        ResponseDTO responseDTO = new ResponseDTO(new PositionDTO(100.0, 200.0), "this is a secret");
        return ResponseEntity.ok().body(responseDTO);
    }

}
