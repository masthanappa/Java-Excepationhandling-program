package defult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {
	
	    public static void main(String[] args) {
	        // Replace "YOUR_API_KEY" with your actual OpenWeatherMap API key
	        String apiKey = "c1efab176e56eba4811b34d4b37359d1";
	        String city = "Ballary";
	        
	        try {
	            // Construct the URL for the OpenWeatherMap API
	            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
	            URL url = new URL(apiUrl);

	            // Open a connection to the URL
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            // Read the response
	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            StringBuilder response = new StringBuilder();
	            String line;

	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }
	            reader.close();

	            // Print the weather information
	            System.out.println("Weather information for " + city + ":");
	            System.out.println(response.toString());

	            // Close the connection
	            connection.disconnect();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

