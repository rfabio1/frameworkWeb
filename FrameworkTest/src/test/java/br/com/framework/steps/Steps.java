package br.com.framework.steps;

import br.com.framework.elementos.Elementos;
import br.com.framework.pages.Metodos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos elem = new Elementos();

	@Given("^que eu esteja no \"([^\"]*)\"$")
	public void que_eu_esteja_no(String Url) throws Throwable {
		metodos.navegador(Url, "Chrome");

	}

	@When("^eu preencher \"([^\"]*)\"$")
	public void eu_preencher(String text) throws Throwable {
		metodos.preencher(elem.getPesquisa(), text);
		metodos.submit(elem.getPesquisa());

	}

	@Then("^Apresenta a pesquisa$")
	public void apresenta_a_pesquisa() throws Throwable {

	}

}
