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
public interface Builder {
    public void setMilk(int n);
    public void setSugar(int n);
    public void setWater(int n);
    public void setPowderquantity(int n);
    public Tea getTea();
    
}
