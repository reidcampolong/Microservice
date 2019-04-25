package ui;

import application.MyController;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * The UI Controller that handles an HTTP request defined in WebServer
 *
 * @author Reid
 */
public class RequestRoute implements Route {

    /** The Controller that we will use to process our data **/
    private MyController myController;

    /**
     * Create a new request route
     * @param myController
     */
    public RequestRoute(MyController myController) {
        this.myController = myController;
    }

    /**
     * Handle the HTTP request
     */
    public Object handle(Request request, Response response) {

        // Get input from the request parameters
        String inputData = request.queryParams("inputField");

        // Process the data in our controller and get a response
        String customResponse = myController.performCoolOperation(inputData);

        // Return our response to the user
        return customResponse;
    }

}
