package mockitoExamples;

import java.time.LocalDate;

public class InsertPeople {
	private DeliveryApi deliveryApi;
	
	public InsertPeople(final DeliveryApi deliveryApi) {
		this.deliveryApi = deliveryApi;
	}
	
	public People insertPeople(String name, String id, LocalDate birthdate, String zipCode) {
		People people = new People(name, id, birthdate);
		ZipCodeData zipCodeData = deliveryApi.searchZipCode(zipCode);
		people.addZipCode(zipCodeData);
		return people;
		
	}
}
