import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import utils.Utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    //Google drive link: https://docs.google.com/document/d/16XKREqqzlJNLWHq5jZIminFVNuhuBTZHqwBKAsZnDFw/edit?usp=sharing

    public static void main(String[] args) {
       // Utils.saveIdentifyCode();
        if (true) {
            System.out.println(Utils.getCreds());
            Window window = new Window();
        }

        if (false){
            try {
                CloseableHttpClient client1 =  HttpClients.createDefault();
                URI uri1 = new URIBuilder("https://app.seker.live/fm1/answer-file")
                        .setParameter("magic", 23522151)
                        .setParameter("question", 1)
                        .setParameter("answer", 2)
                        .build();
                HttpPost request1 = new HttpPost(uri1);
                CloseableHttpResponse response = client1.execute(request1);
                String json1 = EntityUtils.toString(response.getEntity()); // מדפיס את הגייסון שנוצר מבקשות האפיאי
                System.out.println(json1);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                CloseableHttpClient client2 =  HttpClients.createDefault();
                URI uri2 = new URIBuilder("https://app.seker.live/fm1/answer-file")
                        .setParameter("magic", 23522151)
                        .setParameter("red", 1)
                        .setParameter("green", 2)
                        .setParameter("blue", 3)
                        .build();
                HttpPost request = new HttpPost(uri2);
                CloseableHttpResponse response = client2.execute(request);
                String json2 = EntityUtils.toString(response.getEntity()); // מדפיס את הגייסון שנוצר מבקשות האפיאי
                System.out.println(json2);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            URI uri = null;
            try {
                uri = new URIBuilder("https://app.seker.live/fm1/answer-file")
                        .setParameter("magic", "magic")
                        .setParameter("question", "2")
                        .setParameter("answer", "1981")
                        .build();
                System.out.println("עבד");
                HttpPost request = new HttpPost(uri);
            
                CloseableHttpResponse response = client.execute(request);
            
                // Check if the request was successful
                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    // Get the response entity
                    String responseBody = EntityUtils.toString(response.getEntity());
                    // Assuming the response body contains the SUCCESS value, print it
                    System.out.println("SUCCESS value: " + responseBody);
                } else {
                    System.out.println("Request failed with status code: " + response.getStatusLine().getStatusCode());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
