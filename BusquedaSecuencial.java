package busquedasecuencial;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        int arreglo[] = {4, 5, 6, 9, 1};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a buscar:  "));
        //busqueda secuencial

        int i = 0;
        while (i < 5 && band == false) {

            {

                if (arreglo[i] == dato) {
                    band = true;
                }
            }
            i++;
        }
        if(band==false){
            JOptionPane.showMessageDialog(null, "el numero no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "el numero ha sido encontrado en la posicion:"+(i-1) );
        }

    }
}
