# MedavieBlueCrossTask
Assesment for Medavie Blue Cross


Ceiling Fan Program
This is a Java implementation of a ceiling fan with the following characteristics:

One cord increases the speed each time it is pulled. There are 3 speed settings, and an "off" (speed 0) setting. If the cord is pulled on speed 3, the fan returns to the "off" setting.
One cord reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
The ceiling fan should be "off" on December 25th all day even if the cords are pulled.
The unit is assumed to always be powered (no wall switch).


Author
This program was created by Purva Vaishnani.

I have sperated the code in mainly three classes Fan class hold the getter setter for all operations. Fan Service hold the methods to perform any operation with fan.
Fan Utility holds the main method where I have provided certain examples to operate fan.
I have used local date time now class to check for christmas and turn off the fan for that particular day.

