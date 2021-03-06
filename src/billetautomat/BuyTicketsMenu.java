/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;

/**
 *
 * @author bruger
 */
public class BuyTicketsMenu extends javax.swing.JPanel {

    /**
     * Creates new form BuyTickets
     */
    public BuyTicketsMenu() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        label1 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        textField1 = new java.awt.TextField();

        setBackground(new java.awt.Color(0, 0, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
        });

        button1.setLabel("Tilbage");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        button2.setLabel("Vælg Billet");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(153, 153, 255));
        label1.setText("kr:");

        textArea1.setBackground(new java.awt.Color(255, 255, 153));
        textArea1.setEditable(false);
        textArea1.setEnabled(false);

        textField1.setText("1");
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        choice1.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    //Går tilbage til hoved menuen MainMenu når "Tilbage" knappen bliver trykket på
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        Start.mWin.goToMain(this);
    }//GEN-LAST:event_button1ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        label1.setText("kr: " + Start.AutomatBalance.getBalance());
    }//GEN-LAST:event_formMouseEntered

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
        //Tilføjer billettyperne som valgmulighedder i menuen når der bliver klikket på den
        if(choice1.getItemCount() == 0){
            for (Billet b : Start.billetTyper){
                choice1.add(b.GetBilletType());
            }   
        }
        else{
            Start.BilletHandler.setValgtBillet(choice1.getSelectedIndex());
        }
    }//GEN-LAST:event_choice1MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if(Start.AutomatBalance.getBalance() >= Start.billetTyper.get(Start.BilletHandler.getValgtBillet()).GetBilletPris()){
            Start.BilletHandler.KøbBillet();
            //Denne ret lange linje kode sætter tekstfætets tekst til at være lig med sigselv + "1x billettyppen" af den valgte bilet
            //Med andre ord tildføjer den nyligt valgte billetter til listen.
            textArea1.setText(textArea1.getText() + "\n" + Start.BilletHandler.getAntalBilletter() + "x " + Start.billetTyper.get(Start.BilletHandler.getValgtBillet()).GetBilletType());
            
        }
        else{
            textArea1.setText("Balancen er ikke høj nok til at købe den valgte billet.");
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
        Start.BilletHandler.setAntalBilletter(Integer.parseInt(textField1.getText()));
    }//GEN-LAST:event_textField1TextValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Choice choice1;
    private java.awt.Label label1;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}