package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // DEFAULT
	    VipUser defaultUser = new VipUser();
        System.out.println("Name: " + defaultUser.getVip_name() + " CL: " + defaultUser.getVip_creditLimit() + " Email: " + defaultUser.getVip_email());

        // ONE ONLY
        VipUser newMilo = new VipUser("New Milo", "justMilo@guinea.pig");
        System.out.println("Name: " + newMilo.getVip_name() + " CL: " + newMilo.getVip_creditLimit() + " Email: " + newMilo.getVip_email());

        // MAIN
        VipUser garry = new VipUser("Garry", 999, "garry@guinea.pig");
        System.out.println("Name: " + garry.getVip_name() + " CL: " + garry.getVip_creditLimit() + " Email: " + garry.getVip_email());

    }
}
