package extension.source;

import groovy.sql.GroovyRowResult;

import java.util.HashMap;
import java.util.Map;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
class SpecA {
	Map getMap() {
        [key1 : 'value11']
	}

    GroovyRowResult getMap1() {
        new GroovyRowResult([key1 : 'valueGRR1'])
    }
}
