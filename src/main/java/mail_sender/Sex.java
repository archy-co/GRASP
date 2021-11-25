package mail_sender;

public enum Sex {
    male("M"), female("F");

    private String sex;

    Sex(String sex_) {
        sex = sex_;
    }
    public String toString(){
        return sex;
    }
}
