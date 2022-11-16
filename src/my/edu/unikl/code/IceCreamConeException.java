/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.edu.unikl.code;

/**
 *
 * @author zuhud
 */
class IceCreamConeException extends Exception {
	private IceCreamCone cone;
	private String flavor;
	
	IceCreamConeException() {
            // default exception message
            super("Reached max scoops.");
		
	}
	
	IceCreamConeException(String message) {
            super(message);
	}
	
	// returns message from the superclass Exception
	@Override
	public String getMessage() {
            return super.getMessage();
	}
}