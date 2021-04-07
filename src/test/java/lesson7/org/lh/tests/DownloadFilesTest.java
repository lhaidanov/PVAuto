package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.pageobjects.upload_download.DownloadPage;
import lesson7.org.lh.pageobjects.upload_download.UploadPage;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DownloadFilesTest extends BaseTest{

    private File fileForUpload = new File("test-text.txt");

    @BeforeClass
    public void beforeDownloadFilesTestClass() {
        goToUrl(Constants.UPLOAD_FILE);
        new UploadPage()
                .uploadFile(fileForUpload)
                .submitUpload();
        goToUrl(Constants.DOWNLOAD_FILE);
    }

    @Test
    public void downloadFilesTest () throws IOException {
        File file = new DownloadPage()
                .fileDownload(fileForUpload.getName());
        Assert.assertTrue(FileUtils.contentEquals(fileForUpload, file));

    }
}
