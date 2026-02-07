//2

import java.util.HashSet;
import java.util.Scanner;

public class CheckMembership {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();

        HashSet<String> users = new HashSet<String>();

        users.add("admin");
        users.add("rani");
        users.add("guest");


        if (users.contains(user)) {
            System.out.println("User exists. Hello " + user);
        }
        else  {
            System.out.println("User does not exists. Bye");
        }
    }
    }