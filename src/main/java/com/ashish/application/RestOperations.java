package com.ashish.application;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class RestOperations {

    public static void main (String args[]) {
        String baseWebServiceURL = "http://10.84.90.143:8080/catalog";
        if (!baseWebServiceURL.endsWith("/"))
        {
            baseWebServiceURL += "/";
        }
        baseWebServiceURL += "network";
        org.springframework.web.client.RestOperations restOpertations =  new RestTemplate();
        baseWebServiceURL += "/HBOD";
        try {
            ResponseEntity<String> response= restOpertations.exchange(baseWebServiceURL, HttpMethod.HEAD, null, String.class);
            System.out.println(response.getStatusCode());
            
            /** or
              HttpHeaders header= restOpertations.headForHeaders(baseWebServiceURL);
              System.out.println(header);
             */
        } catch (HttpClientErrorException exception) {
            System.out.println(exception.getResponseBodyAsString());
        }
        
    }
}
