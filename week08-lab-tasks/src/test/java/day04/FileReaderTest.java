package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

	@Test
	void findSmallestDifference() {
		FileReader fr = new FileReader();

		assertEquals("Aston_Villa", fr.findSmallestDifference("src/main/resources/football.dat"));
	}

	@Test
	void findSmallestTemperatureSpreadTest() {
	FileReader fr = new FileReader();

	assertEquals(14, fr.findSmallestTemperatureSpread("src/main/resources/weather.dat"));
	}

	@Test
	void testFileReaderFileNotExists(){
		IllegalStateException err = assertThrows(IllegalStateException.class,
				  () -> new FileReader().findSmallestTemperatureSpread("filename"));
		assertEquals("Can not read file.", err.getMessage());
	}
}