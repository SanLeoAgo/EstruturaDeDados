
package projeto_revisao_ed_aula4;


public class Lista<T> extends EstruturaEstatica<T> {
  //Metodo Construtor com Parâmetros o super poque está herdando ...
  public Lista(int capacidade){
      super(capacidade);
  }
  //mètodo Construtor sem Parâmetros
  public Lista(){
      super();
  }
  public boolean adiciona(T elemento){
      return super.adiciona(elemento);
  }
   public boolean adiciona(int posicao,T elemento){
      return super.adiciona(posicao,elemento);
  }
}
