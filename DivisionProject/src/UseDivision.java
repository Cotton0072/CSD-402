public class UseDivision {
    public static void main(String[] args) {

        // Two InternationalDivision objects
        InternationalDivision intl1 = new InternationalDivision(
                "Global Tech", 1001, "Japan", "Japanese");

        InternationalDivision intl2 = new InternationalDivision(
                "Euro Systems", 1002, "Germany", "German");

        // Two DomesticDivision objects
        DomesticDivision dom1 = new DomesticDivision(
                "West Coast Operations", 2001, "California");

        DomesticDivision dom2 = new DomesticDivision(
                "Central Logistics", 2002, "Texas");

        // Display all four
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
