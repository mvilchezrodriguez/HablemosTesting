package objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacionTransferenciaObject {

    private AndroidDriver<AndroidElement> driver;
    private WebDriverWait wait;
    public InformacionTransferenciaObject( AndroidDriver<AndroidElement> driver){

        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(this.driver,20);

    }


    @AndroidFindBy(xpath="*//android.view.View/android.view.View[2]/android.view.View[4][@instance='23']")
    private AndroidElement txt_opcionRecibido;


    @AndroidFindBy(xpath="*//android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2][@instance='27']")
    private AndroidElement txt_informacionTransferencia;

    @AndroidFindBy(xpath="//android.widget.Button[@instance='0']")
    private AndroidElement txt_btnRastrearOtraTrasferencia;



    public String InformacionTransferencia()
    {
       String msgInformacion = wait.until(ExpectedConditions.visibilityOf(txt_informacionTransferencia)).getText();
        System.out.println("Es: "+msgInformacion);
         return msgInformacion;

    }

    public String TransferenciaRecibida()
    {
        String msgRecibido = wait.until(ExpectedConditions.visibilityOf(txt_opcionRecibido)).getText();
        System.out.println("Es: "+msgRecibido);
        return msgRecibido;
    }
}
