import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;



public class ConsultaDivisas {
    private static final String API_KEY = "4140c741650e1b7aaf069378";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public Divisas buscarDivisas(String divisaReferencial, String divisaTarget) {
        URI direccion = URI.create(BASE_URL + API_KEY + "/pair/" + divisaReferencial + "/" + divisaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);

        }
        catch (Exception e) {
            throw new RuntimeException("No encontre la Divisa indicada");
        }

    }

}


