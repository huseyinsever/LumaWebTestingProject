package StepDefinitinos;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.testng.annotations.AfterMethod;

public class Hooks {


    @Before
    public void before(){
        System.out.println("Senaryo başladı");
    }

    @After
    public void after(Scenario scenario){
        /* System.out.println("Senaryo Bitti");
        System.out.println("scenario sonucu="+ scenario.getStatus());
        System.out.println("scenario isFailed ?="+ scenario.isFailed());

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed()){
            // Klasöre Ekran Görüntüsünü atıyor (Hata var ise)
            TakesScreenshot screenshot = (TakesScreenshot) GWD.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi,new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
*/
        // ekran görüntüsü al senaryo hatalı ise
        GWD.quitDriver();
    }



}
