/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kries
 */
public class Crop {
    private String name;
    private String harvestMonth;
    
    public Crop(String newName, String newHarvestMonth) {
        name = newName;
        harvestMonth = newHarvestMonth;
    }
    
    public String getNameCrop(){
        return name;
    }
    
    public String getHarvestMonth(){
        return harvestMonth;
    }
}
