package mockitoExamples;

import java.time.LocalDate;

public class People {
	private String name;
	private String id;
	private LocalDate birthdate;
	private ZipCodeData zipCode;
	
	public People(String name, String id, LocalDate birthdate) {
		this.name = name;
		this.id = id;
		this.birthdate = birthdate;
	}
	
	public void addZipCode(ZipCodeData zipCodedata){
		this.zipCode = zipCodedata ;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public ZipCodeData getZipCode() {
		return zipCode;
	}
	
	
	
	
	
}
