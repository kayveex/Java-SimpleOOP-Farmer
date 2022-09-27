/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kries
 */
import java.util.ArrayList;
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Benjamin",42,'M',100,"Pajama");
        ArrayList<Crop> harvestedCrops = farmer.harvesting(1);
        System.out.println("Farmer's name: ");
        System.out.println (farmer.getNameF());
        System.out.println("Farmer's current clothes: ");
        System.out.println (farmer.getCloth());
        System.out.println("Farmer's current energy: ");
        System.out.println (farmer.getEnergy());
        System.out.println("Farmer's harvested crops: ");
        for(Crop c: harvestedCrops) {
            System.out.print(" "+ c.getNameCrop());
        }
        System.out.println("");
    }
    
}
