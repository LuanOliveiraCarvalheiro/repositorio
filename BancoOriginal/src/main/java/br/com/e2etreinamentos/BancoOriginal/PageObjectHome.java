package br.com.e2etreinamentos.BancoOriginal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectHome {

	WebDriver driver;
	WebElement BotaoCriarConta;
	WebElement nome;
	WebElement telefone;
	WebElement email;
	WebElement cpf;
	WebElement btnEnviar;
	WebElement msgConfirm;

	public void SetAmbiente() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin0002\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void EntraSite() {

		driver.get("https://www.original.com.br/");

	}

	public void ClicarBotaoAbrirConta() {

		BotaoCriarConta = driver.findElement(By.xpath("//*[@id=\"section-1\"]/div[2]/a"));
		BotaoCriarConta.click();
	}

	public void PreencherDados(String nome, String telefone, String email, String cpf) {

		this.nome = driver.findElement(By.id("nome"));
		this.nome.sendKeys(nome);

		this.telefone = driver.findElement(By.id("telefone"));
		this.telefone.sendKeys(telefone);

		this.email = driver.findElement(By.id("email"));
		this.email.sendKeys(email);

		this.cpf = driver.findElement(By.id("cpf"));
		this.cpf.sendKeys(cpf);

	}

	public void ClicarEnviar() {

		btnEnviar = driver.findElement(By.id("btnEnviar"));
		btnEnviar.click();

		
	}
	
	public String ValidarTexto () {
		
		msgConfirm = driver.findElement(By.xpath("//*[@id=\"send-sms\"]/label"));
		return msgConfirm.getText();
		
	}

}
