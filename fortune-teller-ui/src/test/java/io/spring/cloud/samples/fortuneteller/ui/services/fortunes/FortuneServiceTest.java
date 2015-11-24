package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;


import au.com.dius.pact.consumer.*;
import au.com.dius.pact.model.PactFragment;
import io.spring.cloud.samples.fortuneteller.ui.Application;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class FortuneServiceTest {

    @Autowired
    FortuneService fortuneService;

    @Test

    public void runTest() {
        Fortune fortune = fortuneService.randomFortune();
        assertNotNull(fortune);
    }
}
