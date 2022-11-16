/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.edu.unikl.code;

/**
 *
 * @author zuhud
 */
public class IceCreamCone {
	private String flavor;
	private int scoops;
	public static int maxScoops = 3;

        
        IceCreamCone() throws IceCreamConeException {

	}
        
	IceCreamCone(String flavor, int scoops) throws IceCreamConeException {
            setFlavor(flavor);
            setScoops(scoops);
	}

	public void setFlavor(String flavor) {
            this.flavor = flavor;
	}
	
        public String getFlavor() {
            return flavor;
        }
        
	public void setScoops(int scoops) throws IceCreamConeException {
            if (scoops > maxScoops) {
                    // instantiates default IceCreamConeException
                    throw (new IceCreamConeException());
            } else {
                    this.scoops = scoops;
            }
	}
        
        public int getScoops() {
            return scoops;
        }


}
