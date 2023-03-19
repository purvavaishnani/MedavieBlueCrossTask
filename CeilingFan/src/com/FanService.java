package com;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FanService
{
    
   public static Status getStatus()
    {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        if(now.getDayOfMonth()==25 && now.getMonth() == Month.DECEMBER)
            return Status.OFF;
        else return Status.ON;
    }

    public static int changeSpeedOfFan(Cord cordPulled , int currentSpeed)
    {

        if(getStatus() == Status.OFF)
            return  0;

        if(currentSpeed >3 || currentSpeed <0)
        {
            System.out.println("Invalid speed");
            return  0;

        }
        if(cordPulled == Cord.INCREASE_SPEED && currentSpeed >=0 && currentSpeed < 3)
        {
           currentSpeed++;
        }
        else if(currentSpeed == 3) {
        	currentSpeed = 0;
        }


        return currentSpeed;

    }

    public static Direction changeDirectionOfFan( Direction currentDirection , Cord cordPulled)
    {
        Direction direction = null;

        if(cordPulled == Cord.REVERSE_DIRECTION)
        {
            if(currentDirection == Direction.REVERSE)
                direction=Direction.FORWARD;
            else

                direction=Direction.REVERSE;
        }
		return direction;
    }

}