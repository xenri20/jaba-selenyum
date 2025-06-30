import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
