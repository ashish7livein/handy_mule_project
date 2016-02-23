package com.ashish.application;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ConnectionTest {

    public static void main (String args[]) {
            boolean result = false;
            String url = "";
            
            url = "http://localhost:8082/catalog";
            
            RestTemplate rt = new RestTemplate();
            try {
                HttpHeaders h = rt.headForHeaders(url);
                if(h != null)
                {
                    //check headers?
                    result = true;
                }
            }
            catch (RestClientException rce)
            {
                System.out.println(rce.getLocalizedMessage());
            }
         System.out.println(result);   
            
    }
    
}
