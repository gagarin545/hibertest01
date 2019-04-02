package ur.models;

import javax.persistence.*;

@Entity
@Table(name = "city")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "namecity")
    private String namecity;
    private String kod_city;

    //можно не указывать Column name, если оно совпадает с названием столбца в таблице


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kod_tit")
    private Tit tit;

    public City() {
    }

    public City(String namecity, String kod_city) {
        this.namecity = namecity;
        this.kod_city = kod_city;

    }

    public int getId() {
        return id;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setnamecity(String namecity) {
        this.namecity = namecity;
    }



    @Override
    public String toString() {
        return namecity;
    }

}
