package nuit.info.quichtouille.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rescue")
public class Rescue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Boat boat;

    private String description;

    @OneToOne
    private Person patron;

    @OneToOne
    private Person sousPatron;

    @OneToMany
    private List<Person> armement;
    private String url;

    public Rescue(long id, Boat boat, String description, Person patron, Person sousPatron, List<Person> armement, String url) {
        this.id = id;
        this.boat = boat;
        this.description = description;
        this.patron = patron;
        this.sousPatron = sousPatron;
        this.armement = armement;
        this.url = url;
    }

    public Rescue() {

    }

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "boat")
    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "patron")
    public Person getPatron() {
        return patron;
    }

    public void setPatron(Person patron) {
        this.patron = patron;
    }
    @Column(name = "sousPatron")
    public Person getSousPatron() {
        return sousPatron;
    }

    public void setSousPatron(Person sousPatron) {
        this.sousPatron = sousPatron;
    }

    @Column(name = "armement")
    public List<Person> getArmement() {
        return armement;
    }

    public void setArmement(List<Person> armement) {
        this.armement = armement;
    }



    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
