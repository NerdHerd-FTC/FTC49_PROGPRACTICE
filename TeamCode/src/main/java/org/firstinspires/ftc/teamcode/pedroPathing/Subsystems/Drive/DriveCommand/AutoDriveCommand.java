package org.firstinspires.ftc.teamcode.pedroPathing.Subsystems.Drive.DriveCommand;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Subsystems.Drive.DriveSubsystem;

public class AutoDriveCommand extends CommandBase {

    private final DriveSubsystem driveSubsystem;

    public AutoDriveCommand(DriveSubsystem driveSubsystem) {
        this.driveSubsystem = driveSubsystem;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        driveSubsystem.driveTo();
    }


}