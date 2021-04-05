package lesson7.org.lh.pageobjects.upload_download;

import lesson7.org.lh.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class UploadPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement uploadFileInput;

    @FindBy(id = "file-submit")
    private WebElement submitButton;

    @FindBy(id = "uploaded-files")
    private WebElement successfulUploadFileBanner;

    public UploadPage uploadFile(File fileToUpload){
        uploadFileInput.sendKeys(fileToUpload.getAbsolutePath());
        return this;

    }

    public UploadPage submitUpload(){
        submitButton.click();
        return new UploadPage();
    }

    public String getTextFromBanner(){
        return successfulUploadFileBanner.getText();
    }

}
