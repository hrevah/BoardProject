package com.webservice.controller;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * Created by hagairevah on 10/15/18.
 */
@Entity
@Table(name="Devices")
public class Devices {
    @Id
    @PrimaryKeyJoinColumn
    @Column(name="key")
    private String key;

    @Column(name="name")
    private String name;

    @Column(name="timestamp")
    private long timestamp;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
