package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.pageobjects.upload_download.UploadPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class UploadFilesTest extends BaseTest{

    private File fileForUpload = new File("test-text.txt");

    @BeforeClass
    public void beforeUploadFilesTestClass() {
        goToUrl(Constants.UPLOAD_FILE);
    }

    @Test
    public void uploadFilesTest (){
        String textFromBanner = new UploadPage()
                .uploadFile(fileForUpload)
                .submitUpload()
                .getTextFromBanner();
        Assert.assertTrue(textFromBanner.contains(fileForUpload.getName()));

    }
}
