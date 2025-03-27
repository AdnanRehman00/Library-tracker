import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard {
    // Define arrays to hold admin data
    private String[] admins = new String[10];
    private String[] adminRoles = new String[10];
    private JFrame frame;
    private JPanel panel;
    private JButton addAdminButton, removeAdminButton, manageAdminsButton, addBookButton, removeBookButton, loanBookButton, buyBookButton;
    private JButton booksAvailableButton;

    public static void main(String[] args) {
        // Start the application
        SwingUtilities.invokeLater(() -> new Dashboard().initialize());
    }

    public void initialize() {
        // Create the main frame
        frame = new JFrame("Library Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(new BorderLayout());

        // Create the navigation panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1, 10, 10)); // Grid for 8 buttons, evenly spaced
        panel.setBackground(new Color(128, 0, 128)); // Purple background
        panel.setPreferredSize(new Dimension(200, 600));

        // Add buttons to the navigation panel
        addAdminButton = new JButton("Add Admin");
        removeAdminButton = new JButton("Remove Admin");
        manageAdminsButton = new JButton("Manage Admins");
        addBookButton = new JButton("Add Book");
        removeBookButton = new JButton("Remove Book");
        loanBookButton = new JButton("Loan Book");
        buyBookButton = new JButton("Buy a Book");
        booksAvailableButton = new JButton("Books Available");

        // Add buttons to the panel
        panel.add(addAdminButton);
        panel.add(removeAdminButton);
        panel.add(manageAdminsButton);
        panel.add(addBookButton);
        panel.add(removeBookButton);
        panel.add(loanBookButton);
        panel.add(buyBookButton);
        panel.add(booksAvailableButton);

        // Create the main content area
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        frame.add(panel, BorderLayout.WEST);
        frame.add(contentPanel, BorderLayout.CENTER);

        // Set up action listeners
        addAdminButton.addActionListener(this::handleAddAdmin);
        removeAdminButton.addActionListener(this::handleRemoveAdmin);
        manageAdminsButton.addActionListener(this::showManageAdminsDialog);
        addBookButton.addActionListener(this::handleAddBook);
        removeBookButton.addActionListener(this::handleRemoveBook);
        loanBookButton.addActionListener(this::handleLoanBook);
        buyBookButton.addActionListener(this::handleBuyBook);
        booksAvailableButton.addActionListener(this::showBooksAvailableDialog);

        // Show the frame
        frame.setVisible(true);
    }

    private void showManageAdminsDialog(ActionEvent e) {
        // Create a dialog showing the current list of admins
        StringBuilder adminsList = new StringBuilder("Admin List:\n");
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] != null) {
                adminsList.append(admins[i]).append(" - ").append(adminRoles[i]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(frame, adminsList.toString(), "Manage Admins", JOptionPane.INFORMATION_MESSAGE);
    }

    private void handleAddAdmin(ActionEvent e) {
        // Show a dialog for adding an admin
        String adminName = JOptionPane.showInputDialog(frame, "Enter Admin Name:");
        if (adminName != null && !adminName.isEmpty()) {
            for (int i = 0; i < admins.length; i++) {
                if (admins[i] == null) {
                    admins[i] = adminName;
                    adminRoles[i] = "Admin"; // Default role
                    JOptionPane.showMessageDialog(frame, "Admin added successfully!", "Add Admin", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Admin list is full.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleRemoveAdmin(ActionEvent e) {
        // Show a dialog for removing an admin
        String adminName = JOptionPane.showInputDialog(frame, "Enter Admin Name to Remove:");
        if (adminName != null && !adminName.isEmpty()) {
            for (int i = 0; i < admins.length; i++) {
                if (adminName.equals(admins[i])) {
                    admins[i] = null;
                    adminRoles[i] = null;
                    JOptionPane.showMessageDialog(frame, "Admin removed successfully!", "Remove Admin", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Admin not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleAddBook(ActionEvent e) {
        // Show a dialog for adding a book
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };
        
        if (bookName != null && !bookName.isEmpty()) {
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    JOptionPane.showMessageDialog(frame, "Book added successfully!", "Add Book", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleRemoveBook(ActionEvent e) {
        // Show a dialog for removing a book
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Remove:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };
        
        if (bookName != null && !bookName.isEmpty()) {
            for (String availableBook : availableBooks) {
                if (bookName.equalsIgnoreCase(availableBook)) {
                    JOptionPane.showMessageDialog(frame, "Book removed successfully!", "Remove Book", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleLoanBook(ActionEvent e) {
        // Show a dialog for loaning a book
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Loan:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };
        
        if (bookName != null && !bookName.isEmpty()) {
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

    private void handleBuyBook(ActionEvent e) {
        // Show a dialog for buying a book
        String bookName = JOptionPane.showInputDialog(frame, "Enter Book Name to Buy:");
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };
        
        if (bookName != null && !bookName.isEmpty()) {
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

    private void showBooksAvailableDialog(ActionEvent e) {
        // Original list of available books
        String[] availableBooks = {
            "The Great Gatsby", "Moby Dick", "To Kill a Mockingbird", 
            "1984", "Pride and Prejudice", "The Catcher in the Rye", 
            "The Hobbit", "War and Peace", "Crime and Punishment", "Don Quixote"
        };

        // Create a dialog showing the list of available books
        StringBuilder booksList = new StringBuilder("Available Books:\n");
        for (String book : availableBooks) {
            booksList.append(book).append("\n");
        }

        // Show the list of available books in a message dialog
        JOptionPane.showMessageDialog(frame, booksList.toString(), "Books Available", JOptionPane.INFORMATION_MESSAGE);
    }
}
