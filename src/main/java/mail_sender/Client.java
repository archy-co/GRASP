package mail_sender;

public class Client {

    public int getNextId() { return nextId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Sex getSex() { return sex; }
    public int getId() { return id; }

    private static int nextId = 0;
    private String name;
    private int age;
    private Sex sex;

    private int id;

    Client(String name_, int age_, Sex sex_){
        id = nextId;
        name = name_;
        age = age_;
        sex = sex_;

        nextId++;
    }

}
