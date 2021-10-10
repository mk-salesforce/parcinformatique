package SMP.Parcinformatique.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Utilisateur;
    private String Service ;
    private String Fonction ;
    private String LoginSage ;
    private String Mail;
    private String Fixe ;
    private String Mobile;
    private String Materiel;
    private String Fabricant;
    private String Modele;
    private String Type;
    private String NumeroDeSerie;
    private String Annee;
    private String NomAppareil;
    private String AdresseIp;
    private String Processeur;
    private String Ram;
    private String Rom;
    private String Os;
    private String VersionOffice;

    public Employee(){}

    public Employee(Long id, String utilisateur, String service, String fonction, String loginSage, String mail, String fixe, String mobile, String materiel, String fabricant, String modele, String type, String numeroDeSerie, String annee, String nomAppareil, String adresseIp, String processeur, String ram, String rom, String os, String versionOffice) {
        this.id = id;
        Utilisateur = utilisateur;
        Service = service;
        Fonction = fonction;
        LoginSage = loginSage;
        Mail = mail;
        Fixe = fixe;
        Mobile = mobile;
        Materiel = materiel;
        Fabricant = fabricant;
        Modele = modele;
        Type = type;
        NumeroDeSerie = numeroDeSerie;
        Annee = annee;
        NomAppareil = nomAppareil;
        AdresseIp = adresseIp;
        Processeur = processeur;
        Ram = ram;
        Rom = rom;
        Os = os;
        VersionOffice = versionOffice;
    }

    public Long getId() {
        return id;
    }

    public String getUtilisateur() {
        return Utilisateur;
    }

    public String getService() {
        return Service;
    }

    public String getFonction() {
        return Fonction;
    }

    public String getLoginSage() {
        return LoginSage;
    }

    public String getMail() {
        return Mail;
    }

    public String getFixe() {
        return Fixe;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getMateriel() {
        return Materiel;
    }

    public String getFabricant() {
        return Fabricant;
    }

    public String getModele() {
        return Modele;
    }

    public String getType() {
        return Type;
    }

    public String getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public String getAnnee() {
        return Annee;
    }

    public String getNomAppareil() {
        return NomAppareil;
    }

    public String getAdresseIp() {
        return AdresseIp;
    }

    public String getProcesseur() {
        return Processeur;
    }

    public String getRam() {
        return Ram;
    }

    public String getRom() {
        return Rom;
    }

    public String getOs() {
        return Os;
    }

    public String getVersionOffice() {
        return VersionOffice;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setUtilisateur(String utilisateur) {
        Utilisateur = utilisateur;
    }

    public void setService(String service) {
        Service = service;
    }

    public void setFonction(String fonction) {
        Fonction = fonction;
    }

    public void setLoginSage(String loginSage) {
        LoginSage = loginSage;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public void setFixe(String fixe) {
        Fixe = fixe;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public void setMateriel(String materiel) {
        Materiel = materiel;
    }

    public void setFabricant(String fabricant) {
        Fabricant = fabricant;
    }

    public void setModele(String modele) {
        Modele = modele;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        NumeroDeSerie = numeroDeSerie;
    }

    public void setAnnee(String annee) {
        Annee = annee;
    }

    public void setNomAppareil(String nomAppareil) {
        NomAppareil = nomAppareil;
    }

    public void setAdresseIp(String adresseIp) {
        AdresseIp = adresseIp;
    }

    public void setProcesseur(String processeur) {
        Processeur = processeur;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public void setRom(String rom) {
        Rom = rom;
    }

    public void setOs(String os) {
        Os = os;
    }

    public void setVersionOffice(String versionOffice) {
        VersionOffice = versionOffice;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Utilisateur='" + Utilisateur + '\'' +
                ", Service='" + Service + '\'' +
                ", Fonction='" + Fonction + '\'' +
                ", LoginSage='" + LoginSage + '\'' +
                ", Mail='" + Mail + '\'' +
                ", Fixe='" + Fixe + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Materiel='" + Materiel + '\'' +
                ", Fabricant='" + Fabricant + '\'' +
                ", Modele='" + Modele + '\'' +
                ", Type='" + Type + '\'' +
                ", NumeroDeSerie='" + NumeroDeSerie + '\'' +
                ", Annee='" + Annee + '\'' +
                ", NomAppareil='" + NomAppareil + '\'' +
                ", AdresseIp='" + AdresseIp + '\'' +
                ", Processeur='" + Processeur + '\'' +
                ", Ram='" + Ram + '\'' +
                ", Rom='" + Rom + '\'' +
                ", Os='" + Os + '\'' +
                ", VersionOffice='" + VersionOffice + '\'' +
                '}';
    }
}
