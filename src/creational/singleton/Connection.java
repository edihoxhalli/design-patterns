package creational.singleton;

//Singleton
public class Connection {

    /*
    TODO: Create an app to scrape Wikipedia pages and categorize them. Apply creational design patterns to do so!!! :* :D
     */

    private String url;
    private int threads;

    private static Connection instance;

    private Connection(String url, int threads){
        this.url = url;
        this.threads = threads;
    }

    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection("https://en.wikipedia.org/wiki/Main_Page", 4);
        }
        return instance;
    }

}
