package proxy;

public class ProxyPatternDemo {
    public static void main(String [] args){
        Image realImage = new RealImage("file4real.txt");
        realImage.display();
        realImage.display();

        System.out.println("----------------------------");

        Image proxyImage = new ProxyImage("file4proxy.txt");
        proxyImage.display();
        proxyImage.display();
    }
}
