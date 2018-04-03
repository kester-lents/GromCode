package Lesson9.Homework;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class User {
    private long id;
    private String name;
    private String sessionId;

    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }
    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.sessionId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return sessionId;
    }
}
