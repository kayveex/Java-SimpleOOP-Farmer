/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kries
 */
import java.util.ArrayList;
import java.time.LocalDate;
public class Farmer 
{
    private String name;
    private int age;
    private char gender;
    private int energy;
    private String cloth;
    
    public Farmer (String newName, int newAge, char newGender, int newEnergy, String newCloth)
    {
        name = newName;
        age = newAge;
        gender = newGender;
        energy = newEnergy;
        cloth = newCloth;
    }
    
    public ArrayList<Crop> harvesting(int duration) 
    {
        energy = energy - (10*duration);
        cloth = "Working Cloth";
        
        ArrayList<Crop> harvestedCorps = new ArrayList<Crop>();
        LocalDate currentDate = LocalDate.now();
        String month= currentDate.getMonth().name();
        
        if(month.equals("MAY")) {
            harvestedCorps.add(new Crop("Strawberry", month));
        }else if(month.equals("JULY")) {
            harvestedCorps.add(new Crop("Corn", month));
            harvestedCorps.add(new Crop("Potato", month));
        }else if(month.equals("SEPTEMBER")) {
            harvestedCorps.add(new Crop("Pumpkin", month));
        }
        return harvestedCorps;
    }
    
    public int getEnergy ()
    {
        return energy;
    }
    
    public String getNameF (){
        return name;
    }
    public String getCloth() {
        return cloth;
    }
}
