import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallAPI {
    public static void main(String[] args) {
        String type = "public";
        String appId = "ba5e56c8";
        String appKey = "277fcd58d168decaa5424793e4191835";
        String query = "chicken";
        System.out.println("print: ");
        try {
            // Construct the URL for the API request
            String str = "https://api.edamam.com/api/recipes/v2?type=" + type + "&q=" + query + "&app_id=" + appId + "&app_key=" + appKey;
            System.out.println(str);
            URL url = new URL(str);

            // Open the connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Get the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder responseContent = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                responseContent.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response: " + responseContent.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}