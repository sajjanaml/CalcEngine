package flight;

public class CrewMember {
	

	public enum FlightCrewJob{
		Pilot,
		CoPilot,
		FlightAttendant,
		AirMarshall
		
	}
	
	private FlightCrewJob job;
	
	public CrewMember(FlightCrewJob job) {
		this.job = job;
	}
	
	public void setJob(FlightCrewJob job) {
		this.job = job;
	}
	
	public static void main(String[] args) {
		CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);
		judy.setJob(FlightCrewJob.Pilot);
	}

}
