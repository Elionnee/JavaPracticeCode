package Pruebas4;
import java.net.*;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class NETHttpClientDemo {
	public static void main(String args[]) throws Exception {
		HttpClient myHC = HttpClient.newHttpClient();
		
		HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com/")).build();
		HttpResponse<InputStream> myResp = myHC.send(myReq, 
				HttpResponse.BodyHandlers.ofInputStream());
		
		System.out.println("Response code is " + myResp.statusCode());
		System.out.println("Request method is " + myReq.method());
		
		HttpHeaders hdrs = myResp.headers();
		
		Map<String, List<String>> hdrMap = hdrs.map();
		Set<String> hdrField = hdrMap.keySet();
		
		System.out.println("\nHeader : ");
		
		for (String str : hdrField) {
			System.out.println("Key : " + str + "       Value : " + hdrMap.get(str));
		}
		
		System.out.println("\nCuerpo : ");
		
		InputStream input = myResp.body();
		int c;
		while((c = input.read()) != 1) {
			System.out.println((char) c);
		}
	}
}
