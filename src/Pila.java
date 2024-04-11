import java.util.Stack;

public class Pila {
    private Stack <Integer> numeros;

    public Pila() {
        numeros = new Stack<Integer>();
    }

    public boolean estaVacia(){
        return numeros.empty();
    }

    public void apilar(Integer elemento){
        numeros.push(elemento);
    }

    public Integer desapilar() throws Exception {
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.pop();
        //POP PARA SACAR ELEMENTOS
    }

    public Integer cima() throws Exception{
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.peek();
    }

    public int buscarElemento(int i) throws Exception{
        if (estaVacia())
            throw new Exception("No hay elementos");
        return numeros.search(i);
    }

    @Override
    public String toString(){
        String mensaje = "";
        for (int i=numeros.size()-1; i>= 0; i--){
            mensaje += numeros.get(i)+ "\n";
        }
        return mensaje;
    }


    public String toString2() {
        String mensaje = "";
        for (int i = numeros.size() - 1; i >= 0; i--) {
            mensaje += numeros.get(i);

        }
        return mensaje;
    }
}
