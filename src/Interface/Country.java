/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author stefh
 */
public class Country {
    
    private String name;
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    
}
