/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listorarrays;

import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author Ryan.Wanner
 */
public class ListOrArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList();
        for(int i = 0; i<100;i++){
            myList.add(i);
        }
        for(int i= 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        
        List<Animal> myAnimals= new ArrayList();
        
        Animal bird= new Bird("Tweety");
        bird.Speak();
         
        myAnimals.add(bird);
        myAnimals.add(new Doge("Brian"));
        myAnimals.add(new Cat("Fluffy"));
        for(int i= 0; i<myAnimals.size(); i++){
            System.out.println(myAnimals.get(i));
     
        }
    }
    
}
