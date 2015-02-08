package cucumber.impl;

/**
 * Created by jiachiliu on 2/7/15.
 */
public class HelloWorldApp {
    private String username;

    public HelloWorldApp(String username) {
        this.username = username;
    }

    public String sayHi() {
        return "Hello " + username + "!";
    }
}
