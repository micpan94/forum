package Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Members")
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Member_Id", nullable = false)
    private Integer id;
    private String login;
    private String password;
    @OneToMany
    private Set<Topic> topics;

    public Member(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Member(){}

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
}
