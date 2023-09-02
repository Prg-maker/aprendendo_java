import java.util.Scanner;
import java.util.Random;


public class Aluno {
  // metodos: acordar, ouvir , falar e dormir;
  // aluno tem um criador pessoal temporario

  private static int id; 

  private static int createId(){
    Random random = new Random();
    id = random.nextInt(100) ;

    return id;

  }

  public static void acordar(int horas){
    int _id= createId();
    
    System.out.println(_id);

  }

}
