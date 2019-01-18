package Login;

import org.testng.annotations.Test;

public class TestNGDependencies {
@Test
public void login() {
	System.out.println("login");
}
@Test(dependsOnMethods="login")
public void DoSomeActivity() {
	System.out.println("Activity");
}
@Test(dependsOnMethods="DoSomeActivity")
public void logout() {
	System.out.println("logout");
}

}
