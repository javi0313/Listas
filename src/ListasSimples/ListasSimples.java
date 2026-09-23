
package ListasSimples;


public class ListasSimples {
    
    public static void main(String [] args){
        Lista lista = new Lista();
        
        lista.InsertarFinal(new Nodo("La kuka"));
        lista.InsertarInicio(new Nodo("La Kuki"));
        lista.InsertarInicio(new Nodo("La Popi"));
        lista.InsertarInicio(new Nodo("el koko"));
        lista.InsertarInicio(new Nodo("La  La mueka"));
        lista.InsertarFinal(new Nodo("LA Pacha"));
        lista.InsertarDespues(new Nodo("Kuko"),("La Popi"));
        
        
        
        lista.Eliminar();
        lista.EliminarDespues("La Kuki");
        
        lista.recorrer();
    }
}
