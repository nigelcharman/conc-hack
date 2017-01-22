package verifyRows;

import java.util.ArrayList;
import java.util.List;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.ScreenshotExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@Extensions(ScreenshotExtension.class)
@RunWith(ConcordionRunner.class)
public class VerifyRows { 

	public List<Person> getPeople() {
	    List<Person> people = new ArrayList<Person>();
	    people.add(new Person("John", "Travolta", 1954));
//        people.add(new Person("Cliff", "Richard", 1940));
//        people.add(new Person("Britney", "Spears", 1981));
	    return people;
	}
	
	public class Person {
	    public String firstName;
        public String lastName;
        public int birthYear;
        public Person(String firstName, String lastName, int birthYear) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }
	}
}
