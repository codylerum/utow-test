package com.outjected.utow;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class DemoBean {
    private String message;
    private Date timestamp;
    private ArrayList<DemoUser> users = new ArrayList<DemoUser>();

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElement
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<DemoUser> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<DemoUser> users) {
        this.users = users;
    }
}
