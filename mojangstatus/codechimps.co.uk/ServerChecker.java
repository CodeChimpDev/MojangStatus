package mojangstatus.codechimps.co.uk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServerChecker {
	 
    private static JSONParser parser = new JSONParser();
 
    public static boolean isOnline(String service) throws IOException, ParseException {       
        URL url = new URL("http://status.mojang.com/check?service=" + service + ".minecraft.net");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
 
        Object obj = parser.parse(in);
        JSONObject jsonObject = (JSONObject) obj;
 
        String status = (String) jsonObject.get(service + ".minecraft.net");
 
        if (status.equals("green")) {
            return true;
        } else {
            return false;
        }
    }
 
}
