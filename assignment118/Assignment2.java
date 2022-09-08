package assignment118;

class CompanyDetails {

    // static keyword
    // program execution
    // only single memory creation
    // constant throughout class
    public static String companyName = "Neosoft Technologies";

    // no keyword
    // object execution
    // new memory creations
    // can be different values
    public int empCode;
    public String baseLocation;
    public String teamLeader;

    public CompanyDetails(String companyName, int empCode, String baseLocation, String teamLeader) {
        companyName = companyName;
        empCode = empCode;
        baseLocation = baseLocation;
        teamLeader = teamLeader;
    }

    void display() {
        System.out.println("Company Name: " + companyName + "Employee Code: " + empCode + " Location: " + baseLocation
                + "Team Leader: " + teamLeader);
    }
}



public class Assignment2 {

    public static void main(String[] args) {

        CompanyDetails cd1 = new CompanyDetails(CompanyDetails.companyName, 9898, "Dadar", "ABC DEF");
        CompanyDetails cd2 = new CompanyDetails(CompanyDetails.companyName, 9801, "Rabale", "ABC DEF");
        CompanyDetails cd3 = new CompanyDetails(CompanyDetails.companyName, 9800, "Prabhadevi", "ABC DEF");
        CompanyDetails cd4 = new CompanyDetails(CompanyDetails.companyName, 9847, "Dadar", "ABC DEF");
        CompanyDetails cd5 = new CompanyDetails(CompanyDetails.companyName, 9889, "Dadar", "ABC DEF");

        cd1.display();
        cd2.display();
        cd3.display();
        cd4.display();
        cd5.display();


    }
}