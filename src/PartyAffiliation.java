public class PartyAffiliation {

    public static void main(String[] args) {
        String menuChoice = "";
        String menu = "Democrat - D Republican - R Independant - I Other- O";
        menuChoice = "o";
        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");

        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independant Man.");
        }
        else if (menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("Your Political party is Other.");
        }
        else System.out.println("Illegal Menu Choice");
    }
}
