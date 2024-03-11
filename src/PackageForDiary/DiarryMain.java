package PackageForDiary;

import javax.swing.*;
import java.util.Scanner;

public class DiarryMain {

    static Diarry diarry = new Diarry("username", "password");

    public static void main(String[] args) {
        startApp();
    }

    public static void startApp() {
        String mainMenu = input("""
                 Hello, Welcome to Greatness Beyond Stats Diary
                Select from the Options Below to Continue...
                -->>>>>>>>> 1   createEntry
                -->>>>>>>>> 2   updateEntry
                -->>>>>>>>> 3   lock
                -->>>>>>>>> 4   unlock
                -->>>>>>>>> 5   deleteEntry
                -->>>>>>>>> 6   findEntry
                -->>>>>>>>> 7   exitEntry
                """);
        switch (mainMenu) {
            case "1" -> createEntry();
            case "2" -> updateEntry(diarry);
            case "3" -> lock();
            case "4" -> unlock();
            case "5" -> deleteEntry();
            case "6" -> findEntry();
            case "7" -> exitEntry();
            default -> startApp();
        }
    }

    private static void createEntry() {
        String title = collectStringInput("Enter title");
        String body = collectStringInput("Enter body");


        Entry entry = diarry.createEntry(title, body);
        entry.setTitle(title);
        entry.setBody(body);
        displayOptions("Entry created successfully:\n" + entry);
        startApp();
    }

    private static void updateEntry(Diarry diarry) {
        int id = collectIntInput("Enter ID of the entry to update:");
        String title = collectStringInput("Enter new title:");
        String body = collectStringInput("Enter new body:");

        try {
            Entry existingEntry = diarry.findEntryById(id);
            if (existingEntry == null) {
                displayOptions("Entry not found with ID: " + id);
                return;
            }
            existingEntry.setTitle(title);
            existingEntry.setBody(body);

            displayOptions("Entry updated successfully:\n" + existingEntry);
        } catch (InvalidIdException exception) {
            displayOptions("Entry not found with ID: " + id);
        }
        startApp();
    }

    private static void exitEntry() {
        System.exit(0);
    }

    private static void deleteEntry() {
        int id = collectIntInput("Enter ID of the entry to delete:");

        try {
            diarry.deleteEntry(id);
            displayOptions("Entry deleted successfully.");
        } catch (InvalidIdException e) {
            displayOptions("Entry not found with ID: " + id);
        }
        startApp();
    }

    private static void findEntry() {
        int id = collectIntInput("Enter ID of the entry to find:");

        try {
            Entry entry = diarry.findEntryById(id);
            if (entry != null)
                displayOptions("Entry found:\n" + entry);
            else
                displayOptions("Entry not found with ID: " + id);
        } catch (InvalidIdException e) {
            displayOptions("Entry not found with ID: " + id);
        }
        startApp();
    }

    private static void unlock() {
        String password = collectStringInput("Enter your password:");
        if (diarry.unlockDiarry(password))
            displayOptions("Diarry unlocked" +
                    "" +
                    "" +
                    "" +
                    " successfully.");
        else
            displayOptions("Incorrect password.");
        startApp();
    }

    private static void lock() {
        diarry.lockDiarry();
        displayOptions("Diarry locked successfully.");
        startApp();
    }

    private static String input(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private static String collectStringInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static int collectIntInput(String prompt) {
        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }

    private static void displayOptions(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}
