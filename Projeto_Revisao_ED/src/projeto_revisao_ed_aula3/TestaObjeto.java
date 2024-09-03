
package projeto_revisao_ed_aula3;



public class TestaObjeto {
    public static void main(String[] args) throws Exception {
        VetorObjeto vetor=new VetorObjeto(5);
        
        Contato c1 =new Contato("Claudio","(11) 99999-9999","emailteste@teste.com");
        Contato c2 =new Contato("Claudio","(11) 99999-9999","emailteste@teste.com");
        Contato c3 =new Contato("Claudio","(11) 99999-9999","emailteste@teste.com");
        Contato c4 =new Contato("Claudio","(11) 99999-9999","emailteste@teste.com");
         
        try{
         vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);
        vetor.adicionar(c4);   
        }catch(Exception e){
           e.printStackTrace();
        }
        
        
        System.out.println("Quantidade de dados no vetor: "+vetor.tamanho());
        System.out.println("Dados do vetor: "+vetor);
    }
}
