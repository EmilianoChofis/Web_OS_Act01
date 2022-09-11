package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config =  new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client =  new XmlRpcClient();
        client.setConfig(config);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un valor");
        double num1 = sc.nextDouble();
        System.out.println("Dime el 2do valor");
        double num2 = sc.nextDouble();
        System.out.println("Dime 3er valor");
        double num3 = sc.nextDouble();
        System.out.println("Dime 4to valor");
        double num4 = sc.nextDouble();

        Object [] numbers = {num1, num2, num3, num4};

        String response = (String) client.execute("Methods.datos",numbers);


        System.out.println(response);


    }
}
