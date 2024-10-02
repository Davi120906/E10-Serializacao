import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializaConta {
    public static void serializar(Conta conta) {
        int agencia = conta.getAgencia();
        int numero = conta.getNumero();
        try (FileOutputStream arquivo = new FileOutputStream(agencia+"-"+numero+".ser");
             ObjectOutputStream out = new ObjectOutputStream(arquivo)) {
            
            // Serializando o objeto
            out.writeObject(conta);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       public static Conta desserializarConta(String nomeArquivo) {
        try (FileInputStream arquivo = new FileInputStream(nomeArquivo);
             ObjectInputStream in = new ObjectInputStream(arquivo)) {
            
            // Desserializando o objeto e retornando como Animal
            Conta conta = (Conta) in.readObject();
            System.out.println("Objeto desserializado com sucesso!");
            return conta;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
