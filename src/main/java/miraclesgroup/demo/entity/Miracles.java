package miraclesgroup.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "miracles")
public class Miracles {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
}
