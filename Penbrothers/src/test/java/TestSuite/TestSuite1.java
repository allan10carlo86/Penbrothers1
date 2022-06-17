package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import TestCases.TESTCASE1_Login;
import TestCases.TESTCASE2_NavigateTo7DaysFreeTrial;
import TestCases.TESTCASE3_MyProfile;
import TestCases.TESTCASE4_SeachForKeyword;		

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
  TESTCASE1_Login.class,
  TESTCASE2_NavigateTo7DaysFreeTrial.class,
  TESTCASE3_MyProfile.class,
  TESTCASE4_SeachForKeyword.class
})


public class TestSuite1{
	
}