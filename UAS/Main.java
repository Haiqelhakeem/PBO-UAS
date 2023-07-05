package UAS;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        // deklarasi variabel
        String pilihanProgram;
        int pilihan;
        String usernameLogin;
        String passwordLogin;

        // build user dengan Builder design pattern
        User user1 = new Builder("haiqelhakeem", "123456")
                .firstName("Haiqel").lastName("Hakeem")
                .buildBank();
        User user2 = new Builder("Habbazet", "123456")
                .email("hubbal@gmail.com")
                .buildBank();

        UserDana userD1 = new Builder("Dana1","dana1").nama("Hubbal").balanceDana(2000000).buildDana();
        UserDana userD2 = new Builder("Ngwehehe", "uasmatkul").nama("Haiqel").balanceDana(3000000).buildDana();

        // Scanner
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        // Pilih Program DANA / BANK
        System.out.println(userD1.getUsername());

        System.out.print("Pilih Program (DANA / BANK): ");
        pilihanProgram = inputInt.next();

            if (pilihanProgram.equalsIgnoreCase("DANA")) {
                System.out.println();
                System.out.println("Welcome to DANA");
                // Login DANA
                System.out.println("Login DANA Untuk Masuk ke Menu");
                System.out.print("Username: ");
                usernameLogin = inputStr.nextLine();
                System.out.print("Password: ");
                passwordLogin = inputStr.nextLine();

                

                if (usernameLogin.equalsIgnoreCase(userD1.getUsername()) && passwordLogin.equals(userD1.getPassword())) {
                    System.out.println("Login Berhasil!!!");
                    System.out.println("Selamat Datang " + userD1.getNama());
                }

                System.out.println("1. Lihat Akun");
                System.out.println("2. Transfer");

                System.out.print("Pilihan Anda: ");
                pilihan = inputInt.nextInt();

                switch (pilihan) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("AKUN ANDA");
                        System.out.println("Nama: " + userD1.getNama());
                        System.out.println("Saldo: " + userD1.getBalanceData());
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println();
                        
                    }
                }

            } else if (pilihanProgram.equalsIgnoreCase("Bank")) {
                // Menu Bank
                System.out.println("Welcome to Bank");
                System.out.print("Masukkan username: ");
                usernameLogin = inputStr.nextLine();
                System.out.print("Masukkan password: ");
                passwordLogin = inputStr.nextLine();
                if (usernameLogin.equalsIgnoreCase(user1.getUsername())
                        && passwordLogin.equals(user1.getPassword())) {
                    System.out.println("Login berhasil, selamat datang " + user1.getFirstName() + " "
                            + user1.getLastName());
                } else if (usernameLogin.equalsIgnoreCase(user2.getUsername())
                        && passwordLogin.equals(user2.getPassword())) {
                    System.out.println("Login berhasil, selamat datang " + user2.getFirstName() + " "
                            + user2.getLastName());
                } else {
                    System.out.println("Login Gagal");
                }

                // Menu page
                        System.out.println("Welcome");
                        System.out.println("1. Login");
                        System.out.println("2. Register");
                        System.out.print("Pilihan anda: ");
                        pilihan = inputInt.nextInt();

                        switch (pilihan) {
                            case 1:

                                break;

                            default:
                                break;
                        }
            }
    }
}
