package com;

public class FanUtility {

	public static void main(String[] args) {

        
	       // creating a basic fan with no settings
	        Fan fan= new Fan();
	     
	        //pulling the string and trying to change the speed of Fan
	       fan.setSpeed( FanService.changeSpeedOfFan(Cord.INCREASE_SPEED,0));
	       System.out.println("The Current Fan Speed is: " + fan.getSpeed());
	       fan.setSpeed( FanService.changeSpeedOfFan(Cord.INCREASE_SPEED,1));
	       System.out.println("The Current Fan Speed is: " + fan.getSpeed());
	       fan.setSpeed( FanService.changeSpeedOfFan(Cord.INCREASE_SPEED,2));
	       System.out.println("The Current Fan Speed is: " + fan.getSpeed());
	       fan.setSpeed( FanService.changeSpeedOfFan(Cord.INCREASE_SPEED,3));
	       System.out.println("The Current Fan Speed is: " + fan.getSpeed());
	       
	       
	        //setting the status of fan
	       	System.out.println("The Fan is " + fan.getStatus());
	        fan.setStatus(FanService.getStatus());
	        System.out.println("The Fan is " + fan.getStatus());
	        
	        //setting the direction of fan
	        System.out.println("Before Fan Direction is " +fan.getDirection());
	        fan.setDirection(FanService.changeDirectionOfFan(Direction.FORWARD,Cord.REVERSE_DIRECTION));
	        System.out.println("Current Fan Direction is " +fan.getDirection());

	        
	        System.out.println(fan.toString());
	        
	        
	        
	    }
}
