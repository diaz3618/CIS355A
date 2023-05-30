/**
 *
 * @author Daniel F Diaz Santiago
 * Final Project CIS355A
 */
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class LandscapeGUI extends javax.swing.JFrame {
    DefaultListModel<Customer> customerList = new DefaultListModel( );
    // class level references
    private final double GRASS_PER_SQFT = 5.00;
    private final double GRAVEL_PER_SQFT = 2.00;

    /**
     * Creates new form Landscaping
     */
    public LandscapeGUI() {
        initComponents();
        
        // Center form
        this.setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_yard_type = new javax.swing.ButtonGroup();
        main_panel = new javax.swing.JTabbedPane();
        welcome_tab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        info_req_label = new javax.swing.JLabel();
        rdo_grass = new javax.swing.JRadioButton();
        rdo_gravel = new javax.swing.JRadioButton();
        grass_price_label = new javax.swing.JLabel();
        gravel_price_label = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        lbl_picture = new javax.swing.JLabel();
        info_tab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        info_req_label1 = new javax.swing.JLabel();
        name_box = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        address_box = new javax.swing.JTextField();
        yard_dimensions_label = new javax.swing.JLabel();
        width_label = new javax.swing.JLabel();
        width_box = new javax.swing.JTextField();
        length_label = new javax.swing.JLabel();
        length_box = new javax.swing.JTextField();
        calc_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        summary_box = new javax.swing.JTextArea();
        submit_button = new javax.swing.JButton();
        summary_label = new javax.swing.JLabel();
        customer_list_tab = new javax.swing.JPanel();
        list_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customer_list = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        customer_details = new javax.swing.JTextArea();
        details_lbl = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        load_btn = new javax.swing.JButton();
        mnb_main = new javax.swing.JMenuBar();
        mnu_file = new javax.swing.JMenu();
        mnu_exit = new javax.swing.JMenuItem();
        mnu_order = new javax.swing.JMenu();
        mnu_sumbit_order = new javax.swing.JMenuItem();
        mnu_reset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Diaz Santiago Landscaping");

        info_req_label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        info_req_label.setText("Would you like a grass or gravel yard?");

        btg_yard_type.add(rdo_grass);
        rdo_grass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_grass.setText("Grass");
        rdo_grass.setNextFocusableComponent(rdo_gravel);
        rdo_grass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_grassActionPerformed(evt);
            }
        });

        btg_yard_type.add(rdo_gravel);
        rdo_gravel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_gravel.setText("Gravel");
        rdo_gravel.setNextFocusableComponent(next_button);
        rdo_gravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_gravelActionPerformed(evt);
            }
        });

        grass_price_label.setText("5$ per sqft");

        gravel_price_label.setText("2$ per sqft");

        next_button.setText("Next");
        next_button.setNextFocusableComponent(reset_button);
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        reset_button.setText("Reset");
        reset_button.setNextFocusableComponent(rdo_grass);
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        lbl_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dirt.jpg"))); // NOI18N
        lbl_picture.setFocusable(false);

        javax.swing.GroupLayout welcome_tabLayout = new javax.swing.GroupLayout(welcome_tab);
        welcome_tab.setLayout(welcome_tabLayout);
        welcome_tabLayout.setHorizontalGroup(
            welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_tabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcome_tabLayout.createSequentialGroup()
                        .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(welcome_tabLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1))
                            .addGroup(welcome_tabLayout.createSequentialGroup()
                                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdo_grass)
                                    .addComponent(grass_price_label))
                                .addGap(18, 18, 18)
                                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdo_gravel)
                                    .addComponent(gravel_price_label))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcome_tabLayout.createSequentialGroup()
                        .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info_req_label)
                            .addGroup(welcome_tabLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        welcome_tabLayout.setVerticalGroup(
            welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_req_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_gravel)
                    .addComponent(rdo_grass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grass_price_label)
                    .addComponent(gravel_price_label))
                .addGap(18, 18, 18)
                .addGroup(welcome_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(welcome_tabLayout.createSequentialGroup()
                        .addComponent(next_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset_button))
                    .addComponent(lbl_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        main_panel.addTab("Welcome", welcome_tab);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Diaz Santiago Landscaping");

        info_req_label1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        info_req_label1.setText("Please enter your information");

        name_box.setNextFocusableComponent(address_box);

        name_label.setText("Name");

        address_label.setText("Address");

        address_box.setNextFocusableComponent(width_box);

        yard_dimensions_label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        yard_dimensions_label.setText("Enter the length and width of your yard:");

        width_label.setText("Width (ft):");

        width_box.setNextFocusableComponent(length_box);

        length_label.setText("Length (ft):");

        length_box.setNextFocusableComponent(calc_button);

        calc_button.setText("Calculate");
        calc_button.setNextFocusableComponent(submit_button);
        calc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_buttonActionPerformed(evt);
            }
        });

        summary_box.setEditable(false);
        summary_box.setColumns(20);
        summary_box.setLineWrap(true);
        summary_box.setRows(5);
        summary_box.setFocusable(false);
        summary_box.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(summary_box);

        submit_button.setText("Submit Order");
        submit_button.setNextFocusableComponent(name_box);
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        summary_label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        summary_label.setText("Order Summary:");

        javax.swing.GroupLayout info_tabLayout = new javax.swing.GroupLayout(info_tab);
        info_tab.setLayout(info_tabLayout);
        info_tabLayout.setHorizontalGroup(
            info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_tabLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(info_tabLayout.createSequentialGroup()
                .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_tabLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(calc_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(info_tabLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(info_tabLayout.createSequentialGroup()
                                .addComponent(width_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(width_box, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(length_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(length_box, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(info_req_label1)
                                .addComponent(yard_dimensions_label)
                                .addGroup(info_tabLayout.createSequentialGroup()
                                    .addComponent(address_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(address_box, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(info_tabLayout.createSequentialGroup()
                                    .addComponent(name_label)
                                    .addGap(22, 22, 22)
                                    .addComponent(name_box))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(summary_label))
                .addGap(23, 23, 23))
        );
        info_tabLayout.setVerticalGroup(
            info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_tabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_tabLayout.createSequentialGroup()
                        .addComponent(info_req_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_label)
                            .addComponent(name_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(yard_dimensions_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(width_label)
                            .addComponent(length_label)
                            .addComponent(width_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(length_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(info_tabLayout.createSequentialGroup()
                        .addComponent(summary_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(info_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(submit_button)
                    .addComponent(calc_button))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        main_panel.addTab("Information", info_tab);

        list_lbl.setText("Customer List");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Diaz Santiago Landscaping");

        customer_list.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        customer_list.setModel(customerList);
        customer_list.setNextFocusableComponent(load_btn);
        customer_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                customer_listValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(customer_list);

        customer_details.setEditable(false);
        customer_details.setColumns(20);
        customer_details.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        customer_details.setRows(5);
        customer_details.setFocusable(false);
        jScrollPane4.setViewportView(customer_details);

        details_lbl.setText("Customer Details");

        delete_btn.setText("Delete Customer");
        delete_btn.setNextFocusableComponent(customer_list);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        load_btn.setText("Load List");
        load_btn.setNextFocusableComponent(delete_btn);
        load_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customer_list_tabLayout = new javax.swing.GroupLayout(customer_list_tab);
        customer_list_tab.setLayout(customer_list_tabLayout);
        customer_list_tabLayout.setHorizontalGroup(
            customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_list_tabLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(customer_list_tabLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(list_lbl)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(delete_btn)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(details_lbl))
                .addGap(66, 66, 66))
        );
        customer_list_tabLayout.setVerticalGroup(
            customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_list_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_lbl)
                    .addComponent(details_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(customer_list_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load_btn)
                    .addComponent(delete_btn))
                .addGap(15, 15, 15))
        );

        main_panel.addTab("Customer List", customer_list_tab);

        mnu_file.setText("File");

        mnu_exit.setText("Exit");
        mnu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_exitActionPerformed(evt);
            }
        });
        mnu_file.add(mnu_exit);

        mnb_main.add(mnu_file);

        mnu_order.setText("Order");

        mnu_sumbit_order.setText("Submit Order");
        mnu_sumbit_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_sumbit_orderActionPerformed(evt);
            }
        });
        mnu_order.add(mnu_sumbit_order);

        mnu_reset.setText("Reset");
        mnu_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_resetActionPerformed(evt);
            }
        });
        mnu_order.add(mnu_reset);

        mnb_main.add(mnu_order);

        setJMenuBar(mnb_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnu_exitActionPerformed

    private void mnu_sumbit_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_sumbit_orderActionPerformed
        JOptionPane.showMessageDialog(this, "Method is not complete.");
    }//GEN-LAST:event_mnu_sumbit_orderActionPerformed

    private void mnu_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_resetActionPerformed
        
    }//GEN-LAST:event_mnu_resetActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // get the index for the selected item
        int index = customer_list.getSelectedIndex();

        // if something is selected, delete it and clear the details textarea
        if (index > -1)
        {
            customerList.remove(index);
            customer_details.setText("");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void load_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_btnActionPerformed
        JOptionPane.showMessageDialog(this, "Method is incomplete.");
    }//GEN-LAST:event_load_btnActionPerformed

    private void rdo_grassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_grassActionPerformed
        if (rdo_grass.isSelected()){
            // look in directory where class exists, and get location of "grass.jpg"
            URL location = this.getClass().getResource("grass.jpg");

            // create image using the location of "grass.jpg"
            ImageIcon icon = new ImageIcon(location);

            // set the image icon to the label
            lbl_picture.setIcon(icon);
        }
    }//GEN-LAST:event_rdo_grassActionPerformed

    private void rdo_gravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_gravelActionPerformed
        if (rdo_gravel.isSelected())
        {
            // find image, create image icon, and set image icon to label
            lbl_picture.setIcon(new ImageIcon(this.getClass().getResource("gravel.jpg")));
        }
    }//GEN-LAST:event_rdo_gravelActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // confirm that a selection was made then move to next tab
        if (rdo_grass.isSelected() == false && rdo_gravel.isSelected() == false)
        {
            JOptionPane.showMessageDialog(this, "Please select the type of yard.",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            main_panel.setSelectedIndex(1);
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        reset();
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void calc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_buttonActionPerformed
        // validate the inputs
        if (validateInputs() == false)
        {
            return;    // end the method if validation failed
        }
        
        // create the Customer object and show the information
        Customer cust = createCustomer();
        summary_box.setText( cust.getDetails() );

    }//GEN-LAST:event_calc_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        submitOrder();
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void customer_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_customer_listValueChanged
        // get selected item’s index number
        int index = customer_list.getSelectedIndex();

        // if something was selected, show the object’s details
        if (index > -1)
        {
            Customer cust = customerList.getElementAt(index);
            customer_details.setText(cust.getDetails());
        }
    }//GEN-LAST:event_customer_listValueChanged

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
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandscapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_box;
    private javax.swing.JLabel address_label;
    private javax.swing.ButtonGroup btg_yard_type;
    private javax.swing.JButton calc_button;
    private javax.swing.JTextArea customer_details;
    private javax.swing.JList<Customer> customer_list;
    private javax.swing.JPanel customer_list_tab;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel details_lbl;
    private javax.swing.JLabel grass_price_label;
    private javax.swing.JLabel gravel_price_label;
    private javax.swing.JLabel info_req_label;
    private javax.swing.JLabel info_req_label1;
    private javax.swing.JPanel info_tab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_picture;
    private javax.swing.JTextField length_box;
    private javax.swing.JLabel length_label;
    private javax.swing.JLabel list_lbl;
    private javax.swing.JButton load_btn;
    private javax.swing.JTabbedPane main_panel;
    private javax.swing.JMenuBar mnb_main;
    private javax.swing.JMenuItem mnu_exit;
    private javax.swing.JMenu mnu_file;
    private javax.swing.JMenu mnu_order;
    private javax.swing.JMenuItem mnu_reset;
    private javax.swing.JMenuItem mnu_sumbit_order;
    private javax.swing.JTextField name_box;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton next_button;
    private javax.swing.JRadioButton rdo_grass;
    private javax.swing.JRadioButton rdo_gravel;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton submit_button;
    private javax.swing.JTextArea summary_box;
    private javax.swing.JLabel summary_label;
    private javax.swing.JPanel welcome_tab;
    private javax.swing.JTextField width_box;
    private javax.swing.JLabel width_label;
    private javax.swing.JLabel yard_dimensions_label;
    // End of variables declaration//GEN-END:variables

    
    private void reset() {
        main_panel.setSelectedIndex(0);
        // clear the radiobutton selection
        btg_yard_type.clearSelection();
        // put the image back to "Dirt"
        lbl_picture.setIcon(new ImageIcon(
            this.getClass().getResource("dirt.jpg")) );
        name_box.setText("");
        this.name_box.requestFocusInWindow();
        address_box.setText("");
        length_box.setText("");
        width_box.setText("");
        summary_box.setText("");

    }
    
    private boolean validateInputs()
    {
        // get inputs from user using the textboxes
        String sName = name_box.getText();
        String sAddress = address_box.getText();
        String sWidth = width_box.getText();
        String sLength = length_box.getText();
        
        // confirm that a radiobutton has been selected
        if (btg_yard_type.getSelection() == null)
        {
            JOptionPane.showMessageDialog(this,
                    "Error. Please select the type of yard.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // make sure we have a name for the order
        if (sName.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Name",
                    "Name Error", JOptionPane.ERROR_MESSAGE);
            name_box.requestFocusInWindow();
            return false;
        }

        // make sure we have an address for the order
        if (sAddress.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Address",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            address_box.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() < 6)
        {
            JOptionPane.showMessageDialog(this, "Address must be six characters or more.",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            address_box.requestFocusInWindow();
            return false;
        }

        if (sWidth.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Width",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            width_box.requestFocusInWindow();
            return false;
        }

        // check to see if the width is a valid number
        try
        {
            Double.parseDouble(sWidth);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Width must be a number",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            width_box.setText("");
            width_box.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0)
        {
            JOptionPane.showMessageDialog(this, "Width must be greater than 0",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            length_box.setText("");
            length_box.requestFocusInWindow();
            return false;
        }

        if (sLength.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Length",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            length_box.requestFocusInWindow();
            return false;
        }

        try
        {
            Double.parseDouble(sLength);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Length must be a number",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            length_box.setText("");
            length_box.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sLength) <= 0)
        {
            JOptionPane.showMessageDialog(this,
                    "Length must be must be greater than 0",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            length_box.setText("");
            length_box.requestFocusInWindow();
            return false;
        }
        
        // all is good so return true
        return true;
    }

    
    private Customer createCustomer()
    {
        String name = name_box.getText();
        String address = address_box.getText();
        double width = Double.parseDouble(width_box.getText());
        double length = Double.parseDouble(length_box.getText());
        String yardType = "";
        double totalCost = 0.0;

        if (rdo_grass.isSelected())
        {
            yardType = "Grass";
            totalCost = GRASS_PER_SQFT * width * length;
        }
        else if (rdo_gravel.isSelected())
        {
            yardType = "Gravel";
            totalCost = GRAVEL_PER_SQFT * width * length;
        }
        else
        {
            JOptionPane.showMessageDialog(this, 
 			"Error. Please select a yard type.");
            totalCost = 0.0;
        }

        Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
        return cust;
    }

    
    public void submitOrder()
    {
        if (validateInputs() == false)
        {
            return;    // end the method if validation failed
        }

        Customer cust = createCustomer();
        customerList.addElement(cust);
        customer_details.setText(cust.getDetails());

        // reset for the next customer
        reset();

        //move to the client orders tab
        main_panel.setSelectedIndex(2);
    }
}