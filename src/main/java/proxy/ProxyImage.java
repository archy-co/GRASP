package proxy;

public class ProxyImage implements Image{
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename_){
        filename = filename_;
        realImage = null;
    }

    public void display(){
        if (realImage == null)
            realImage = new RealImage(filename);

        realImage.display();
    }

}
