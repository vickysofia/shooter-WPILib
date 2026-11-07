
package frc.robot;
import static frc.robot.ShooterConstants.*;

import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;


import frc.robot.subsystems.ShooterSubsystem;


import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
   ShooterSubsystem shooter = new ShooterSubsystem();

       CommandPS5Controller controller = new CommandPS5Controller(0);

      public RobotContainer(){
       controller.R2().whileTrue(shooter.flywheelSpin());    // hold R2: spin flywheel
       controller.cross().onTrue(shooter.hoodMovement());    // press X: hood to shooting angle
  }


  // // The robot's subsystems and commands are defined here...
  // private final ShooterSubsystem shooter = new ShooterSubsystem();

  // // Replace with CommandPS4Controller or CommandJoystick if needed
  //  private final CommandPS5Controller driverController =
  //       new CommandPS5Controller(
  //           OperatorConstants.kDriverControllerPort
  //       );
  // /** The container for the robot. Contains subsystems, OI devices, and commands. */
  // public RobotContainer() {
  //   // Configure the trigger bindings
  //   configureBindings();
  // }

  // private void configureBindings() {
  //   // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
  //   new Trigger(shooter::exampleCondition)
  //       .onTrue(new ExampleCommand(m_exampleSubsystem));

  //   // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
  //   // cancelling on release.
  //   m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  // }

  // /**
  //  * Use this to pass the autonomous command to the main {@link Robot} class.
  //  *
  //  * @return the command to run in autonomous
  //  */
  // public Command getAutonomousCommand() {
  //   // An example command will be run in autonomous
  //   return Autos.exampleAuto(m_exampleSubsystem);
  // }
}
