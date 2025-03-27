import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard {

    // Arrays to hold admin data (name and role)
    private String[] admins = new String[10];  // Array to store admin names
    private String[] adminRoles = new String[10];  // Array to store corresponding roles of admins
    
    // GUI components for the dashboard interface
    private JFrame frame;  // Main frame of the dashboard
    private JPanel panel;  // Panel to hold the navigation buttons
    private JButton addAdminButton, removeAdminButton, manageAdminsButton, addBookButton, removeBookButton, loanBookButton, buyBookButton;
    private JButton booksAvailableButton;  // Button to view available books

    public static void main(String[] args) {
        // Start the application by invoking the initialize method on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new Dashboard().initialize());  // Launch the dashboard window
    }

    public void initialize() {
        // Create the main frame for the dashboard
        frame = new JFrame("Library Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit application when window is closed
        frame.setSize(1000, 600);  // Set the size of the frame
        frame.setLayout(new BorderLayout());  // Use BorderLayout for organizing layout

        // Create the navigation panel with a grid layout for buttons
        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1, 10, 10));  // 8 buttons arranged vertically with 10px space
        panel.setBackground(new Color(128, 0, 128));  // Set background color to purple
        panel.setPreferredSize(new Dimension(200, 600));  // Set the preferred size of the panel

        // Initialize buttons for various actions related to the library management
        addAdminButton = new JButton("Add Admin");
        removeAdminButton = new JButton("Remove Admin");
        manageAdminsButton = new JButton("Manage Admins");
        addBookButton = new JButton("Add Book");
        removeBookButton = new JButton("Remove Book");
        loanBookButton = new JButton("Loan Book");
        buyBookButton = new JButton("Buy a Book");
        booksAvailableButton = new JButton("Books Available");

        // Add buttons to the navigation panel
        panel.add(addAdminButton);
        panel.add(removeAdminButton);
        panel.add(manageAdminsButton);
        panel.add(addBookButton);
        panel.add(removeBookButton);
        panel.add(loanBookButton);
        panel.add(buyBookButton);
        panel.add(booksAvailableButton);

        // Create the content panel where other content will be displayed
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);  // Set content background color to white

        // Add the navigation panel to the left and the content panel to the center of the frame
        frame.add(panel, BorderLayout.WEST);  // Panel goes to the left side of the frame
        frame.add(contentPanel, BorderLayout.CENTER);  // Content goes to the center

        // Set up action listeners for each button to handle respective actions
        addAdminButton.addActionListener(this::handleAddAdmin);
        removeAdminButton.addActionListener(this::handleRemoveAdmin);
        manageAdminsButton.addActionListener(this::showManageAdminsDialog);
        addBookButton.addActionListener(this::handleAddBook);
        removeBookButton.addActionListener(this::handleRemoveBook);
        loanBookButton.addActionListener(this::handleLoanBook);
        buyBookButton.addActionListener(this::handleBuyBook);
        booksAvailableButton.addActionListener(this::showBooksAvailableDialog);

        // Make the frame visible so that the user can interact with it
        frame.setVisible(true);
    }

    // Method to show the list of admins in a dialog
    private void showManageAdminsDialog(ActionEvent e) {
        StringBuilder adminsList = new StringBuilder("Admin List:\n");
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] != null) {
                adminsList.append(admins[i]).append(" - ").append(adminRoles[i]).append("\n");
            }
        }
        // Show the list of admins in a message dialog
        JOptionPane.showMessageDialog(frame, adminsList.toString(), "Manage Admins", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to add a new admin to the system
    private void handleAddAdmin(ActionEvent e) {
        String adminName = JOptionPane.showInputDialog(frame, "Enter Admin Name:");
        if (adminName != null && !adminName.isEmpty()) {
            for (int i = 0; i < admins.length; i++) {
                if (admins[i] == null) {
                    admins[i] = adminName;  // Add admin name to the array
                    adminRoles[i] = "Admin";  // Assign the role "Admin" to the new admin
                    JOptionPane.showMessageDialog(frame, "Admin added successfully!", "Add Admin", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Admin list is full.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to remove an existing admin from the system
    private void handleRemoveAdmin(ActionEvent e) {
        String adminName = JOptionPane.showInputDialog(frame, "Enter Admin Name to Remove:");
        if (adminName != null && !adminName.isEmpty()) {
            for (int i = 0; i < admins.length; i++) {
                if (adminName.equals(admins[i])) {
                    admins[i] = null;  // Remove the admin by setting the position to null
                    adminRoles[i] = null;  // Remove the admin's role
                    JOptionPane.showMessageDialog(frame, "Admin removed successfully!", "Remove Admin", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Admin not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to add a book to the library collection
    private void handleAddBook(ActionEvent e) {
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        if (bookName != null && !bookName.isEmpty()) {
            // Check if the entered book name exists in the available books list
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    JOptionPane.showMessageDialog(frame, "Book added successfully!", "Add Book", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to remove a book from the library collection
    private void handleRemoveBook(ActionEvent e) {
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Remove:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        if (bookName != null && !bookName.isEmpty()) {
            // Check if the entered book name exists in the available books list
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    JOptionPane.showMessageDialog(frame, "Book removed successfully!", "Remove Book", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to loan a book to a user
    private void handleLoanBook(ActionEvent e) {
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Loan:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        if (bookName != null && !bookName.isEmpty()) {
            // Check if the book is available for loan
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    String loanDate = JOptionPane.showInputDialog(frame, "Enter Loan Date (MM/DD/YYYY):");
                    if (loanDate != null && !loanDate.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Book loaned successfully on " + loanDate, "Loan Book", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid loan date!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to purchase a book
    private void handleBuyBook(ActionEvent e) {
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Buy:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        if (bookName != null && !bookName.isEmpty()) {
            // Check if the book is available for purchase
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    String creditCard = JOptionPane.showInputDialog(frame, "Enter Credit Card Number (16 digits):");
                    String expiryDate = JOptionPane.showInputDialog(frame, "Enter Expiry Date (MM/YY):");
                    String cvv = JOptionPane.showInputDialog(frame, "Enter CVV (3 digits):");

                    if (cvv.length() != 3) {
                        JOptionPane.showMessageDialog(frame, "Invalid CVV! CVV must be 3 digits.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Purchase was successful!", "Buy Book", JOptionPane.INFORMATION_MESSAGE);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to show the list of available books in the library
    private void showBooksAvailableDialog(ActionEvent e) {
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        // Build a string of all available books
        StringBuilder booksList = new StringBuilder("Available Books:\n");
        for (String book : availableBooks) {
            booksList.append(book).append("\n");
        }

        // Show the list of available books in a message dialog
        JOptionPane.showMessageDialog(frame, booksList.toString(), "Books Available", JOptionPane.INFORMATION_MESSAGE);
    }
}
