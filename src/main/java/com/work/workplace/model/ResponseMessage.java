package com.work.workplace.model;

import java.time.LocalDateTime;


public class ResponseMessage {
    private String response;
    private String description;
    private boolean success;
    private LocalDateTime date;

    public ResponseMessage() {
    }

    public ResponseMessage(String response, String description, boolean success) {
        this.response = response;
        this.description = description;
        this.success = success;
    }

    public ResponseMessage(String response, String description, boolean success, LocalDateTime date) {
        this.response = response;
        this.description = description;
        this.success = success;
        this.date = date;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
