package entities;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(generator = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", length = 25)
    private String name;
    @Column(name = "email", length = 30)
    private String email;
//sout

    public User(){

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



}
