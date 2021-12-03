package nuit.info.quichtouille.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String url;
    private String caracteristique;
    private String metier;
    private Date dateNaissance;
    private Date dateDeces;
    private int nbSauvetages;
    private String description;
    private String etatCivil;
    private String donneesGenealogique;
    private String carriere;
    private String decoration;
    private String actionSauvetage;

    public Person(long id, String nom, String prenom, String url, String caracteristique, String metier, Date dateNaissance, Date dateDeces, int nbSauvetages, String description, String etatCivil, String donneesGenealogique, String carriere, String decoration, String actionSauvetage) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.url = url;
        this.caracteristique = caracteristique;
        this.metier = metier;
        this.dateNaissance = dateNaissance;
        this.dateDeces = dateDeces;
        this.nbSauvetages = nbSauvetages;
        this.description = description;
        this.etatCivil = etatCivil;
        this.donneesGenealogique = donneesGenealogique;
        this.carriere = carriere;
        this.decoration = decoration;
        this.actionSauvetage = actionSauvetage;
    }

    public Person() {
    }

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Column(name = "caracteristique")
    public String getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(String caracteristique) {
        this.caracteristique = caracteristique;
    }
    @Column(name = "metier")
    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }
    @Column(name = "dateNaissance")
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    @Column(name = "dateDeces")
    public Date getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Date dateDeces) {
        this.dateDeces = dateDeces;
    }
    @Column(name = "nbSauvetage")
    public int getNbSauvetages() {
        return nbSauvetages;
    }

    public void setNbSauvetages(int nbSauvetages) {
        this.nbSauvetages = nbSauvetages;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "etatCivil")
    public String getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
    }
    @Column(name = "donneesGenealogique")
    public String getDonneesGenealogique() {
        return donneesGenealogique;
    }

    public void setDonneesGenealogique(String donneesGenealogique) {
        this.donneesGenealogique = donneesGenealogique;
    }
    @Column(name = "carriere")
    public String getCarriere() {
        return carriere;
    }

    public void setCarriere(String carriere) {
        this.carriere = carriere;
    }
    @Column(name = "decoration")
    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }
    @Column(name = "actionSauvetage")
    public String getActionSauvetage() {
        return actionSauvetage;
    }

    public void setActionSauvetage(String actionSauvetage) {
        this.actionSauvetage = actionSauvetage;
    }
}


