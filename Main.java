package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //deklarasi variabel
        int pilihan;
        String usernameLogin;
        String passwordLogin;

        //build user dengan Builder design pattern
        User user1 = new User.UserBuilder("Haiqel", "Hakeem", "Haiqelhakeem", "123456", 1000000)
                    .build();
        User user2 = new User.UserBuilder("Hubbal", "Habbaza", "habbazet", "123456", 1000000)
                    .email("hubbal@gmail.com")
                    .phoneNumber("08123456")
                    .build();
        
        //Scanner
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        //login page
        System.out.println("Welcome");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Pilihan anda: ");
        pilihan = inputInt.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                usernameLogin = inputStr.nextLine();
                System.out.print("Masukkan password: ");
                passwordLogin = inputStr.nextLine();
                if (usernameLogin.equalsIgnoreCase(user1.getUsername()) && passwordLogin.equals(user1.getPassword())) {
                    System.out.println("Login berhasil, selamat datang " + user1.getFirstName() + " " + user1.getLastName());
                } else if(usernameLogin.equalsIgnoreCase(user2.getUsername()) && passwordLogin.equals(user2.getPassword())){
                    System.out.println("Login berhasil, selamat datang " + user2.getFirstName() + " " + user2.getLastName());
                } else{
                    System.out.println("Login Gagal");
                }
                break;
        
            default:
                break;
        }
    }
}
