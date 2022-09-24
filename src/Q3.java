public class Q3 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #3 || Question 3");

        // Q3 -> Write a java program to fill in a letter template which looks like
        // letter = "Dear </Name> , thanks alot"

        String name = "devil";
        System.out.println("Dear " + name + " Thanks Alot");

        String template = "Dear <name> , Thanks A lot !";
        System.out.println(template.replace("<name>", "Devil"));
    }
}
