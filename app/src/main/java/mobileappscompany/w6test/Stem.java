package mobileappscompany.w6test;

/**
 * Created by fallaye on 1/12/18.
 */

public class Stem {

    int Id;

    String InvestmentName, Agency;

    public Stem() {
    }

    public Stem(int id, String investmentName, String agency) {
        Id = id;
        InvestmentName = investmentName;
        Agency = agency;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getInvestmentName() {
        return InvestmentName;
    }

    public void setInvestmentName(String investmentName) {
        InvestmentName = investmentName;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }

    @Override
    public String toString() {
        return "Stem{" +
                "Id='" + Id + '\'' +
                ", InvestmentName='" + InvestmentName + '\'' +
                ", Agency='" + Agency + '\'' +
                '}';
    }
}
