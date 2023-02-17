package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import testes.PetTest;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
        PetTest.class
})
public class Suite {

}
