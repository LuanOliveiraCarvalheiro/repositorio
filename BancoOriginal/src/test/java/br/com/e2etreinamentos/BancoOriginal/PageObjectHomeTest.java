package br.com.e2etreinamentos.BancoOriginal;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageObjectHomeTest {

	PageObjectHome c = new PageObjectHome();

	@Given("^que eu acesse o banco original$")
	public void que_eu_acesse_o_banco_original() throws Throwable {

		c.SetAmbiente();
		c.EntraSite();
	}

	@Given("^clique no botão Acessar minha conta$")
	public void clique_no_botão_Acessar_minha_conta() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c.ClicarBotaoAbrirConta();
	}

	@When("^eu preencher os campos com as minhas informações$")
	public void eu_preencher_os_campos_com_as_minhas_informações() throws Throwable {

		c.PreencherDados("Luan Oliveira Carvalheiro", "(11)95962-8131", "luan.xr@hotmail.com", "488.003.058-90");
	}

	@When("^clique no botão finalizar cadastro$")
	public void clique_no_botão_finalizar_cadastro() throws Throwable {

		c.ClicarEnviar();
	}

	@Then("^a mensagem pronto é aparece com sucesso$")
	public void a_mensagem_pronto_é_aparece_com_sucesso() throws Throwable {

		assertEquals("gora você receberá um SMS para baixar o app Seja Original "
				+ "e concluir sua solicitação de abertura de conta!", c.ValidarTexto());
	}

}
