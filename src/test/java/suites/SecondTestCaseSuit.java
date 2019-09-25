package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.TestCamerasAvailability;
import tests.TestMp3Availability;
import tests.TestTabletsAvailability;

/**
 *Test Suit B by requirements
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestTabletsAvailability.class,
        TestCamerasAvailability.class,
        TestMp3Availability.class,
})
public class SecondTestCaseSuit {
}
