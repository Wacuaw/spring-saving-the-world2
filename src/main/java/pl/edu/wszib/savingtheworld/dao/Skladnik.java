package pl.edu.wszib.savingtheworld.dao;


import javax.persistence.*;

@Entity
@Table
public class Skladnik {


    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    TypSkladnika typskladnika;

    int ilosc;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "przepis_id", nullable = false)
    Przepis przepis;


    public Skladnik() {
    }

    public Skladnik(TypSkladnika typskladnika, int ilosc, Przepis przepis) {
        this.typskladnika = typskladnika;
        this.ilosc = ilosc;
        this.przepis = przepis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypSkladnika getTypskladnika() {
        return typskladnika;
    }

    public void setTypskladnika(TypSkladnika typskladnika) {
        this.typskladnika = typskladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}
