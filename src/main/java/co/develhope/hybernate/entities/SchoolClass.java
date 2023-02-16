package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "class")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long class_id;
    @Column(length = 20,
            nullable = false)
    private String title;
    @Column(length = 20,
            nullable = false)
    private String description;

    @OneToMany(mappedBy = "schoolclass", fetch = FetchType.LAZY)
    private List<Enrollements> enrollementsList;

    public Long getPrimaryKey() {
        return class_id;
    }

    public void setPrimaryKey(Long primaryKey) {
        this.class_id = primaryKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
