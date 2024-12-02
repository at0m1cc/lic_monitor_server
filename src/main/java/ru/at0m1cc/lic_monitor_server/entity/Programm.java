package ru.at0m1cc.lic_monitor_server.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Programm {
    @Getter
    @Setter
    private String nameProgramm;
    @Getter
    private List<String> usersProgramm;
    
    public void addUser(String user){
        usersProgramm.add(user);
    }

    public Programm(){
        usersProgramm = new ArrayList<>();
    }

}
