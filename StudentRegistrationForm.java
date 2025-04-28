import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame {

    // Declare form components
    JTextField nameField, emailField;
    JRadioButton maleBtn, femaleBtn, otherBtn;
    JComboBox<String> courseBox;
    JCheckBox readingBox, travelingBox, gamingBox;
    JButton submitBtn, resetBtn;
    ButtonGroup genderGroup;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Layout
        setLayout(new GridLayout(7, 1));

        // Name Panel
        JPanel namePanel = new JPanel(new FlowLayout());
        namePanel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        namePanel.add(nameField);

        // Email Panel
        JPanel emailPanel = new JPanel(new FlowLayout());
        emailPanel.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        emailPanel.add(emailField);

        // Gender Panel
        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(new JLabel("Gender:"));
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        otherBtn = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderGroup.add(otherBtn);
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        genderPanel.add(otherBtn);

        // Course Panel
        JPanel coursePanel = new JPanel(new FlowLayout());
        coursePanel.add(new JLabel("Course:"));
        String[] courses = {"B.Tech", "B.Sc", "B.Com", "B.A", "MCA"};
        courseBox = new JComboBox<>(courses);
        coursePanel.add(courseBox);

        // Hobbies Panel
        JPanel hobbiesPanel = new JPanel(new FlowLayout());
        hobbiesPanel.add(new JLabel("Hobbies:"));
        readingBox = new JCheckBox("Reading");
        travelingBox = new JCheckBox("Traveling");
        gamingBox = new JCheckBox("Gaming");
        hobbiesPanel.add(readingBox);
        hobbiesPanel.add(travelingBox);
        hobbiesPanel.add(gamingBox);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        buttonPanel.add(submitBtn);
        buttonPanel.add(resetBtn);

        // Add panels to frame
        add(namePanel);
        add(emailPanel);
        add(genderPanel);
        add(coursePanel);
        add(hobbiesPanel);
        add(buttonPanel);

        // Submit Action
        submitBtn.addActionListener(e -> handleSubmit());

        // Reset Action
        resetBtn.addActionListener(e -> resetForm());

        setVisible(true);
    }

    private void handleSubmit() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();

        if (name.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name and Email are required.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String gender = "";
        if (maleBtn.isSelected()) gender = "Male";
        else if (femaleBtn.isSelected()) gender = "Female";
        else if (otherBtn.isSelected()) gender = "Other";

        String course = (String) courseBox.getSelectedItem();

        StringBuilder hobbies = new StringBuilder();
        if (readingBox.isSelected()) hobbies.append("Reading ");
        if (travelingBox.isSelected()) hobbies.append("Traveling ");
        if (gamingBox.isSelected()) hobbies.append("Gaming ");

        String message = String.format(
                "Name: %s\nEmail: %s\nGender: %s\nCourse: %s\nHobbies: %s",
                name, email, gender, course, hobbies.toString().trim()
        );

        JOptionPane.showMessageDialog(this, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    private void resetForm() {
        nameField.setText("");
        emailField.setText("");
        genderGroup.clearSelection();
        courseBox.setSelectedIndex(0);
        readingBox.setSelected(false);
        travelingBox.setSelected(false);
        gamingBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentRegistrationForm::new);
    }
}
