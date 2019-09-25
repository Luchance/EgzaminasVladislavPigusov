package suites;

import org.junit.runner.JUnitCore;

/**
 * Executes both test suites
 * TODO: was not able properly assert for test not to fail and continue and to print error message with assertions so using println method
 */
public class TestSuitExecution {
    public static void main(String[] args) {
        JUnitCore.runClasses(FirstTestCaseSuit.class);
        JUnitCore.runClasses(SecondTestCaseSuit.class);
    }
}

// TO run in console FirstCaseScenario --> mvn clean test -Dtest=FirstCaseScenarioSuit
// TO run in console SecondTestScenario --> mvn clean test -Dtest=SecondTestCaseScenarioSuit