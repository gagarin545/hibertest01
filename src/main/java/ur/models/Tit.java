package ur.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tit")
public class Tit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  name;

    @OneToMany(mappedBy = "kod_tit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities;


}
