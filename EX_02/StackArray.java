public class StackArray <T>{

    private T[] array;

    private int contador;

    public StackArray(){
        array = (T[]) new Object[10];
        contador = 0;
    }

    public boolean isEmpty(){
        return contador == 0;
    }

    //metodo removeFirst
    public T removeFirst(){
        if(isEmpty()){
            return null;
        }
        T first = array[0];
        for(int i = 0; i < contador; i++){
            array[i] = array[i+1];
        }
        contador--;
        return first;
    }

    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return array[0];
    }

    public void add(T element){
        if(contador == array.length){
            T[] newArray = (T[]) new Object[array.length * 2];
            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[contador] = element;
        contador++;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < contador; i++){
            result += array[i] + " ";
        }
        return result;
    }























}