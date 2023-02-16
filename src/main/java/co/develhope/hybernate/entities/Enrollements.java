package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.lang.ref.Reference;

@Entity
@Table(name = "enrollments")
public class Enrollements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long primaryKey;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private SchoolClass schoolclass;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Students students;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public SchoolClass getClassId() {
        return schoolclass;
    }

    public void setClassId(SchoolClass classId) {
        this.schoolclass = classId;
    }

    public Students getStudentsId() {
        return students;
    }

    public void setStudentsId(Students studentsId) {
        this.students = studentsId;
    }
}
