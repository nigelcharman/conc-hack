package runParam;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class MySpec {
    public void sleep(int secs) throws InterruptedException {
        Thread.sleep(secs);
    }
    
    public void setY(Integer y) {
        System.out.println("Spec y = " + y);
    }


}
