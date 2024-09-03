
package projeto_revisao_ed;


public class Teste {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);
        
        try{
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            vetor.adicionar("elemento 3");
           
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Buscar vetor na posição  "+ vetor.adicionarInicio(0,"elemento 0"));
        System.out.println("A quantidade de informações no vetor e: "+vetor.tamanho());
        System.out.println("Dados do vetor "+ vetor.toString());
        System.out.println("Buscar vetor na posição 1 "+ vetor.busca(2));
        System.out.println("Buscar vetor na posição  "+ vetor.buscar1("elemento 1"));
        
    }
}
