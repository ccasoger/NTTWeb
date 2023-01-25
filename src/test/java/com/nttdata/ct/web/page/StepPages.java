package com.nttdata.ct.web.page;

import org.springframework.stereotype.Component;

@Component
public class StepPages {

    public GoogleSearchPage searchPage() {
        return new GoogleSearchPage();
    }

    public GoogleResultsPage resultsPage() {
        return new GoogleResultsPage();
    }

    public GoogleSettinsPage settinsPage() {
        return new GoogleSettinsPage();
    }

    public SaucePage inicialPage(){ return new SaucePage(); }

    public SauceLoginPage loginPage(){ return new SauceLoginPage(); }
}
