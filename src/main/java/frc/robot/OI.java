/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    Joystick pilot;
    JoystickButton a, b, x, y, start, select, rb, lb;

    public OI(){
        pilot  = new Joystick(0);
        a = new JoystickButton(pilot, 1);
        b = new JoystickButton(pilot, 2);
        x = new JoystickButton(pilot, 3);
        y = new JoystickButton(pilot, 4);
        start = new JoystickButton(pilot, 5);

        a.whenPressed(new SetSolenoidOn());
        b.whenPressed(new SetSolenoidOff());        
        x.whenPressed(new SetDoubleSolenoidOn());
        y.whenPressed(new SetDoubleSolenoidOff());
        start.whenPressed(new SetDoubleSolenoidReverse());
    }
}
