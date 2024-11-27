package aula;

public class ListaEncadeada {
    private No cabeca;
    
    public void adicionarFim(int valor){
        No novoNo = new No(valor);
        if  (cabeca == null){
            cabeca = novoNo;
        }else{
            No temp = cabeca;
            while(temp.proximo!=null){
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
        }
    }
    public void adicionarComeco(int valor) {
    	No novoNo = new No(valor);
    	if(cabeca == null) {
    		cabeca = novoNo;
    	}else{
    		novoNo.proximo = cabeca;
    		cabeca = novoNo;
    		}
    	
    }
    
    
    public void adicionarMeio(int valor, int indice) {
    	No novoNo = new No(valor);
        if  (cabeca == null){
            cabeca = novoNo;
        }else{
        	   No temp = cabeca;
               while(temp.valor != indice){
                   temp = temp.proximo;
               }
            	   novoNo.proximo = temp.proximo;
            	   temp.proximo = novoNo;
            	
        }
    }
    
    
    
    public void imprimir(){
        No temp = cabeca;
        while(temp != null){
            System.out.println(temp.valor+"");
            temp = temp.proximo;
        }
    }

    private class No{
        int valor;
        No proximo;
        
        public No(int valor){
            this.valor = valor;
            proximo = null;
        }
    }
    public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada();
    lista.adicionarFim(2);
    lista.adicionarFim(0);
    lista.adicionarFim(50);
    lista.adicionarComeco(3);
    lista.adicionarMeio(10, 0);
    lista.imprimir();
}

}
