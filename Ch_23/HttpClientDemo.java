
// Demonstrate HttpClient
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.*;
import java.util.*;

class HttpClientDemo {

    public static void main(String[] args) throws Exception {
        // Obtain a client that uses the default settings.
        HttpClient myHC = HttpClient.newHttpClient();

        // Create a request
        HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com")).build();

        // Sends the request and get the response. Here, an InputStream is used for the
        // body
        HttpResponse<InputStream> myResp = myHC.send(myReq, BodyHandlers.ofInputStream());

        // Display the status code and response method
        System.out.println("Status code is " + myResp.statusCode());
        System.out.println("Response method is " + myReq.method());

        // Get hgeaders from the response
        HttpHeaders myHdrs = myResp.headers();
        Map<String, List<String>> hdrMap = myHdrs.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header:");

        // Display all header keys and values;
        for (String k : hdrField) {
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }

        // Display the body
        System.out.println("\nHere is the body");

        InputStream input = myResp.body();
        int c;

        while ((c = input.read()) != -1) {
            System.out.print((char) c);
        }
    }
}