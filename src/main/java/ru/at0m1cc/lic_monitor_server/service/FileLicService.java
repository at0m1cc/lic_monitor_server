package ru.at0m1cc.lic_monitor_server.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ru.at0m1cc.lic_monitor_server.entity.Programm;

public class FileLicService {
    private List<Programm> licList;
    private File fileParsed;

    public FileLicService(File fileParsed) throws IOException{
        this.licList = new ArrayList<>();
        this.fileParsed = fileParsed;
    }
    private void parseToList() throws FileNotFoundException{
        Scanner scanner = new Scanner(fileParsed);
        String i = "";
        int id = 0;
        for(;scanner.hasNextLine();){
            i = scanner.nextLine();
            if (licList.isEmpty()) {
                licList.add(new Programm());
                licList.get(id).setNameProgramm(i);
                i = scanner.nextLine();
            }
            if(i.contains("Users")){
                licList.add(new Programm());
                id++;
                licList.get(id).setNameProgramm(i);
            }
            if (i.contains("    ")){
                licList.get(id).addUser(i.substring(4));
            }
        }
        scanner.close();
    }
}
