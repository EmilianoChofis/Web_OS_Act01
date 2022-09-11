package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientOrden {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un valor");
        int num1 = sc.nextInt();
        System.out.println("Dime el 2do valor");
        int num2 = sc.nextInt();
        System.out.println("Dime el 3er valor");
        int num3 = sc.nextInt();
        System.out.println("Dime el 4to valor");
        int num4 = sc.nextInt();
        System.out.println("Dime el 5to valor");
        int num5 = sc.nextInt();

        Object [] numbers = {num1, num2, num3, num4, num5};

        String response = (String) client.execute("Methods.orden",numbers);

        System.out.println(response);

    }
}
