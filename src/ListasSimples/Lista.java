
package ListasSimples;


public class Lista {
    private Nodo primero;

    public Lista(Nodo primero) {
        this.primero = null;
    }
    
    public void InsertarInicio(Nodo nuevo){
        if( primero == null){
            this.primero = nuevo;
        }else{
            nuevo.setSiguiente(primero);
        }
        
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
}
