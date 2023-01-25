package com.nttdata.ct.web.step;
import com.nttdata.ct.web.page.StepPages;
import com.nttdata.ct.web.service.aspect.evidence.ScreenShot;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class SauceStep {
    @Autowired
    private StepPages page;


}
