package cucumber.features.docstring.stepdefs;

import cucumber.api.java.en.Given;

/**
 * Created by jiachiliu on 2/8/15.
 */
public class DocStringStepdefs {
    @Given("^a json object post with title \"([^\"]*)\" and body$")
    public void a_json_object_post_with_title_and_body(String title, String json) throws Throwable {
        System.out.println(title);
        System.out.println(json);
    }
}
