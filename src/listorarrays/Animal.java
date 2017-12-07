/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listorarrays;

/**
 *
 * @author Ryan.Wanner
 */
public abstract class Animal {
    private final String name;
    private boolean alive;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
    public abstract void Speak();
}
