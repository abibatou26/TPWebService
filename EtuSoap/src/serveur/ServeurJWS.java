package serveur;

import javax.xml.ws.Endpoint;
import service.EtudiantService;


public class ServeurJWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://192.168.144.234:809/";
		Endpoint.publish(url,new EtudiantService());
		//Test
		System.out.println(url);

	}

}
