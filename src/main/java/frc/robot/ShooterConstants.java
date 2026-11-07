package frc.robot;


import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.MotorAlignmentValue;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class ShooterConstants {

    public static final int LEADER_ID = 0;
    public static final int FOLLOWER_ID = 0;


    public static final int HOOD_ID = 0;
    public static final int HOOD_ENCODERid =0;
    public static double GEAR_RATIO = 0.0; //idk how to calculate it
    public static double ROTATION = 0.0;//for hood


    public static final InvertedValue FLYWHEEL_INVERTED = InvertedValue.Clockwise_Positive; //or CCW+
    public static final MotorAlignmentValue ALIGNMENT = MotorAlignmentValue.Aligned; //  going same direction


    public static final String canBusName = "daniel";
    public static double HOODKp = 0.0;
    public static double HOODKi = 0.0;
    public static double HOODKd = 0.0;
    






  
}
