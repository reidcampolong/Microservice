import ui.WebServer;

/**
 * Used to start the microservice.
 */
public class Application {

    /** Instance of our webserver **/
    private WebServer webServer;

    /**
     * Create a new application
     *
     * @param webServer
     */
    public Application(WebServer webServer) {
        this.webServer = webServer;
    }

    /**
     * Initialize the application
     */
    private void initialize() {
        webServer.initialize();
    }

    /**
     * Launch application
     *
     * @param args
     */
    public static void main(String[] args) {
        WebServer webServer = new WebServer();

        Application application = new Application(webServer);
        application.initialize();
    }

}
