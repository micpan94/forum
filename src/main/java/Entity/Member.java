package Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String login;
    private String password;
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private Set<Topic> topics;
    @OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private Set<Record> records;


    public Member() {
    }

    public Member(String login, String password, Set<Topic> topics, Set<Record> records) {
        this.login = login;
        this.password = password;
        this.topics = topics;
        this.records = records;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }

    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }
}
