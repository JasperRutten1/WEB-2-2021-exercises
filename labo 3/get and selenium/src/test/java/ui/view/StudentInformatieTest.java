package ui.view;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentInformatieTest {

	// verander de url naar jouw url naam
	private static final String url = "http://localhost:8080/";
	private WebDriver driver;
	
	@Before
	public void setUp () {
//		 Voor Windows (vergeet "\" niet te escapen met een tweede "\")
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\chromedriver.exe");
//		 Voor mac: 
		 System.setProperty("webdriver.chrome.driver", "C:\\servers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test_StudentInfo_Steegmans_Elke_geeft_resultaat () {
		driver.get(url+"StudentInfo?naam=Steegmans&voornaam=Elke");
		String resultaat = driver.findElement(By.tagName("p")).getText();
		assertEquals("Je vroeg naar volgende gegevens: Steegmans Elke (16 jaar): Vroedkunde", resultaat);
	}

	@Test
	public void test_formulier_Steegmans_elke_geeft_resultaat() {
		driver.get(url+"zoek.jsp");
		fillOutForm("Steegmans", "Elke");
		String resultaat = driver.findElement(By.tagName("p")).getText();
		assertEquals("Je vroeg naar volgende gegevens: Steegmans Elke (16 jaar): Vroedkunde", resultaat);
	}

	private void fillOutForm(String naam, String voornaam) {
		driver.findElement(By.id("naam")).clear();
		driver.findElement(By.id("naam")).sendKeys(naam);
		driver.findElement(By.id("voornaam")).clear();
		driver.findElement(By.id("voornaam")).sendKeys(voornaam);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

	@Test
	public void test_Toon_alle_studenten_in_overzicht () {
		driver.get(url+"studentInfoOverzicht.jsp");
		List<WebElement> tds = driver.findElements(By.cssSelector("td"));
		assertTrue(paginaBevatTdMetText(tds, "Steegmans"));
		assertTrue(paginaBevatTdMetText(tds, "Jongen"));
		assertTrue(paginaBevatTdMetText(tds, "Melaerts"));
		assertTrue(paginaBevatTdMetText(tds, "Van Hee"));
	}

	@Test
	public void test_StudentInfo_Kemme_Mieke_geeft_geen_resultaat () {
		driver.get(url+"StudentInfo?naam=Kemme&voornaam=Mieke");
		String resultaat = driver.findElement(By.tagName("p")).getText();
		assertEquals("Helaas, de student waarnaar je vraagt is niet gevonden.", resultaat);
	}

	@Test
	public void test_formulier_Kemme_Mieke_geeft_geen_resultaat() {
		driver.get(url + "zoek.jsp");
		fillOutForm("Kemme", "Mieke");
		String resultaat = driver.findElement(By.tagName("p")).getText();
		assertEquals("Helaas, de student waarnaar je vraagt is niet gevonden.", resultaat);
	}

	@After
	public void tearDown () {
		driver.quit();
	}
	
	private boolean paginaBevatTdMetText (List<WebElement> tds, String tekst) {
		for (WebElement td : tds) {
			if (td.getText().equals(tekst)) {
				return true;
			}
		}
		return false;
	}
}
