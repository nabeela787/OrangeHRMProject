import org.testng.annotations.Test;

public class AdminTest extends TestBase{

    @Test
    public void test002() {
        startLogInPage()
                .logToPIMPage()
                .navigateToAdminPage()
                .searchUsername("Aaliyah.Haq")
                .validateUsername("Aaliyah.Haq");
    }
}
