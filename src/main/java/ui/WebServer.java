package ui;

import application.MyController;

import static spark.Spark.post;

/**
 * A simple WebServer that defines the HTTP routes for the microservice
 *
 * @author Reid
 */
public class WebServer {

    /** An example HTTP route **/
    private final String REQUEST_URL = "/request";

    /** This controller will perform actions on the requests as defined in Request Route**/
    private MyController myController;

    /**
     * Initialize HTTP web routes and controllers for server
     */
    public void initialize() {

        myController = new MyController();

        // Create a POST request route
        post(REQUEST_URL, new RequestRoute(myController));

    }
}
