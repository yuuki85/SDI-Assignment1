/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.edu.unikl.code;

/**
 *
 * @author zuhud
 */
class IceCreamCone2 {


	private String flavor;
	private int scoops;
	private static String flavor1 = "Chocolate";
	private static String flavor2 = "Vanilla";
	private static String flavor3 = "Strawberry";
	private static String flavor4 = "Mint";
	private static double maxScoops = 3;

        IceCreamCone2() throws IceCreamConeException {

	}
        
	IceCreamCone2(String flavor, int scoops) throws IceCreamConeException {
            setFlavor(flavor);
            setScoops(scoops);
	}

	public void setFlavor(String flavor) throws IceCreamConeException {
            if (flavor1.equals(flavor)
                    || flavor2.equals(flavor)
                    || flavor3.equals(flavor)
                    || flavor4.equals(flavor)) {
                    this.flavor = flavor;
            } else {
                    // instantiates IceCreamConeException with message as value of its parameter
                    throw (new IceCreamConeException("Flavor entered does not match."));
            }
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