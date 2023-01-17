
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrationForm extends javax.swing.JFrame implements CRUD{

    Profiles prof = new Profiles();
    File file = new File("Data.txt");
    
    @Override
    public void create() {
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    int lineCount = 0;
    public void countLine(){
        lineCount = 0;
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"rw");
            while(raf.readLine() != null){
                lineCount++;
            }
            raf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void addData() {
        countLine();
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"rw");
            for(int i = 1; i<=lineCount; i++){
                raf.readLine();
            }
            raf.writeBytes(textFieldFirstName.getText()+","+textFieldMidName.getText()+","+textFieldLastName.getText()+","+cboxMonth.getSelectedItem().toString()+","+cboxDay.getSelectedItem().toString()+","+cboxYear.getSelectedItem().toString()+","+cBoxCivStat.getSelectedItem().toString()+","+cBoxEduc.getSelectedItem().toString()+","+textFieldNat.getText()+","+textFieldPob.getText()+","+textFieldEmailAdd.getText()+","+textFieldNumber.getText()+","+textFieldMotherLN.getText()+","+textFieldMotherFN.getText()+","+textFieldMotherMN.getText()+","+textFieldFatherLN.getText()+","+textFieldFatherFN.getText()+","+textFieldFatherMN.getText()+","+textFieldHouseNo.getText()+","+textFieldStreet.getText()+","+textFieldProvince.getText()+","+textFieldCity.getText()+","+textFieldBrgy.getText()+","+textFieldZipCode.getText());
            raf.writeBytes(System.lineSeparator());
            raf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
    @Override
    public void delete() {
        
    }

    @Override
    public void update() {
        
    }
        UserData ud = new UserData();
    @Override
    public void read() {
        
        }
    
    public RegistrationForm() {
        initComponents();
        
        
        addPlaceholderStyle(textFieldFirstName);
        addPlaceholderStyle(textFieldMidName);
        addPlaceholderStyle(textFieldLastName);
        addPlaceholderStyle(textFieldNat);
        addPlaceholderStyle(textFieldPob);
        addPlaceholderStyle(textFieldEmailAdd);
        addPlaceholderStyle(textFieldNumber);
        addPlaceholderStyle(AccUsername);
        addPlaceholderStyle(AccPass);
        addPlaceholderStyle(AccConPass);
        addPlaceholderStyle(textFieldMotherLN);
        addPlaceholderStyle(textFieldMotherFN);
        addPlaceholderStyle(textFieldMotherMN);
        addPlaceholderStyle(textFieldFatherLN);
        addPlaceholderStyle(textFieldFatherFN);
        addPlaceholderStyle(textFieldFatherMN);
        addPlaceholderStyle(textFieldHouseNo);
        addPlaceholderStyle(textFieldStreet);
        addPlaceholderStyle(textFieldProvince);
        addPlaceholderStyle(textFieldCity);
        addPlaceholderStyle(textFieldBrgy);
        addPlaceholderStyle(textFieldZipCode);
        addPlaceholderStyle(textFieldConfEmailAdd);
    }
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    public void logIn(){
        try {
            FileWriter fw = new FileWriter("Acc.txt", true);
            fw.write(AccUsername.getText()+"\t"+AccPass.getText()+"\n");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldMidName = new javax.swing.JTextField();
        buttonBack = new java.awt.Button();
        textFieldLastName = new javax.swing.JTextField();
        buttonNext = new java.awt.Button();
        jLabelContactInfo = new javax.swing.JLabel();
        cboxMonth = new javax.swing.JComboBox<>();
        textFieldNumber = new javax.swing.JTextField();
        cboxDay = new javax.swing.JComboBox<>();
        textFieldConfEmailAdd = new javax.swing.JTextField();
        cboxYear = new javax.swing.JComboBox<>();
        textFieldMotherFN = new javax.swing.JTextField();
        textFieldMotherMN = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelMotherName = new javax.swing.JLabel();
        textFieldEmailAdd = new javax.swing.JTextField();
        textFieldMotherLN = new javax.swing.JTextField();
        textFieldFirstName = new javax.swing.JTextField();
        jLabelGenInfo = new javax.swing.JLabel();
        textFieldNat = new javax.swing.JTextField();
        cBoxCivStat = new javax.swing.JComboBox<>();
        textFieldPob = new javax.swing.JTextField();
        jLabelFatherName = new javax.swing.JLabel();
        textFieldFatherLN = new javax.swing.JTextField();
        textFieldFatherFN = new javax.swing.JTextField();
        textFieldFatherMN = new javax.swing.JTextField();
        jLabelContactInfo1 = new javax.swing.JLabel();
        textFieldHouseNo = new javax.swing.JTextField();
        textFieldStreet = new javax.swing.JTextField();
        textFieldProvince = new javax.swing.JTextField();
        textFieldCity = new javax.swing.JTextField();
        textFieldBrgy = new javax.swing.JTextField();
        textFieldZipCode = new javax.swing.JTextField();
        cBoxEduc = new javax.swing.JComboBox<>();
        jLabelName1 = new javax.swing.JLabel();
        AccUsername = new javax.swing.JTextField();
        AccPass = new javax.swing.JPasswordField();
        AccConPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setFocusable(false);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        textFieldMidName.setText("Middle Name");
        textFieldMidName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMidNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMidNameFocusLost(evt);
            }
        });

        buttonBack.setLabel("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        textFieldLastName.setText("Last Name");
        textFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldLastNameFocusLost(evt);
            }
        });
        textFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLastNameActionPerformed(evt);
            }
        });

        buttonNext.setLabel("Sign Up");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        jLabelContactInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelContactInfo.setText("CONTACT INFORMATION");

        cboxMonth.setMaximumRowCount(12);
        cboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cboxMonth.setToolTipText("");
        cboxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMonthActionPerformed(evt);
            }
        });

        textFieldNumber.setText("Mobile Number");
        textFieldNumber.setActionCommand("<Not Set>");
        textFieldNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNumberFocusLost(evt);
            }
        });
        textFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumberActionPerformed(evt);
            }
        });

        cboxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cboxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDayActionPerformed(evt);
            }
        });

        textFieldConfEmailAdd.setText("Confirm Email Address");
        textFieldConfEmailAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldConfEmailAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldConfEmailAddFocusLost(evt);
            }
        });
        textFieldConfEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConfEmailAddActionPerformed(evt);
            }
        });

        cboxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        textFieldMotherFN.setText("First Name");
        textFieldMotherFN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMotherFNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMotherFNFocusLost(evt);
            }
        });
        textFieldMotherFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMotherFNActionPerformed(evt);
            }
        });

        textFieldMotherMN.setText("Middle Name");
        textFieldMotherMN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMotherMNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMotherMNFocusLost(evt);
            }
        });
        textFieldMotherMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMotherMNActionPerformed(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName.setText("NAME");

        jLabelMotherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMotherName.setText("MOTHER'S MAIDEN NAME");

        textFieldEmailAdd.setText("Email Address");
        textFieldEmailAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmailAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmailAddFocusLost(evt);
            }
        });
        textFieldEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailAddActionPerformed(evt);
            }
        });

        textFieldMotherLN.setText("Last Name");
        textFieldMotherLN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldMotherLNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldMotherLNFocusLost(evt);
            }
        });
        textFieldMotherLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMotherLNActionPerformed(evt);
            }
        });

        textFieldFirstName.setText("First Name");
        textFieldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFirstNameFocusLost(evt);
            }
        });
        textFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFirstNameActionPerformed(evt);
            }
        });

        jLabelGenInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGenInfo.setText("GENERAL INFORMATION");

        textFieldNat.setText("Nationality");
        textFieldNat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNatFocusLost(evt);
            }
        });
        textFieldNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNatActionPerformed(evt);
            }
        });

        cBoxCivStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widow/er", "Separated" }));
        cBoxCivStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCivStatActionPerformed(evt);
            }
        });

        textFieldPob.setText("Place of Birth");
        textFieldPob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPobFocusLost(evt);
            }
        });

        jLabelFatherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFatherName.setText("FATHER'S NAME");

        textFieldFatherLN.setText("Last Name");
        textFieldFatherLN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFatherLNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFatherLNFocusLost(evt);
            }
        });
        textFieldFatherLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFatherLNActionPerformed(evt);
            }
        });

        textFieldFatherFN.setText("First Name");
        textFieldFatherFN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFatherFNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFatherFNFocusLost(evt);
            }
        });
        textFieldFatherFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFatherFNActionPerformed(evt);
            }
        });

        textFieldFatherMN.setText("Middle Name");
        textFieldFatherMN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFatherMNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFatherMNFocusLost(evt);
            }
        });
        textFieldFatherMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFatherMNActionPerformed(evt);
            }
        });

        jLabelContactInfo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelContactInfo1.setText("MAIN ADDRESS");

        textFieldHouseNo.setText("House no.");
        textFieldHouseNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldHouseNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldHouseNoFocusLost(evt);
            }
        });
        textFieldHouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHouseNoActionPerformed(evt);
            }
        });

        textFieldStreet.setText("Street/Village");
        textFieldStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldStreetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldStreetFocusLost(evt);
            }
        });
        textFieldStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldStreetActionPerformed(evt);
            }
        });

        textFieldProvince.setText("Province");
        textFieldProvince.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldProvinceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldProvinceFocusLost(evt);
            }
        });
        textFieldProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldProvinceActionPerformed(evt);
            }
        });

        textFieldCity.setText("City/Municipality");
        textFieldCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCityFocusLost(evt);
            }
        });
        textFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCityActionPerformed(evt);
            }
        });

        textFieldBrgy.setText("Barangay");
        textFieldBrgy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldBrgyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldBrgyFocusLost(evt);
            }
        });
        textFieldBrgy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBrgyActionPerformed(evt);
            }
        });

        textFieldZipCode.setText("Zip Code");
        textFieldZipCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldZipCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldZipCodeFocusLost(evt);
            }
        });
        textFieldZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldZipCodeActionPerformed(evt);
            }
        });

        cBoxEduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educational Attainment", "Informal Schooling", "Elementary", "High School", "Vocational", "College", "Post Graduate" }));
        cBoxEduc.setName(""); // NOI18N
        cBoxEduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxEducActionPerformed(evt);
            }
        });

        jLabelName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName1.setText("ACCOUNT");

        AccUsername.setText("Username");
        AccUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccUsernameFocusLost(evt);
            }
        });
        AccUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccUsernameActionPerformed(evt);
            }
        });

        AccPass.setText("Password");
        AccPass.setEchoChar('\u0000');
        AccPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccPassFocusLost(evt);
            }
        });

        AccConPass.setText("Confirm Password");
        AccConPass.setEchoChar('\u0000');
        AccConPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccConPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccConPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldBrgy, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelContactInfo1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldFatherLN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldFatherFN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldFatherMN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelFatherName)
                            .addComponent(jLabelGenInfo)
                            .addComponent(jLabelMotherName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldMotherLN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldMotherFN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(textFieldMotherMN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelContactInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldNat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(textFieldPob, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldConfEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cBoxCivStat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxEduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelName)
                            .addComponent(jLabelName1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(AccPass, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AccConPass))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AccUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textFieldMidName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(12, 12, 12)
                                .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldMidName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AccUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelGenInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cBoxCivStat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cBoxEduc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelContactInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldConfEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelMotherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMotherFN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMotherMN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMotherLN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFatherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFatherLN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFatherFN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFatherMN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelContactInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldBrgy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFirstNameActionPerformed

    private void textFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLastNameActionPerformed

    private void cboxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMonthActionPerformed

    private void textFieldMotherFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMotherFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMotherFNActionPerformed

    private void textFieldMotherMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMotherMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMotherMNActionPerformed

    private void textFieldMotherLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMotherLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMotherLNActionPerformed

    private void textFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumberActionPerformed

    private void textFieldConfEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConfEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConfEmailAddActionPerformed

    private void textFieldEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailAddActionPerformed

    private void textFieldMidNameActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }  
    
    private void textFieldFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFirstNameFocusGained
            if(textFieldFirstName.getText().equals("First Name")){
                textFieldFirstName.setText("");
                textFieldFirstName.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_textFieldFirstNameFocusGained
    }
    
    private void textFieldFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFirstNameFocusLost
              if(textFieldFirstName.getText().equals("")){
                  textFieldFirstName.setText("First Name");
                  textFieldFirstName.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldFirstNameFocusLost

    private void textFieldMidNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMidNameFocusGained
           if(textFieldMidName.getText().equals("Middle Name")){
                textFieldMidName.setText("");
                textFieldMidName.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldMidNameFocusGained

    private void textFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldLastNameFocusGained
            if(textFieldLastName.getText().equals("Last Name")){
                textFieldLastName.setText("");
                textFieldLastName.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldLastNameFocusGained

    private void textFieldMidNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMidNameFocusLost
            if(textFieldMidName.getText().equals("")){
                  textFieldMidName.setText("Middle Name");
                  textFieldMidName.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldMidNameFocusLost

    private void textFieldLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldLastNameFocusLost
            if(textFieldLastName.getText().equals("")){
                  textFieldLastName.setText("Last Name");
                  textFieldLastName.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldLastNameFocusLost

    private void textFieldMotherLNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherLNFocusGained
        if(textFieldMotherLN.getText().equals("Last Name")){
                textFieldMotherLN.setText("");
                textFieldMotherLN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldMotherLNFocusGained

    private void textFieldMotherFNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherFNFocusGained
        if(textFieldMotherFN.getText().equals("First Name")){
                textFieldMotherFN.setText("");
                textFieldMotherFN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldMotherFNFocusGained

    private void textFieldMotherMNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherMNFocusGained
        if(textFieldMotherMN.getText().equals("Middle Name")){
                textFieldMotherMN.setText("");
                textFieldMotherMN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldMotherMNFocusGained

    private void textFieldMotherLNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherLNFocusLost
        if(textFieldMotherLN.getText().equals("")){
                  textFieldMotherLN.setText("Last Name");
                  textFieldMotherLN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldMotherLNFocusLost

    private void textFieldMotherFNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherFNFocusLost
        if(textFieldMotherFN.getText().equals("")){
                  textFieldMotherFN.setText("First Name");
                  textFieldMotherFN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldMotherFNFocusLost

    private void textFieldMotherMNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldMotherMNFocusLost
        if(textFieldMotherMN.getText().equals("")){
                  textFieldMotherMN.setText("Middle Name");
                  textFieldMotherMN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldMotherMNFocusLost

    private void textFieldEmailAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailAddFocusGained
        if(textFieldEmailAdd.getText().equals("Email Address")){
                textFieldEmailAdd.setText("");
                textFieldEmailAdd.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldEmailAddFocusGained

    private void textFieldConfEmailAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldConfEmailAddFocusGained
        if(textFieldConfEmailAdd.getText().equals("Confirm Email Address")){
                textFieldConfEmailAdd.setText("");
                textFieldConfEmailAdd.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldConfEmailAddFocusGained

    private void textFieldEmailAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailAddFocusLost
        if(textFieldEmailAdd.getText().equals("")){
                  textFieldEmailAdd.setText("Email Address");
                  textFieldEmailAdd.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldEmailAddFocusLost

    private void textFieldConfEmailAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldConfEmailAddFocusLost
        if(textFieldConfEmailAdd.getText().equals("")){
                  textFieldConfEmailAdd.setText("Confirm Email Address");
                  textFieldConfEmailAdd.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldConfEmailAddFocusLost

    private void textFieldNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNumberFocusGained
         if(textFieldNumber.getText().equals("Mobile Number")){
                textFieldNumber.setText("");
                textFieldNumber.setForeground(new Color(153,153,153));
    }   
    }//GEN-LAST:event_textFieldNumberFocusGained

    private void textFieldNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNumberFocusLost
        if(textFieldNumber.getText().equals("")){
                  textFieldNumber.setText("Mobile Number");
                  textFieldNumber.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldNumberFocusLost

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_buttonBackActionPerformed

    private void textFieldNatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNatFocusGained
        if(textFieldNat.getText().equals("Nationality")){
                textFieldNat.setText("");
                textFieldNat.setForeground(new Color(153,153,153));
    }                                              
    }//GEN-LAST:event_textFieldNatFocusGained

    private void textFieldNatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNatFocusLost
        if(textFieldNat.getText().equals("")){
                  textFieldNat.setText("Nationality");
                  textFieldNat.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldNatFocusLost

    private void textFieldNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNatActionPerformed

    private void cboxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDayActionPerformed

    private void cBoxCivStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCivStatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxCivStatActionPerformed

    private void textFieldPobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPobFocusGained
        if(textFieldPob.getText().equals("Place of Birth")){
                textFieldPob.setText("");
                textFieldPob.setForeground(new Color(153,153,153));
    }                                              
    }//GEN-LAST:event_textFieldPobFocusGained

    private void textFieldPobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPobFocusLost
        if(textFieldPob.getText().equals("")){
                  textFieldPob.setText("Place of Birth");
                  textFieldPob.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldPobFocusLost

    private void cBoxEducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxEducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxEducActionPerformed

    private void textFieldFatherLNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherLNFocusGained
        if(textFieldFatherLN.getText().equals("Last Name")){
                textFieldFatherLN.setText("");
                textFieldFatherLN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldFatherLNFocusGained

    private void textFieldFatherLNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherLNFocusLost
        if(textFieldFatherLN.getText().equals("")){
                  textFieldFatherLN.setText("Last Name");
                  textFieldFatherLN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldFatherLNFocusLost

    private void textFieldFatherLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFatherLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFatherLNActionPerformed

    private void textFieldFatherFNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherFNFocusGained
        if(textFieldFatherFN.getText().equals("First Name")){
                textFieldFatherFN.setText("");
                textFieldFatherFN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldFatherFNFocusGained

    private void textFieldFatherFNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherFNFocusLost
        if(textFieldFatherFN.getText().equals("")){
                  textFieldFatherFN.setText("First Name");
                  textFieldFatherFN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldFatherFNFocusLost

    private void textFieldFatherFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFatherFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFatherFNActionPerformed

    private void textFieldFatherMNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherMNFocusGained
        if(textFieldFatherMN.getText().equals("Middle Name")){
                textFieldFatherMN.setText("");
                textFieldFatherMN.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldFatherMNFocusGained

    private void textFieldFatherMNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFatherMNFocusLost
        if(textFieldFatherMN.getText().equals("")){
                  textFieldFatherMN.setText("Middle Name");
                  textFieldFatherMN.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldFatherMNFocusLost

    private void textFieldFatherMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFatherMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFatherMNActionPerformed

    private void textFieldHouseNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldHouseNoFocusGained
        if(textFieldHouseNo.getText().equals("House no.")){
                textFieldHouseNo.setText("");
                textFieldHouseNo.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldHouseNoFocusGained

    private void textFieldHouseNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldHouseNoFocusLost
        if(textFieldHouseNo.getText().equals("")){
                  textFieldHouseNo.setText("House no.");
                  textFieldHouseNo.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldHouseNoFocusLost

    private void textFieldHouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHouseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHouseNoActionPerformed

    private void textFieldStreetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldStreetFocusGained
        if(textFieldStreet.getText().equals("Street/Village")){
                textFieldStreet.setText("");
                textFieldStreet.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldStreetFocusGained

    private void textFieldStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldStreetFocusLost
        if(textFieldStreet.getText().equals("")){
                  textFieldStreet.setText("Street/Village");
                  textFieldStreet.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldStreetFocusLost

    private void textFieldStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldStreetActionPerformed

    private void textFieldProvinceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldProvinceFocusGained
        if(textFieldProvince.getText().equals("Province")){
                textFieldProvince.setText("");
                textFieldProvince.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldProvinceFocusGained

    private void textFieldProvinceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldProvinceFocusLost
        if(textFieldProvince.getText().equals("")){
                  textFieldProvince.setText("Province");
                  textFieldProvince.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldProvinceFocusLost

    private void textFieldProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldProvinceActionPerformed

    private void textFieldCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCityFocusGained
        if(textFieldCity.getText().equals("City/Municipality")){
                textFieldCity.setText("");
                textFieldCity.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldCityFocusGained

    private void textFieldCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCityFocusLost
        if(textFieldCity.getText().equals("")){
                  textFieldCity.setText("City/Municipality");
                  textFieldCity.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldCityFocusLost

    private void textFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCityActionPerformed

    private void textFieldBrgyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldBrgyFocusGained
        if(textFieldBrgy.getText().equals("Barangay")){
                textFieldBrgy.setText("");
                textFieldBrgy.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldBrgyFocusGained

    private void textFieldBrgyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldBrgyFocusLost
        if(textFieldBrgy.getText().equals("")){
                  textFieldBrgy.setText("Barangay");
                  textFieldBrgy.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldBrgyFocusLost

    private void textFieldBrgyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBrgyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBrgyActionPerformed

    private void textFieldZipCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldZipCodeFocusGained
        if(textFieldZipCode.getText().equals("Zip Code")){
                textFieldZipCode.setText("");
                textFieldZipCode.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_textFieldZipCodeFocusGained

    private void textFieldZipCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldZipCodeFocusLost
        if(textFieldZipCode.getText().equals("")){
                  textFieldZipCode.setText("Zip Code");
                  textFieldZipCode.setForeground(new Color(153,153,153));
              }
    }//GEN-LAST:event_textFieldZipCodeFocusLost

    private void textFieldZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldZipCodeActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        if(!AccPass.getText().equals(AccConPass.getText())){
            JOptionPane.showMessageDialog(null,"Password is Mismatched. Please Retype Password","Mismatch",1);
        }
        if(!textFieldEmailAdd.getText().equals(textFieldConfEmailAdd.getText())){
            JOptionPane.showMessageDialog(null,"Email Address is Mismatched. Please Retype Email Address","Mismatch",1);
        }
        if(AccPass.getText().equals(AccConPass.getText()) && textFieldEmailAdd.getText().equals(textFieldConfEmailAdd.getText())){
            create();
            addData();
            logIn();
            this.dispose();
            JOptionPane.showMessageDialog(null,"Successfully Registered! Please Login","Success",1);
            new Login().setVisible(true);
           
        }
    }//GEN-LAST:event_buttonNextActionPerformed

    private void AccUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccUsernameFocusGained
        if(AccUsername.getText().equals("Username")){
                AccUsername.setText("");
                AccUsername.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_AccUsernameFocusGained

    private void AccUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccUsernameFocusLost
        if(AccUsername.getText().length()==0){
            addPlaceholderStyle(AccUsername);
            AccUsername.setText("Username");
            
        }
    }//GEN-LAST:event_AccUsernameFocusLost

    private void AccUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccUsernameActionPerformed

    private void AccPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccPassFocusGained
        if(AccPass.getText().equals("Password")){
            AccPass.setText(null);
            AccPass.requestFocus();
            AccPass.setEchoChar('*');
            removePlaceholderStyle(AccPass);
        }
    }//GEN-LAST:event_AccPassFocusGained

    private void AccPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccPassFocusLost
        if(AccPass.getText().length()==0){
            addPlaceholderStyle(AccPass);
            AccPass.setText("Password");
            AccPass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_AccPassFocusLost

    private void AccConPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccConPassFocusGained
        if(AccConPass.getText().equals("Confirm Password")){
            AccConPass.setText(null);
            AccConPass.requestFocus();
            AccConPass.setEchoChar('*');
            removePlaceholderStyle(AccConPass);
        }
    }//GEN-LAST:event_AccConPassFocusGained

    private void AccConPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccConPassFocusLost
        if(AccConPass.getText().length()==0){
            addPlaceholderStyle(AccConPass);
            AccConPass.setText("Confirm Password");
            AccConPass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_AccConPassFocusLost
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AccConPass;
    private javax.swing.JPasswordField AccPass;
    private javax.swing.JTextField AccUsername;
    private java.awt.Button buttonBack;
    private java.awt.Button buttonNext;
    private javax.swing.JComboBox<String> cBoxCivStat;
    private javax.swing.JComboBox<String> cBoxEduc;
    private javax.swing.JComboBox<String> cboxDay;
    private javax.swing.JComboBox<String> cboxMonth;
    private javax.swing.JComboBox<String> cboxYear;
    private javax.swing.JLabel jLabelContactInfo;
    private javax.swing.JLabel jLabelContactInfo1;
    private javax.swing.JLabel jLabelFatherName;
    private javax.swing.JLabel jLabelGenInfo;
    private javax.swing.JLabel jLabelMotherName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldBrgy;
    private javax.swing.JTextField textFieldCity;
    private javax.swing.JTextField textFieldConfEmailAdd;
    private javax.swing.JTextField textFieldEmailAdd;
    private javax.swing.JTextField textFieldFatherFN;
    private javax.swing.JTextField textFieldFatherLN;
    private javax.swing.JTextField textFieldFatherMN;
    private javax.swing.JTextField textFieldFirstName;
    private javax.swing.JTextField textFieldHouseNo;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldMidName;
    private javax.swing.JTextField textFieldMotherFN;
    private javax.swing.JTextField textFieldMotherLN;
    private javax.swing.JTextField textFieldMotherMN;
    private javax.swing.JTextField textFieldNat;
    private javax.swing.JTextField textFieldNumber;
    private javax.swing.JTextField textFieldPob;
    private javax.swing.JTextField textFieldProvince;
    private javax.swing.JTextField textFieldStreet;
    private javax.swing.JTextField textFieldZipCode;
    // End of variables declaration//GEN-END:variables
  
}