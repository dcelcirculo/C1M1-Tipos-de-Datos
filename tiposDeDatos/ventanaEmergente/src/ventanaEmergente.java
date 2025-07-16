import javax.swing.JOptionPane;

public class ventanaEmergente {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Digite el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario"));
        char letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);

        //  salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "La edad del estudiante es: " + edad + " años");
        JOptionPane.showMessageDialog(null, "El nombre del estudiante es: " + nombre);
        JOptionPane.showMessageDialog(null, "La estatura del estudiante es: " + estatura + " metros");
        JOptionPane.showMessageDialog(null, "El salario del estudiante es: " + salario + " euros");
    }

}