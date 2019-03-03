package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class KsiazkaKucharska {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    String Tytul;

    @OneToMany(mappedBy = "ksiazkaKucharska")
    List<Przepis> przepisy;


    public KsiazkaKucharska() {
    }

    public KsiazkaKucharska(String tytul) {
        Tytul = tytul;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String tytul) {
        Tytul = tytul;
    }

    public List<Przepis> getPrzepisy() {
        return przepisy;
    }

    public void setPrzepisy(List<Przepis> przepisy) {
        this.przepisy = przepisy;
    }
}
