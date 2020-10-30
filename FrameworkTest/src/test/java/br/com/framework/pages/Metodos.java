package br.com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	WebDriver driver;

	public void navegador(String Url, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {

			switch (navegador) {

			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(Url);
				break;

			case "FIREFOX":
				System.setProperty("webdriver.gecko.driver", "./Driver/geckochromedriver.exe");
				driver = new FirefoxDriver();
				driver.get(Url);
				break;

			}

		} else {
			System.out.println("Navegadores autorizados s�o: Chrome ou Firefox");
		}

	}

	/**
	 * @author Fabio Ramos
	 * @param clicar no elemento
	 */

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Preencher

	/**
	 * @author Fabio Ramos
	 * @param preencher
	 */

	public void preencher(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * @author Fabio Ramos
	 * @param quit
	 */

	public void fechar() {
		driver.quit();
	}

	/**
	 * @author Fabio Ramos
	 * @param submit
	 */

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
}
