package splittingNames;

import org.concordion.api.FullOGNL;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@FullOGNL
public class SplittingNamesTest {

    public Result split(String fullName, String suffix) {
        Result result = new Result();
        String[] words = fullName.split(" ");
        result.setFirstName(words[0] + suffix);
        result.setLastName(words[1] + suffix);
        return result;
    }
    
    public void print(String s) {
        System.out.println(s);
    }

    class Result {
        private String firstName;
        private String lastName;
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}