package examples;

import org.concordion.api.option.ConcordionOptions;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@ConcordionOptions(declareNamespaces = {"ext","uri:whatever"}, copySourceHtmlToDir = "/tmp")
public class Andrew {

}
