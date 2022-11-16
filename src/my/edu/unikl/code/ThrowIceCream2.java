/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.edu.unikl.code;
import javax.swing.*;

/**
 *
 * @author zuhud
 */
class ThrowIceCream2 {
	public static void main(String[] args){
		
            try {
                    IceCreamCone2 cone1 = new IceCreamCone2();
                    String flavor = JOptionPane.showInputDialog(
                      "Enter your flavor");  
                    int scoops = Integer.parseInt(JOptionPane.showInputDialog(
                      "Enter number of scoops") ); 
                     cone1.setFlavor(flavor);
                     cone1.setScoops(scoops);

                    String output="flavor: " + cone1.getFlavor()+ "\nscoops: " + cone1.getScoops();
                    JOptionPane.showMessageDialog(null, output);     

            } catch (IceCreamConeException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());     

            }

            try {
                    IceCreamCone2 cone2 = new IceCreamCone2();
                    String flavor = JOptionPane.showInputDialog(
                      "Enter your flavor");  
                    int scoops = Integer.parseInt(JOptionPane.showInputDialog(
                      "Enter number of scoops") ); 
                     cone2.setFlavor(flavor);
                     cone2.setScoops(scoops);

                    String output="flavor: " + cone2.getFlavor()+ "\nscoops: " + cone2.getScoops();
                    JOptionPane.showMessageDialog(null, output);                       

            } catch (IceCreamConeException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());     
            }
	}
}