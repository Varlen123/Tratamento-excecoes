

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Enter a number");
        String b = JOptionPane.showInputDialog("Enter another number");
            try {
                
            
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }

        System.out.println("O código continuou");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}