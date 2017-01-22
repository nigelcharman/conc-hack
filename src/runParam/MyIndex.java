package runParam;

import org.concordion.api.FullOGNL;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@FullOGNL
public class MyIndex {
    public void setFoo(Integer foo) {
        System.out.println("foo = " + foo);
    }
}
