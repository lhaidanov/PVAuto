package lesson7.org.lh.pageobjects.upload_download;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.pageobjects.BasePage;
import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

public class DownloadPage extends BasePage {

    @FindBy(css = ".example a")
    private List<WebElement> anchors;

    public File fileDownload (String fileName){
        for (WebElement element : anchors){
            if (element.getText().equals(fileName)){
                element.click();
                break;
            }
        }
        sleep(3);
        return new File(Constants.downloadFolder, fileName);



    }
}
