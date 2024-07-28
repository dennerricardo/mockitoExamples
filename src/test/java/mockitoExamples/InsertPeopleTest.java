package mockitoExamples;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InsertPeopleTest {
	
	@Mock
	private DeliveryApi deliveryApi;
	
	@InjectMocks
	private InsertPeople insertPeople;
	
	@Test
	void insertPeopleValidation() {
		ZipCodeData zipCode = new ZipCodeData("PB","JOAO PESSOA","RUA 1","CENTRO","APT1");
		Mockito.when(deliveryApi.searchZipCode("123456456")).thenReturn(zipCode);
		People people = insertPeople.insertPeople("Denner", "8456213", LocalDate.now(),  "123456456");
	
		Assertions.assertEquals("Denner", people.getName());
		Assertions.assertEquals("8456213", people.getId());
		Assertions.assertEquals("PB", people.getZipCode().getState());
		Assertions.assertEquals("JOAO PESSOA", people.getZipCode().getCity());
		Assertions.assertEquals("CENTRO", people.getZipCode().getNeighbor());
	}
	
	@Test
	void throwExceptionValidation() {
		Mockito.when(deliveryApi.searchZipCode("123456456")).thenThrow(IllegalArgumentException.class);
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		insertPeople.insertPeople("Denner", "8456213", LocalDate.now(),  "123456456"));
	}
}
