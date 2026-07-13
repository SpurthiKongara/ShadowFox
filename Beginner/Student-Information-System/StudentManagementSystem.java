
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class StudentManagementSystem extends JFrame {

    // Form Components
    private JTextField txtStudentId;
    private JTextField txtName;
    private JComboBox<String> cmbDepartment;
    private JTextField txtMarks;
    private JTextField txtGpa;
    private JTextField txtStatus;

    // Table
    private JTable studentTable;
    private DefaultTableModel tableModel;

    // Buttons
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnSearch;
    private JButton btnClear;
    private JButton btnExit;

    private JLabel lblTotalStudents;
    private JButton btnExportPDF;

    public StudentManagementSystem() {

        // Window Settings
        setTitle("Student Information System");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout(10, 10));

        // ================= TITLE PANEL =================
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(25, 118, 210));
        titlePanel.setPreferredSize(new Dimension(1000, 70));

        JLabel title = new JLabel("STUDENT INFORMATION SYSTEM");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        titlePanel.add(title);

        add(titlePanel, BorderLayout.NORTH);

        // ================= FORM PANEL =================
        JPanel formPanel = new JPanel(new GridBagLayout());

        formPanel.setPreferredSize(new Dimension(320, 0));

        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Student Details"));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Student ID
        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(new JLabel("Student ID"), gbc);

        gbc.gridx = 1;

        txtStudentId = new JTextField(15);

        formPanel.add(txtStudentId, gbc);

        // Name
        gbc.gridx = 0;
        gbc.gridy++;

        formPanel.add(new JLabel("Student Name"), gbc);

        gbc.gridx = 1;

        txtName = new JTextField(15);

        formPanel.add(txtName, gbc);

        // Department
        gbc.gridx = 0;
        gbc.gridy++;

        formPanel.add(new JLabel("Department"), gbc);

        gbc.gridx = 1;

        cmbDepartment = new JComboBox<>(new String[]{
            "AI & DS",
            "CSE",
            "ECE",
            "EEE",
            "IT",
            "MECH",
            "CIVIL"
        });

        formPanel.add(cmbDepartment, gbc);

        // Marks
        gbc.gridx = 0;
        gbc.gridy++;

        formPanel.add(new JLabel("Marks"), gbc);

        gbc.gridx = 1;

        txtMarks = new JTextField(15);

        formPanel.add(txtMarks, gbc);

        // GPA
        gbc.gridx = 0;
        gbc.gridy++;

        formPanel.add(new JLabel("GPA"), gbc);

        gbc.gridx = 1;

        txtGpa = new JTextField(15);
        txtGpa.setEditable(false);

        formPanel.add(txtGpa, gbc);

        // Status
        gbc.gridx = 0;
        gbc.gridy++;

        formPanel.add(new JLabel("Status"), gbc);

        gbc.gridx = 1;

        txtStatus = new JTextField(15);
        txtStatus.setEditable(false);

        formPanel.add(txtStatus, gbc);

        // ================= BUTTON PANEL =================
        JPanel buttonPanel = new JPanel(new GridLayout(3,3,10,10));

        buttonPanel.setBorder(BorderFactory.createEmptyBorder(15, 5, 5, 5));

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnSearch = new JButton("Search");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        

        btnAdd.setBackground(new Color(76, 175, 80));
        btnAdd.setForeground(Color.WHITE);

        btnUpdate.setBackground(new Color(33, 150, 243));
        btnUpdate.setForeground(Color.WHITE);

        btnDelete.setBackground(new Color(244, 67, 54));
        btnDelete.setForeground(Color.WHITE);

        btnSearch.setBackground(new Color(255, 152, 0));
        btnSearch.setForeground(Color.WHITE);

        btnClear.setBackground(Color.GRAY);
        btnClear.setForeground(Color.WHITE);

        btnExit.setBackground(Color.DARK_GRAY);
        btnExit.setForeground(Color.WHITE);

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnExit);
        

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;

        formPanel.add(buttonPanel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 2;

        lblTotalStudents = new JLabel("Total Students : 0");
        lblTotalStudents.setFont(new Font("Arial", Font.BOLD, 14));
        lblTotalStudents.setHorizontalAlignment(SwingConstants.CENTER);

        formPanel.add(lblTotalStudents, gbc);

        add(formPanel, BorderLayout.WEST);

        // ================= TABLE =================
        String columns[] = {
            "Student ID",
            "Name",
            "Department",
            "Marks",
            "GPA",
            "Status"
        };

        tableModel = new DefaultTableModel(columns, 0);

        studentTable = new JTable(tableModel);

        studentTable.setRowHeight(28);

        studentTable.setFont(new Font("Arial", Font.PLAIN, 14));

        studentTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        studentTable.getTableHeader().setBackground(new Color(25, 118, 210));

        studentTable.getTableHeader().setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(studentTable);

        add(scrollPane, BorderLayout.CENTER);

        add(buttonPanel, BorderLayout.SOUTH);

        

// ===== Event Listeners start in Part 2 =====
        // ================= ADD BUTTON =================
        btnAdd.addActionListener(e -> {

            String id = txtStudentId.getText().trim();
            String name = txtName.getText().trim();
            String department = cmbDepartment.getSelectedItem().toString();

            if (id.isEmpty() || name.isEmpty() || txtMarks.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please fill all fields.");
                return;
            }

            if (!id.matches("\\d+")) {
                JOptionPane.showMessageDialog(this,
                        "Student ID must contain only numbers.");
                return;
            }

            if (!txtMarks.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this,
                        "Marks must contain only numbers.");
                return;
            }

            int marks = Integer.parseInt(txtMarks.getText());

            if (marks < 0 || marks > 100) {
                JOptionPane.showMessageDialog(this,
                        "Marks should be between 0 and 100.");
                return;
            }

            double gpa = marks / 10.0;
            String status = (marks >= 35) ? "Pass" : "Fail";

            txtGpa.setText(String.valueOf(gpa));
            txtStatus.setText(status);

            tableModel.addRow(new Object[]{
                id,
                name,
                department,
                marks,
                gpa,
                status
            });

            lblTotalStudents.setText(
                "Total Students : " + tableModel.getRowCount());

            JOptionPane.showMessageDialog(this,
                    "Student Added Successfully.");

            txtStudentId.setText("");
            txtName.setText("");
            cmbDepartment.setSelectedIndex(0);
            txtMarks.setText("");
            txtGpa.setText("");
            txtStatus.setText("");

            txtStudentId.requestFocus();

        });

        // ================= CLEAR BUTTON =================
        btnClear.addActionListener(e -> {

            txtStudentId.setText("");
            txtName.setText("");
            cmbDepartment.setSelectedIndex(0);
            txtMarks.setText("");
            txtGpa.setText("");
            txtStatus.setText("");

            studentTable.clearSelection();

            txtStudentId.requestFocus();

        });

        // ================= DELETE BUTTON =================
        btnDelete.addActionListener(e -> {

            int selectedRow = studentTable.getSelectedRow();

            if (selectedRow == -1) {

                JOptionPane.showMessageDialog(this,
                        "Please select a student.");

                return;
            }

            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Delete selected student?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {

                tableModel.removeRow(selectedRow);
                lblTotalStudents.setText(
                    "Total Students : " + tableModel.getRowCount());

                JOptionPane.showMessageDialog(this,
                        "Student Deleted Successfully.");

                txtStudentId.setText("");
                txtName.setText("");
                cmbDepartment.setSelectedIndex(0);
                txtMarks.setText("");
                txtGpa.setText("");
                txtStatus.setText("");

            }

        });

        // ================= UPDATE BUTTON =================
        btnUpdate.addActionListener(e -> {

            int selectedRow = studentTable.getSelectedRow();

            if (selectedRow == -1) {

                JOptionPane.showMessageDialog(this,
                        "Please select a student to update.");

                return;

            }

            String id = txtStudentId.getText().trim();
            String name = txtName.getText().trim();
            String department = cmbDepartment.getSelectedItem().toString();

            if (!txtMarks.getText().matches("\\d+")) {

                JOptionPane.showMessageDialog(this,
                        "Invalid Marks.");

                return;

            }

            int marks = Integer.parseInt(txtMarks.getText());

            if (marks < 0 || marks > 100) {

                JOptionPane.showMessageDialog(this,
                        "Marks must be between 0 and 100.");

                return;

            }

            double gpa = marks / 10.0;
            String status = (marks >= 35) ? "Pass" : "Fail";

            txtGpa.setText(String.valueOf(gpa));
            txtStatus.setText(status);

            tableModel.setValueAt(id, selectedRow, 0);
            tableModel.setValueAt(name, selectedRow, 1);
            tableModel.setValueAt(department, selectedRow, 2);
            tableModel.setValueAt(marks, selectedRow, 3);
            tableModel.setValueAt(gpa, selectedRow, 4);
            tableModel.setValueAt(status, selectedRow, 5);

            JOptionPane.showMessageDialog(this,
                    "Student Updated Successfully.");

        });

// ===== Search, Table Selection, Exit Button and closing braces in Part 3 =====
        // ================= SEARCH BUTTON =================

        btnSearch.addActionListener(e -> {

            String searchId = txtStudentId.getText().trim();

            boolean found = false;

            for (int i = 0; i < tableModel.getRowCount(); i++) {

                if (tableModel.getValueAt(i, 0).toString().equals(searchId)) {

                    studentTable.setRowSelectionInterval(i, i);

                    txtName.setText(tableModel.getValueAt(i, 1).toString());
                    cmbDepartment.setSelectedItem(
                            tableModel.getValueAt(i, 2).toString());
                    txtMarks.setText(tableModel.getValueAt(i, 3).toString());
                    txtGpa.setText(tableModel.getValueAt(i, 4).toString());
                    txtStatus.setText(tableModel.getValueAt(i, 5).toString());

                    found = true;
                    break;
                }

            }

            if (!found) {

                JOptionPane.showMessageDialog(
                        this,
                        "Student not found."
                );

            }

        });

        // ================= TABLE ROW SELECTION =================

        studentTable.getSelectionModel().addListSelectionListener(e -> {

            if (e.getValueIsAdjusting()) {
                return;
            }

            int selectedRow = studentTable.getSelectedRow();

            if (selectedRow != -1) {

                txtStudentId.setText(
                        tableModel.getValueAt(selectedRow, 0).toString());

                txtName.setText(
                        tableModel.getValueAt(selectedRow, 1).toString());

                cmbDepartment.setSelectedItem(
                        tableModel.getValueAt(selectedRow, 2).toString());

                txtMarks.setText(
                        tableModel.getValueAt(selectedRow, 3).toString());

                txtGpa.setText(
                        tableModel.getValueAt(selectedRow, 4).toString());

                txtStatus.setText(
                        tableModel.getValueAt(selectedRow, 5).toString());

            }

        });

        // ================= EXIT BUTTON =================

        btnExit.addActionListener(e -> {

            int option = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to exit?",
                    "Exit",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                dispose();
            }

        });

        // ================= DISPLAY WINDOW =================

        setVisible(true);

    }

}
