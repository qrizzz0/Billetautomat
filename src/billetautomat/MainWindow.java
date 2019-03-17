/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;
import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.Component;

/**
 *
 * @author bruger
 */
public class MainWindow extends JFrame{
        private static MainMenu mainMen = new MainMenu();
        private static AdminMenuUI adMen = new AdminMenuUI();
        private static AdminPasswordMenu adPassMen = new AdminPasswordMenu();
        private static MoneyMenu monMen = new MoneyMenu();
        private static BuyTicketsMenu buTiMen = new BuyTicketsMenu();
    

    public MainWindow(String title) throws HeadlessException {
        super(title);
    }
        
        public void goToMain(Component m){
            this.remove(m);
            this.add(mainMen);
            this.repaint();
        }
        public void startAtMain(){
            this.add(mainMen);
            this.repaint();
        }
        public void goToAdmin(Component m){
            this.remove(m);
            this.add(adMen);
        }
        public void goToPassw(Component m){
            this.remove(m);
            this.add(adPassMen);
        }
        public void goToMoney(Component m){
            this.remove(m);
            this.add(monMen);
        }
        public void goToBuy(Component m){
            this.remove(m);
            this.add(buTiMen);
            this.repaint();
        }
}
