/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tea_builder;

import java.util.Scanner;

/**
 *
 *
 */
public class Tea_Builder_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String answer;
        int ans;
        Tea_Builder maker = null;
        Tea tea = null;
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
        
            System.out.println("Do you want tea ?");
            answer = scan.next();
            if(answer.equalsIgnoreCase("yes")){
                maker = new Tea_Builder();

                System.out.println("How much water(cups) ?");
                ans = scan.nextInt();
                maker.setWater(ans);

                System.out.println("Do you want milk ?");
                answer = scan.next();
                if(answer.equalsIgnoreCase("yes")){
                    maker.setMilk(ans*10);
                }

                System.out.println("How much sugar(spoon) ?");
                ans = scan.nextInt();
                maker.setSugar(ans);

                System.out.println("How much tea powder(grams) ?");
                ans = scan.nextInt();
                maker.setPowderquantity(ans);
                
                tea = maker.getTea();
                tea.show();
                
                System.out.println("Tea served");
                System.out.println("*************************************************************");
            }
            
        }
    }
    
}
