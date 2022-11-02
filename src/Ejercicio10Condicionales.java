import javax.swing.*;

public class Ejercicio10Condicionales {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Escribe el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Escribe el año: "));

        if(año == 0){
            JOptionPane.showMessageDialog(null, "La fecha indicada es la incorrecta");
        }else if((mes == 2) && (dia>=1 && dia <=28)){
            JOptionPane.showMessageDialog(null, "La fecha indicada es correcta");
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia>=1 && dia<=30)){
            JOptionPane.showMessageDialog(null, "La fecha indicada es correcta");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31)){
            JOptionPane.showMessageDialog(null, "La fecha indicada es correcta");
        }else{
            JOptionPane.showMessageDialog(null, "La fecha indicada es incorrecta");
        }
    }
}
