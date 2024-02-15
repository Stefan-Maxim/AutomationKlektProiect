package pages.SignInPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignInPage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        SignInPage instance = null;
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }
}
