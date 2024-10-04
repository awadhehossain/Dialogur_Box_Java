import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DialogueBox {
    public static void main(String[] args) {
             //Show Dialogue Box
            //JOptionPane.showMessageDialog(null,"Hello World","Dialogue box",JOptionPane.INFORMATION_MESSAGE);
           //Input Dialogue Box
          //JOptionPane.showInputDialog(null,"Name:",null,JOptionPane.QUESTION_MESSAGE);
        //Input then show
        String name = JOptionPane.showInputDialog (null,"Enter your name","Input name",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your name is " + name,"Display name", JOptionPane.INFORMATION_MESSAGE);
    }
}