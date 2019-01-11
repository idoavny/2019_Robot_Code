/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class Calculations {
    public double DistancePerEncoderRotation(int WheelDiameter,int encoderResolution){
        return ((2.54*WheelDiameter*Math.PI)/100)/encoderResolution; 
        /*        
        converting Inch wheel diameter to meter, divided by the encoder pulses per rotation,
        OUTPUT: Distance(in Meter) Per Pulse
        */                                                       
    }
}
