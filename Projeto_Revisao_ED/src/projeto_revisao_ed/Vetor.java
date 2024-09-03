
package projeto_revisao_ed;




public class Vetor {
    //Lista de atributos
    public String[] elementos;
    public int tamanho;
    //Lista de métodos
    public Vetor(int capacidade){
        this.elementos= new String[capacidade];
        this.tamanho=0;
    }
    public void adicionar(String elemento)throws Exception {
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
        }else{
            throw new Exception("O vetor já está cheio, "+
                    "Não é possivel adicionar novos elementos");
        }
    }
    public int tamanho(){
        return this.tamanho;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(", ");
        
        for(int i=0;i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        
        return s.toString();
    }
    public String busca(int posicao)throws Exception{
        if (posicao>=0&&posicao<tamanho){
           return elementos[posicao-1]; 
        }else{
            throw new Exception(" Posição Inválida");
        }
    }
    public int buscar1(String elemento){
        for(int i=0;i<tamanho;i++){
           if(elementos[i].equals(elemento)){
            return i;
           } 
        }
        return -1;
    }
    public boolean adicionarInicio(int posicao, String elemento)throws Exception{
        if(posicao>=0 && posicao<tamanho){
            for(int i=this.tamanho-1;i>posicao;i++){
                this.elementos[i+1]=this.elementos[i];
            }
            this.elementos[posicao]=elemento;
            this.tamanho++;
        }else{
            throw new Exception("posição Inválida");
        }
        return true;
    }
        
    
}

/*Método para adicionar um elemento (nesse caso será inserido no final do
vetor);
▹ Também podemos criar um método para adicionar um elemento em uma
posição especifica;
▹ Método para remover um elemento;
▹ Método para buscar um elemento (Pesquisa);
▹ Método para identificar o tamanho real do nosso vetor;
▹ E por fim um método para exibir o conteúdo do nosso vetor
*/