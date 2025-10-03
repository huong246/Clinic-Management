package clinicmanagement.ui;

import clinicmanagement.dao.UserDAO;
import clinicmanagement.entities.Doctor;
import clinicmanagement.entities.Gender;
import clinicmanagement.entities.User;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import clinicmanagement.dao.DepartmentDAO; 
import clinicmanagement.dao.DoctorDAO; 
import clinicmanagement.entities.Department;  
import java.util.List;
import java.util.HashMap;  
import java.util.Map;

public class AddDoctor1 extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddDoctorDialog.class.getName());
    private Map<String, Integer> departmentMap; 
    private Doctor doctorToUpdate;
 
    public AddDoctor1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.doctorToUpdate = null;  
        addDoctor.setText("Add Doctor");
        btnAddDoctor1.setText("Add doctor");
        loadDepartmentsToComboBox();
    }
    public AddDoctor1(java.awt.Frame parent, boolean modal, Doctor doctorToUpdate) {
        super(parent, modal);
        initComponents();
        this.doctorToUpdate = doctorToUpdate;
        addDoctor.setText("Update Doctor");
        btnAddDoctor1.setText("Update");
        loadDepartmentsToComboBox();
        populateFields();
    }
    private void loadDepartmentsToComboBox() {
        departmentMap = new HashMap<>(); 
        DepartmentDAO departmentDAO = new DepartmentDAO();
        List<Department> departmentList = departmentDAO.getAllDepartment();
        jComboBox2.removeAllItems();
        for(Department dept: departmentList)
        {
            String departmentName = dept.getDepartmentName();
            int departmentId = dept.getDepartmentId();
            jComboBox2.addItem(departmentName);
            departmentMap.put(departmentName, departmentId); 
        }
    }
    private void populateFields() {
        if (doctorToUpdate != null) {
            txtFullName.setText(doctorToUpdate.getFullName());
            txtBirthday.setText(doctorToUpdate.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            txtEmail.setText(doctorToUpdate.getEmail());
            txtPhoneNumber.setText(doctorToUpdate.getPhoneNumber());
            txtSpecialization.setText(doctorToUpdate.getSpecialization());
            jComboBox1.setSelectedItem(doctorToUpdate.getGender() == Gender.MALE ? "Male" : "Female");
            for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                String departmentName = (String) jComboBox2.getItemAt(i);
                if (departmentMap.get(departmentName) == doctorToUpdate.getDepartmentId()) {
                    jComboBox2.setSelectedIndex(i);
                    break;
                }
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAddDoctor1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        Department = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        Specialization = new javax.swing.JLabel();
        Birthday = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        LabelPhoneNumber = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtFullName = new javax.swing.JTextField();
        LabelGender = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Doctor"));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nội khoa", "Sản phụ khoa", "Phụ khoa", "Ngoại Khoa", "Da liễu", "Chuẩn đoán hình ảnh", "Gây mê hồi sức", "Y học cổ truyền", "Y tế công cộng", "Răng hàm mặt" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAddDoctor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddDoctor1.setText("Add doctor");
        btnAddDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctor1ActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Department.setText("Department:");

        FullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FullName.setText("FullName:");

        Specialization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Specialization.setText("Specialization:");

        Birthday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Birthday.setText("Birthday:");

        txtSpecialization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setText("Email:");

        txtBirthday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelPhoneNumber.setText("PhoneNumber");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        txtFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LabelGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelGender.setText("Gender:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtBirthday)
                            .addComponent(txtEmail)
                            .addComponent(txtPhoneNumber)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecialization)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnAddDoctor1)
                        .addGap(76, 76, 76)
                        .addComponent(btnCancel)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullName)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGender)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Department)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Specialization)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDoctor1)
                    .addComponent(btnCancel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctor1ActionPerformed

        String fullName = txtFullName.getText().trim();
        String birthdayStr = txtBirthday.getText().trim();
        String email = txtEmail.getText().trim();
        String phoneNumber = txtPhoneNumber.getText().trim();
        String selectedDepartmentName = (String) jComboBox2.getSelectedItem();
        String specialization = txtSpecialization.getText().trim();
        String genderId = (String) jComboBox1.getSelectedItem();
        if(fullName.isEmpty() || birthdayStr.isEmpty() || email.isEmpty() || selectedDepartmentName.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Định dạng email không hợp lệ. Vui lòng kiểm tra lại.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String phoneRegex = "^0\\d{9}$";
        if (!phoneNumber.matches(phoneRegex)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ.\nPhải có 10 chữ số và bắt đầu bằng số 0.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int departmentId = departmentMap.get(selectedDepartmentName);
            Gender gender;
            if("Male".equalsIgnoreCase(genderId))
            {
                gender = Gender.MALE;
            }
            else {
                gender = Gender.FEMALE;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthday = LocalDate.parse(birthdayStr, formatter);
            DoctorDAO doctorDAO = new DoctorDAO();
            boolean success = false;
            if (doctorToUpdate == null)
            {
                Doctor newDoctor = new Doctor();
                newDoctor.setFullName(fullName);
                newDoctor.setDateOfBirth(birthday);
                newDoctor.setGender(gender);
                newDoctor.setEmail(email);
                newDoctor.setPhoneNumber(phoneNumber);
                newDoctor.setDepartmentId(departmentId);
                newDoctor.setSpecialization(specialization);
                success = doctorDAO.add(newDoctor);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Thêm bác sĩ thành công!");

                } else {
                    JOptionPane.showMessageDialog(this, "Thêm bác sĩ thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                doctorToUpdate.setFullName(fullName);
                doctorToUpdate.setDateOfBirth(birthday);
                doctorToUpdate.setGender(gender);
                doctorToUpdate.setEmail(email);
                doctorToUpdate.setPhoneNumber(phoneNumber);
                doctorToUpdate.setDepartmentId(departmentId);
                doctorToUpdate.setSpecialization(specialization);

                success = doctorDAO.updateDoctor(doctorToUpdate);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");

                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (success) {
                if (this.getOwner() instanceof DoctorManagementForm) {
                    ((DoctorManagementForm) this.getOwner()).loadDoctorsToTable();
                }
                this.dispose();
            }
        }
        catch (java.time.format.DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày sinh không hợp lệ (dd/MM/yyyy).", "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnAddDoctor1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Birthday;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelPhoneNumber;
    private javax.swing.JLabel Specialization;
    private javax.swing.JButton btnAddDoctor1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables

    private static class addDoctor {

        private static void setText(String add_Doctor) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


        public addDoctor() {
        }
    }
}
