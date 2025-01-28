import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to CS112!");
        Main.printaboutMe();

    }
    

    public static void printaboutMe() {
        System.out.println(
                "I like snowboarding, sleep, videogames, Light novels, anime, and working out");
        boolean NeedSleep = Main.MySleep(0);
        System.out.println("Did you get enought sleep "+ (NeedSleep ? "Yes" : "No")); 

    }

    public static boolean MySleep(int topic) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours of sleep do you get a night");
        int sleepHours = scanner.nextInt();
        if (sleepHours < 9) {
            return false;
    }
        else
        {
            return true;
        }
        }
    }
    
