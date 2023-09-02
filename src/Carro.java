public class Carro {

  int ano, numPortas;
  boolean movimento;
  String marca, cor;
  //Illegal modifier for the constructor in type Carro; only public, protected & private are permitted
  public  Carro(String marca, String cor, int a, int n, boolean mov){
    this.marca=marca;
    this.cor=cor;
    numPortas = n;
    ano = a;
    movimento = mov;
  }
}
