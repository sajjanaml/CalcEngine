package variables;

public class FieldInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long circumferenceEarthInMiles = 24901l;
		
		//long circumferenceEarthInKm =   (long) (circumferenceEarthInMiles*1.6f);
		
		long circumferenceEarthInKm = Math.round(circumferenceEarthInMiles*1.6f);
		
		System.out.println(circumferenceEarthInKm);

	}

}
