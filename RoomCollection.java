/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes;

import java.util.*;

/**
 *
 * @author Inayah
 */
public class RoomCollection {
    private String collectionId;
    private String name;
    private String description;
    private ArrayList<Furniture> furnitureList= new ArrayList();

    public RoomCollection(String collectionId, String name, String description) {
        this.collectionId = collectionId;
        this.name = name;
        this.description = description;
    }
    
    //edit name
    public void setName(String name) {
        this.name = name;
    }
    
    //edit description
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addFurniture(Furniture furniture){
        furnitureList.add(furniture);
    }
    
    public void removeFurniture(Furniture furniture){
        furnitureList.remove(furniture);
    }
    
    public void getCollectionDetails(){
        System.out.println("------------------------------");
        System.out.println("Collection id: "+collectionId);
        System.out.println("Name: "+name);
        System.out.println("Description: "+description);
        System.out.println("------------------------------");
        
        for(Furniture f : furnitureList){
            System.out.println(f.getName());
        }
    }
    
}
