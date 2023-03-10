package frc.team2412.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.subsystems.IntakeSubsystem;

public class IntakeSetInCommand extends CommandBase {
	IntakeSubsystem intakeSubsystem;

	public IntakeSetInCommand(IntakeSubsystem intakeSubsystem) {
		this.intakeSubsystem = intakeSubsystem;
		addRequirements(intakeSubsystem);
	}

	// TODO: uncomment when color matching works

	@Override
	public void execute() {
		intakeSubsystem.intakeIn();
	}

	@Override
	public boolean isFinished() {
		// return intakeSubsystem.isSecured();
		return false;
	}
}
