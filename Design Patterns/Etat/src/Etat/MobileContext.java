package Etat;

public class MobileContext { //conserver l'etat et changer l'etat
	
	private MobieAlertState currentState;
	
	public MobileContext()
	{
		setCurrentState(new Ringing());
	}

	public void setCurrentState(MobieAlertState currentState) {
		this.currentState = currentState;
	}
	
	public void alert()
	{
		currentState.Alert();
	}

	
	
	
}
