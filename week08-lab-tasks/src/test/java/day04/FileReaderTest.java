package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

	@Test
	void findSmallestTemperatureSpreadTest() {
	FileReader fr = new FileReader();
		System.out.println(fr.findSmallestTemperatureSpread("src/main/resources/weather.dat"));


	}
}