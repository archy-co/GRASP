package mail_sender;

public class Client {
    public static int getNextId() { return nextId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSex() { return sex; }
    public int getId() { return id; }

    private static int nextId = 0;
    private String name;
    private int age;
    private String sex;

    private int id;
    Client(String name_, int age_, String sex_){
        id = nextId;
        name = name_;
        age = age_;
        sex = sex_;

        nextId++;
    }

}
