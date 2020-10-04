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
public class Tea_Builder implements Builder{
    Tea tea;
    int water,milk,sugar,quantity;
    
    public void Tea_Builder(){
        tea = null ;
        water = 0;
        milk = 0;
        sugar = 0;
        quantity = 0;
    }
    
    @Override
    public void setSugar(int n) {

        System.out.println("Adding Sugar");

        sugar = n ;
    }

    @Override
    public void setWater(int n) {
        System.out.println("Adding Water");
        water = n;

    }

    @Override
    public void setPowderquantity(int n) {
        System.out.println("Adding "+n+" grams of powder ");
        quantity = n ;

    }

    @Override
    public void setMilk(int n) {
        System.out.println("Adding Milk");
        milk = n ;

    }
    
    @Override
    public Tea getTea(){
        return new Tea(water, milk, sugar, quantity);
    }
}
