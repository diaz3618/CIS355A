
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**************************************************** 
Program Name: StocksGUI.java 
Programmer's Name: Daniel F Diaz Santiago
Program Description: This programs adds and removes stocks
***********************************************************/

public class StocksGUI extends javax.swing.JFrame {
    // Class-level references
    private DefaultListModel<Stock> model;

    /**
     * Creates new form StocksGUI
     */
    public StocksGUI() {
        model = new DefaultListModel<Stock>();
        initComponents();
        
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

        main_pnl = new javax.swing.JTabbedPane();
        list_pnl = new javax.swing.JPanel();
        remove_stock_btn = new javax.swing.JButton();
        stocks_scroll = new javax.swing.JScrollPane();
        stocks_list = new javax.swing.JList<>();
        profit_loss_lbl = new javax.swing.JLabel();
        add_stock_pnl = new javax.swing.JPanel();
        stock_name_lbl = new javax.swing.JLabel();
        qty_lbl = new javax.swing.JLabel();
        purchase_price_lbl = new javax.swing.JLabel();
        stock_name_box = new javax.swing.JTextField();
        qty_box = new javax.swing.JTextField();
        purchase_price_box = new javax.swing.JTextField();
        current_price_box = new javax.swing.JTextField();
        current_price_lbl = new javax.swing.JLabel();
        add_stock_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stocks4U App");
        setResizable(false);

        remove_stock_btn.setText("Remove Stock");
        remove_stock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_stock_btnActionPerformed(evt);
            }
        });

        stocks_list.setModel(model);
        stocks_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                stocks_listValueChanged(evt);
            }
        });
        stocks_scroll.setViewportView(stocks_list);

        profit_loss_lbl.setText("Profit / Loss");

        javax.swing.GroupLayout list_pnlLayout = new javax.swing.GroupLayout(list_pnl);
        list_pnl.setLayout(list_pnlLayout);
        list_pnlLayout.setHorizontalGroup(
            list_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, list_pnlLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(remove_stock_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(list_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(list_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stocks_scroll)
                    .addGroup(list_pnlLayout.createSequentialGroup()
                        .addComponent(profit_loss_lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        list_pnlLayout.setVerticalGroup(
            list_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, list_pnlLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(stocks_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(profit_loss_lbl)
                .addGap(14, 14, 14)
                .addComponent(remove_stock_btn)
                .addContainerGap())
        );

        main_pnl.addTab("List", list_pnl);

        stock_name_lbl.setText("Stock Name");

        qty_lbl.setText("Quantity");

        purchase_price_lbl.setText("Purchase Price");

        current_price_lbl.setText("Current Price");

        add_stock_btn.setText("Add Stock");
        add_stock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stock_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_stock_pnlLayout = new javax.swing.GroupLayout(add_stock_pnl);
        add_stock_pnl.setLayout(add_stock_pnlLayout);
        add_stock_pnlLayout.setHorizontalGroup(
            add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_stock_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stock_name_lbl)
                    .addComponent(qty_lbl)
                    .addComponent(purchase_price_lbl)
                    .addComponent(current_price_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_stock_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchase_price_box, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(qty_box, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(stock_name_box)
                    .addComponent(current_price_box))
                .addContainerGap())
        );
        add_stock_pnlLayout.setVerticalGroup(
            add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_stock_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock_name_lbl)
                    .addComponent(stock_name_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty_lbl)
                    .addComponent(qty_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchase_price_lbl)
                    .addComponent(purchase_price_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_stock_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(current_price_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(current_price_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_stock_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_pnl.addTab("Add Stock", add_stock_pnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_pnl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_pnl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_stock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stock_btnActionPerformed
        // verify that fields are complete
        if(stock_name_box.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Stock name is required.", "Error. Missing information", JOptionPane.ERROR_MESSAGE);
            stock_name_box.requestFocus();
            return;
        }
        
        if(qty_box.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Quantity is required.", "Error. Missing information", JOptionPane.ERROR_MESSAGE);
            qty_box.requestFocus();
            return;
        }
        
        if(purchase_price_box.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Purchase price is required.", "Error. Missing information", JOptionPane.ERROR_MESSAGE);
            purchase_price_box.requestFocus();
            return;
        }
        
        if(current_price_box.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Current price is required.", "Error. Missing information", JOptionPane.ERROR_MESSAGE);
            current_price_box.requestFocus();
            return;
        }
        
        // Initialize variables
        double purchase_price = 0.0;
        double qty = 0.0;
        double current_price = 0.0;
        
        try{
            purchase_price = Double.parseDouble(purchase_price_box.getText());
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", "Error. Invalid data", JOptionPane.ERROR_MESSAGE);
            purchase_price_box.requestFocus();
            return;
        }
        
        try{
            qty = Double.parseDouble(qty_box.getText());
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", "Error. Invalid data", JOptionPane.ERROR_MESSAGE);
            qty_box.requestFocus();
            return;
        }
        
        try{
            current_price = Double.parseDouble(current_price_box.getText());
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", "Error. Invalid data", JOptionPane.ERROR_MESSAGE);
            current_price_box.requestFocus();
            return;
        }
        
        // get input
        String stock_name = stock_name_box.getText();
        
        // create stock
        Stock stk = new Stock(stock_name, qty, purchase_price, current_price);
        
        // add stock object to JList
        model.addElement(stk);
        
        // reset form
        stock_name_box.setText("");
        qty_box.setText("");
        purchase_price_box.setText("");
        current_price_box.setText("");
        stock_name_box.requestFocus();
    }//GEN-LAST:event_add_stock_btnActionPerformed

    private void stocks_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_stocks_listValueChanged
        // get stock and show profit / loss
        Stock stk = stocks_list.getSelectedValue();
        
        if(stk != null){
            double profit_loss = stk.get_profit_loss();
            DecimalFormat fmt = new DecimalFormat("#,##0.00");
            
            if(profit_loss > 0.0)
                profit_loss_lbl.setText("Profit of: " + fmt.format(profit_loss));
            else if(profit_loss < 0.0)
                profit_loss_lbl.setText("Loss of: " + fmt.format(profit_loss));
            else
                profit_loss_lbl.setText("Break-even with zero profit/loss");
        }
    }//GEN-LAST:event_stocks_listValueChanged

    private void remove_stock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_stock_btnActionPerformed
        // get stock position
        int index = stocks_list.getSelectedIndex();
        
        // if selected, remove stock
        if(index >= 0){
            model.remove(index);
            profit_loss_lbl.setText("Profit / Loss");
        }
    }//GEN-LAST:event_remove_stock_btnActionPerformed

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
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StocksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StocksGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_stock_btn;
    private javax.swing.JPanel add_stock_pnl;
    private javax.swing.JTextField current_price_box;
    private javax.swing.JLabel current_price_lbl;
    private javax.swing.JPanel list_pnl;
    private javax.swing.JTabbedPane main_pnl;
    private javax.swing.JLabel profit_loss_lbl;
    private javax.swing.JTextField purchase_price_box;
    private javax.swing.JLabel purchase_price_lbl;
    private javax.swing.JTextField qty_box;
    private javax.swing.JLabel qty_lbl;
    private javax.swing.JButton remove_stock_btn;
    private javax.swing.JTextField stock_name_box;
    private javax.swing.JLabel stock_name_lbl;
    private javax.swing.JList<Stock> stocks_list;
    private javax.swing.JScrollPane stocks_scroll;
    // End of variables declaration//GEN-END:variables
}
