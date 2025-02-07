// package frc.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX; // Use TalonSRX for Phoenix 5
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;

// public class Drivetrain extends SubsystemBase {
//     public static TalonSRX driveLeftFrontTalon = new TalonSRX(1);
//     public static TalonSRX driveLeftBackTalon = new TalonSRX(2);
//     public static TalonSRX driveRightFrontTalon = new TalonSRX(4);
//     public static TalonSRX driveRightBackTalon = new TalonSRX(3);

//     public Drivetrain() {
//         driveLeftFrontTalon.setInverted(false);
//         driveLeftBackTalon.setInverted(false);
//         driveRightFrontTalon.setInverted(true);
//         driveRightBackTalon.setInverted(true);

//         driveLeftFrontTalon.setNeutralMode(NeutralMode.Brake);
//         driveLeftBackTalon.setNeutralMode(NeutralMode.Brake);
//         driveRightFrontTalon.setNeutralMode(NeutralMode.Brake);
//         driveRightBackTalon.setNeutralMode(NeutralMode.Brake);
//     }

//     // Feel free to change power percentages
//     public void setDriveMotors(double forward, double turn) {
//         SmartDashboard.putNumber("drive forward power (%)", forward);
//         SmartDashboard.putNumber("drive turn power (%)", turn);
//         double left = forward;
//         double right = forward;

//         left -= turn;
//         right += turn;

//         SmartDashboard.putNumber("left motor power (%)", left);
//         SmartDashboard.putNumber("right motor power (%)", right);

//         driveLeftFrontTalon.set(ControlMode.PercentOutput, left);
//         driveLeftBackTalon.set(ControlMode.PercentOutput, left);
//         driveRightFrontTalon.set(ControlMode.PercentOutput, right);
//         driveRightBackTalon.set(ControlMode.PercentOutput, right);
//     }
// }