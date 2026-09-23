
package ListasSimples;


public class ListasSimples {
    
    public static void main(String [] args){
        Lista lista = new Lista();
        
        lista.InsertarFinal(new Nodo("Sebastiano"));
        lista.InsertarInicio(new Nodo("La Kuki"));
        lista.InsertarInicio(new Nodo("La Popi"));
        lista.InsertarInicio(new Nodo("La Muerca"));
        lista.InsertarInicio(new Nodo("La  La Kuka"));
        lista.InsertarFinal(new Nodo("LA Pacha"));
        lista.InsertarDespues(new Nodo("Kuko"),("La Popi"));
        lista.recorrer();
        
    }
}
