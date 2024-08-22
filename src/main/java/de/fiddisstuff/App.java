package de.fiddisstuff;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String path_to_compare = "";
        String path_to_compare_with = "";
        if (args.length > 0) {
            if (args[0].equals("gui")) {
                new UI();
                return; // Exit the program
            } else {
                path_to_compare = args[0];
                path_to_compare_with = args[1];
                System.out.println("Comparing " + path_to_compare + " with " + path_to_compare_with);
            }
        }

    }
}
