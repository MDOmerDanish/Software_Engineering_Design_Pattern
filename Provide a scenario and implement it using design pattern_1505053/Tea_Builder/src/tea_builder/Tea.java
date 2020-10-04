/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tea_builder;

/**
 *
 *
 */
public class Tea {
    int water,milk,sugar,quantity;
    String drink_name;

    
    public Tea(int w, int m, int s, int q){
        drink_name = "Tea";
        water = w;
        milk = m;
        sugar = s ;
        quantity = q ;
        
    }
    
    public void show(){
        System.out.println("Tea prepared with "+water+" cup water, "+milk+" ml milk, "+sugar+" spoon of sugar and "+quantity+" grams of tea powder");
    
    }
    
}
