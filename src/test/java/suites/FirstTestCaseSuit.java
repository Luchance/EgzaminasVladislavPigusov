package suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.TestLaptopsAndNotebooksAvailability;
import tests.TestPhonesAndPDAsAvailability;
import tests.TestTabletsAvailability;

/**
 *Test Suit A by requirements
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestLaptopsAndNotebooksAvailability.class,
        TestTabletsAvailability.class,
        TestPhonesAndPDAsAvailability.class,
})

public class FirstTestCaseSuit {
}
