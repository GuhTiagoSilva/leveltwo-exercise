package com.example.leveltwo.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    private PositionDTO position;
    private String message;

    public ResponseDTO(){

    }

    public ResponseDTO(PositionDTO dto, String message){
        this.position = dto;
        this.message = message;
    }

    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
