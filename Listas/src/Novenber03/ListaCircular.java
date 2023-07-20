package Novenber03;

public class ListaCircular {
    NodoLC inicio;
    NodoLC ultimo;
    int T;
    
    public void ListaCircular(){
        inicio = null;
        ultimo = null;
        T = 0;
    }
    public void insertarInicio(int elemento){
        NodoLC nuevo = new NodoLC(elemento);
        if(EsVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setEnlace(inicio);
        }else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            ultimo.setEnlace(inicio);
        }
        
    }
    
    public void insertarFinal(int valor){
        NodoLC nuevo = new NodoLC(valor);
        nuevo.setDato(valor);
        if(EsVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setEnlace(inicio);
        }else{
            ultimo.setEnlace(nuevo);
            nuevo.setEnlace(inicio);
            ultimo = nuevo;
        }
        
    }
    public String mostrarLista(){
        NodoLC aux = inicio;
        String cadena = "[";
        do{
            cadena = cadena + aux.dato+",";
            aux = aux.enlace;
        }while(aux != inicio);
        return cadena + "]";
    }
    
    public int NumMayor(){
        NodoLC aux= inicio;
        int mayor = 0;
        do{
            if (aux.dato>mayor) {
                mayor = aux.dato;
            }
            aux = aux.enlace;
        }while(aux!=inicio);
        return mayor;
    }
    
    public int NumElementos(){
        NodoLC aux = inicio;
        int elementos=0;
        do{            
            aux = aux.enlace;
            elementos++;
        }while(aux != inicio);
        return elementos;
    }
    
    public int Buscar(int elemento){
        NodoLC aux= inicio;
        int encontrado = elemento;
        do{
            if (aux.dato==encontrado) {
                encontrado = aux.dato;
            }else{
                encontrado =-1;
            }
            aux = aux.enlace;
        }while(aux!=inicio);
        return encontrado;
    }

    private boolean EsVacia() {
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }


}
