package com.nttdata.ct.web.glue;

import com.nttdata.ct.web.WebAutomationApplication;
import com.nttdata.ct.web.lib.WebDriverManager;
import com.nttdata.ct.web.step.GoogleSearchStep;
import com.nttdata.ct.web.step.GoogleSettingsStep;
import com.nttdata.ct.web.step.SauceStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = WebAutomationApplication.class)
public class GoogleStepDefinition {

    @Value("${url.google}")
    private String urlGoogle;
    @Value("${url.settings}")
    private String urlGoogleSettings;

    @Value("${url.sauce}")
    private String urlSauce;

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private GoogleSearchStep searchStep;
    @Autowired
    private GoogleSettingsStep settingsStep; //demo shadowRoot

    @Autowired
    private SauceStep SauceStep;

    @Given("que abro la pagina de google")
    public void queAbroLaPaginaDeGoogle() {
        manager.navigateTo(urlGoogle);
    }

    @Given("que abro la pagina de configuracio de google")
    public void queAbroLaPaginaDeConfiguracioDeGoogle() {
        manager.navigateTo(urlGoogleSettings);
    }

    @Given("que abro la pagina de sauce")
    public void queAbroLaPaginaDeSauce() {
        manager.navigateTo(urlSauce);
    }

    @When("escribo la busqueda de: {string}")
    public void escriboLaBusquedaDe(String busqueda) {
        searchStep.searchData(busqueda);
    }

    @Then("valido que los resultados sean mayores a {int}")
    public void validoQueLosResultadosSeanMayoresA(int count) {
        searchStep.validateResults(count);
    }

    @When("busco la opcion {string}")
    public void buscoLaOpcion(String option) {
        settingsStep.searchSettings(option);
    }

    @Then("valido que el resultado sea {string}")
    public void validoQueElResultadoSea(String result) {
        settingsStep.validateValueResult(result);
    }

    @When("escribo usurio: {string}")
    public void escriboUsuario(String option){}
}