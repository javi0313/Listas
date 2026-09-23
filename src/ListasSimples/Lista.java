
package ListasSimples;


public class Lista {
    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    
    
    public void InsertarInicio(Nodo nuevo){
        if( primero == null){
            this.primero = nuevo;
        }else{
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
        }
        
    }
    
    
    public void InsertarFinal(Nodo nuevo){
        if(this.primero == null){
            this.primero = nuevo;
        }else{
            Nodo actual = this.primero;
            while( actual.getSiguiente() != null){
              actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    
    public void recorrer(){
        if(this.primero == null){
          System.out.println("Lista vacia");
        }else{
            Nodo actual = this.primero;
            while(actual != null){
                System.out.println("[" + actual.getDato() + "]" + actual.getSiguiente());
                actual = actual.getSiguiente();
                
            }
            
    
        
    }
    }
    
    public void InsertarDespues(Nodo nuevo, String ref){
       
            Nodo actual = this.primero;
            while(actual != null){
                
                if(actual.getDato().equals(ref)){
                    break;
                }
                actual = actual.getSiguiente();
            }
            if(actual == null){
                System.out.println("Nodo no encontrado");
            }else{
                nuevo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevo);
            }
            
        
    }
    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
}
