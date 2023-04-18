package gbsw.plutter.project.PMS.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String location;
    @Column()
    private Integer floor;
    @Column()
    private String particular;
    @Column()
    private Integer capacity;
    @Column()
    private Integer maxCapacity;
    @ManyToOne()
    @JoinColumn(name = "teacherId", referencedColumnName = "id")
    private Teacher teacher;
}
