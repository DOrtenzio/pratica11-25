package letturaFile;

public class Customer {
    private int index;
    private String cId,nome,cognome,company,citta,stato,phone1,phone2,email,dataSub,website;

    public Customer(int index, String cId, String nome, String cognome, String company, String citta,String stato, String phone1, String phone2, String email, String dataSub, String website) {
        this.index = index;
        this.cId = cId;
        this.nome = nome;
        this.cognome = cognome;
        this.company = company;
        this.citta = citta;
        this.stato=stato;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.dataSub = dataSub;
        this.website = website;
    }

    public int getIndex() { return index; }
    public void setIndex(int index) { this.index = index; }
    public String getcId() { return cId; }
    public void setcId(String cId) { this.cId = cId; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getCitta() { return citta; }
    public void setCitta(String citta) { this.citta = citta; }
    public String getPhone1() { return phone1; }
    public void setPhone1(String phone1) { this.phone1 = phone1; }
    public String getPhone2() { return phone2; }
    public void setPhone2(String phone2) { this.phone2 = phone2; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDataSub() { return dataSub; }
    public void setDataSub(String dataSub) { this.dataSub = dataSub; }
    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }

    @Override
    public String toString() {
        return "Customer{" + "index=" + index + ", stato='" + stato + '\'' + "}";
    }
}
