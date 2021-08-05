package academy.learnprogramming;

public class VipUser {
    private String vip_name;
    private double vip_creditLimit;
    private String vip_email;

    // DEFAULT
    public VipUser(){
        this("Milo",99,"MiloTheVIP@fuckdapolice.fu");
    }

    // ONLY ONE DEFAULT
    public VipUser(String vip_name, String vip_email ){
        this(vip_name,123456,vip_email);
    }

    // MAIN
    public VipUser(String vipName, double vipCreditLimit, String vipEmail) {
        this.vip_name = vipName;
        this.vip_creditLimit = vipCreditLimit;
        this.vip_email = vipEmail;
    }

    public String getVip_name() {
        return vip_name;
    }

    public double getVip_creditLimit() {
        return vip_creditLimit;
    }

    public String getVip_email() {
        return vip_email;
    }
}
