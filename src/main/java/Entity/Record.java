package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Record {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Lob()
    private String content;
    private LocalDate date;
    @ManyToOne
    private Topic topic;
    @ManyToOne
    private Member member;

    public Record(){}

    public Record(String content, LocalDate date, Topic topic, Member member) {
        this.content = content;
        this.date = date;
        this.topic = topic;
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
