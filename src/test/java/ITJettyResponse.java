import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ITJettyResponse {
    private final String URL = "http://localhost:8080/estock/home";
    @Test
    public void testHomePageResponse(){
        HttpGet request = new HttpGet(URL);
        try {
            HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
            Assert.assertEquals((HttpStatus.SC_OK), httpResponse.getStatusLine().getStatusCode());
        } catch (IOException ignored) {
            Assert.fail();
        }
    }
}
