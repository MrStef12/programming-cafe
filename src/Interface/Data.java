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
public class Data {
    
    public static double average(Measurable[] objects) {
	double sum = 0;
	for(Measurable obj : objects) {
		sum = sum + obj.getMeasure();
	}
	if(objects.length > 0) { return sum / objects.length; }
	else { return 0; }
    }
    
    public static double average(Country[] objects) {
	double sum = 0;
	for(Country obj : objects) {
		sum = sum + obj.getArea();
	}
	if(objects.length > 0) { return sum / objects.length; }
	else { return 0; }
    }
    
}
