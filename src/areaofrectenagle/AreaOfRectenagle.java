/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaofrectenagle;

import static java.sql.DriverManager.println;

/**
 *
 * @author amsta5248
 */
public class AreaOfRectenagle {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 5.7;
        double width = 4.8;
        double area = 0.0; 
        
        // algorithim for area calc
        area= length* width;
        
       System.out.println("the area is" + area + "cm squared");
       System.out.println("width= 4.8 \nlength= 5.7");
       
              
        // TODO code application logic here
    }
    
}
