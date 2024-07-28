package mockitoExamples;

public class ZipCodeData {
	private String state;
	private String city;
	private String street;
	private String neighbor;
	private String complement;
	
	public ZipCodeData(final String state, final String city, final String street, final String neighbor, final String complement) {
		this.state = state;
		this.city = city;
		this.street = street;
		this.neighbor = neighbor;
		this.complement = complement;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getNeighbor() {
		return neighbor;
	}

	public String getComplement() {
		return complement;
	}
	
	  
	
}
