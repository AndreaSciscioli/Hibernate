package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long students_id;
    @Column(length = 20,
            nullable = false)
    private String lastName;
    @Column(length = 20,
            nullable = false)
    private String firstName;

    @Column(length = 50,
            nullable = false,
            unique = true)
    private String email;

    @OneToMany(mappedBy = "students", fetch = FetchType.LAZY)
    private List<Enrollements> enrollementsList;


    public long getPrimaryKey() {
        return students_id;
    }

    public void setPrimaryKey(long primaryKey) {
        this.students_id = primaryKey;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
