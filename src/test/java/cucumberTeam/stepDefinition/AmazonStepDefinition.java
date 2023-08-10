package cucumberTeam.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.ReasablesMethods;

public class AmazonStepDefinition {
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
       // ReasablesMethods.bekle(2);
    }

    @Then("kullanici arama kutusunda iphone aratir")
    public void kullaniciAramaKutusundaIphoneAratir() {
        Driver.getDriver().findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone", Keys.ENTER);
      //  ReasablesMethods.bekle(2);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {

        try {
            Thread.sleep(sayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
