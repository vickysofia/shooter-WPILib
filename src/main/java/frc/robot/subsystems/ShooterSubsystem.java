package frc.robot.subsystems;

import static frc.robot.ShooterConstants.*;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.FeedbackSensorSourceValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.math.controller.BangBangController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem {

    final TalonFX LEADER = new TalonFX(LEADER_ID, canBus);
    final TalonFX FOLLOWER;// = new TalonFX(FOLLOWER_ID, canBus);
    final TalonFX HOOD = new TalonFX(HOOD_ID, canBus);
    final CANBus canBus = new CANBus(canBusName);
    final VelocityVoltage m_velocity = new VelocityVoltage(0);

   public ShooterSubsystem(){


   }
// // robot init, set slot 0 gains
//     var configs = new TalonFXConfiguration();
//     configs.Slot0.kV = KV;
//     configs.Slot0.kP = KP;
//     configs.Slot0.kI = KI;
//     configs.Slot0.kD = KD;
// m_talonFX.getConfigurator().apply(configs, 0.050);



//     }
//     public shooter(){
        //m_motor.setControl(m_request.withOutput(12.0));
        
//         // class member variable
// final VoltageOut m_request = new VoltageOut(0);

// // main robot code, command 12 V output
// m_motor.setControl(m_request.withOutput(12.0));
// // the control request `with` methods also accept unit types
// m_motor.setControl(m_request.withOutput(Volts.of(12.0)));

    }

   public hood(){}

// final TalonFX talonFX_LEADER = new TalonFX(0);
// final TalonFX talonFX_FOLLOWER = new TalonFX(0);
// final CANcoder cancoder = new CANcoder(0);

// final TalonFXSimState m_talonFXSim = m_talonFX.getSimState(); //simulated motor

// final DutyCycleOut m_talonFXOut = new DutyCycleOut(0);

// final TalonFXConfiguration m_talonFXConfig = new TalonFXConfiguration();
// final CANcoderConfiguration cancoderConfig = new CANcoderConfiguration();

// private double output = 0.0;
// InvertedValue m_talonFXInverted = InvertedValue.CounterClockwise_Positive;
// public ShooterSubsystem(){

// }

// talonFX_LEADER.configFactoryDefault();
// //talonFX_FOLLOWER.configFactoryDefault(); auto configs to leaders settings i think

// m_talonFX.setControl(m_talonFXOut);


// // robot init, set m_follower to follow m_leader
// talonFX_FOLLOWER.follow(talonFX_LEADER);
// // m_follower should NOT oppose m_leader
// talonFX_FOLLOWER.setInverted(TalonFXInvertType.FollowMaster);
// // set m_strictFollower to follow m_leader
// m_strictFollower.follow(talonFX_LEADER);
// // set m_strictFollower to ignore m_leader invert and use its own
// m_strictFollower.setInverted(TalonFXInvertType.CounterClockwise);

// // main robot code, command 100% output for m_leader
// m_leader.set(ControlMode.PercentOutput, 1.0);
// // - m_follower and m_strictFollower will also run at 100% output
// // - m_follower will follow m_leader's invert, while m_strictFollower
// //   ignores it and uses its own
// // NOTE: if set(), neutralOutput(), or disable() is ever called on
// //       the followers, they will stop following


