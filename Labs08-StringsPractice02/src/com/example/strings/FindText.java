package com.example.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "gettys.html";
    private Pattern pattern;
    private Matcher m;

    public static void main(String[] args) {
        FindText find = new FindText();
        find.run("h4");
        find.run("\\bto\\b");
        find.run("^\\s{4}");
        find.run("^<[p|d]");
        find.run("^</.*?>$");
        find.run();
    }

    public void run(String p) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;
            pattern = Pattern.compile(p);
            System.out.println("====== Search by pattern: " + p + " ======");
            while ((line = reader.readLine()) != null) {
                m = pattern.matcher(line);
                if (m.find()) {
                    System.out.println(" " + c + " " + line);
                }
                c++;
            }
            System.out.println("    ========= end of search =========");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pattern: ");
        String p = scanner.nextLine();

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;


            pattern = Pattern.compile(p);


            System.out.println("====== Search by pattern: " + p + " ======");
            while ((line = reader.readLine()) != null) {
                m = pattern.matcher(line);
                if (m.find()) {
                    System.out.println(" " + c + " " + line);
                }
                c++;
            }
            System.out.println("    ========= end of search =========");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
