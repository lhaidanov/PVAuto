package lesson7.org.lh.app;

import java.io.File;

public class Constants {
    public static final String APP_URL = "https://the-internet.herokuapp.com";
    public static final String ALERTS_PAGE = APP_URL + "/javascript_alerts";
    public static final String WINDOWS_PAGE = APP_URL + "/windows";
    public static final String BASIC_AUTH = APP_URL + "/basic_auth";
    public static final String LOGIN_FORM = APP_URL + "/login";
    public static final String HOVER_PAGE = APP_URL + "/hovers";
    public static final String UPLOAD_FILE = APP_URL + "/upload";
    public static final String DOWNLOAD_FILE = APP_URL + "/download";
    public static File downloadFolder = new File("downloads");
    public static File screenshotsFolder = new File("screens");

}
