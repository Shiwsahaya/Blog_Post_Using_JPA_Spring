package net.blog.post.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Posts {
    @Id
    @GeneratedValue
private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String email) {
        this.body = email;
    }

    private String title;
private String body;
}
