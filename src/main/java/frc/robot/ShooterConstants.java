package frc.robot;


import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.MotorAlignmentValue;


public final class ShooterConstants {

    public static final int LEADER_ID = 0;
    public static final int FOLLOWER_ID = 0;
    public static final double FLYWHEEL_SPEED = 0.0; //rps
    public static final InvertedValue FLYWHEEL_INVERTED = InvertedValue.Clockwise_Positive; //or CCW+
    public static final MotorAlignmentValue ALIGNMENT = MotorAlignmentValue.Aligned; //  going same direction, not same= Opposed



    public static final int HOOD_ID = 0;
    public static final int HOOD_ENCODERid =0;
    //public static final double GEAR_RATIO = 0.0; //idk how to calculate it
    //public static final double HOOD_RATIO = 1.0;//SensorToMechanismRatio : how many CANcoder rotations == one hood rotaion & depends on where its mounted?
    public static final double ROTATION = 0.0;// hood rotation


    

    public static final String canBusName = "daniel";
    public static final double HOODKp = 1.0;
    public static final double HOODKi = 0.0;
    public static final double HOODKd = 0.0;
    

  
}
