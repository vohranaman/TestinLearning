package Login;

import org.testng.annotations.Test;

public class TestNGPriority {
@Test(priority=3,description="This method is about Login")
public void login() {
	System.out.println("login");
}
@Test(priority=1, description="This method is about doing myaccount activities")
public void DoSomeActivity() {
	System.out.println("Activity");
}
@Test(priority=2,description="This method is about Logout")
public void logout() {
	System.out.println("logout");
}

}
