import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Jogador {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner entrada = new Scanner(System.in);
        Socket conexao = new Socket("127.0.0.1", 8934);

        String resposta1 = "";
        String resposta2 = "";
        String resposta3 = "";
        String resposta4 = "";
        String resposta5 = "";
        String total = "";

            boolean venceu = false;
            while (!venceu) {    
            System.out.println("======= SEJA BEM VINDO AO QUIZ DA COPA DO MUNDO =======");
            System.out.println("\n==== REGRAS ==== ");
            System.out.println("1- Serão 5 questões com 5 alternativas de resposta cada questão;");
            System.out.println("2- Você ganhará o jogo caso acerte pelo menos 4 das 5 questões;");
            System.out.println("3- Cada questão valerá 10 pontos;");
            System.out.println("4- Você deverá escolher entre as letras 'a', 'b', 'c', 'd', 'e';");
            System.out.println("5- São aceitas somente letras minúsculas.");
            System.out.println("================");
           
            System.out.println("\nCOMEÇANDO O JOGO......");

            System.out.println("Qual país ganhou a primeira Copa do Mundo?");
            System.out.println("A - Brasil.");
            System.out.println("B - Itália.");
            System.out.println("C - Japão.");
            System.out.println("D - Argentina.");
            System.out.println("E - Uruguai");
            System.out.print("RESPOSTA >>> ");
            resposta1 = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados1 = resposta1.getBytes();
            conexao.getOutputStream().write(dados1);
            conexao.getOutputStream().flush();
            //Receber o feedback do Servidor
            byte[] dados2 = new byte[1024];
            conexao.getInputStream().read(dados2);
            String mensagem1 = new String(dados2);
            System.out.println(mensagem1);

            System.out.println("\nQual jogador fez mais gols em uma única edição de Copa do Mundo?");
            System.out.println("A - Maradona.");
            System.out.println("B - Lionel Messi.");
            System.out.println("C - Cristiano Ronaldo.");
            System.out.println("D - Just Fontaine.");
            System.out.println("E - Pelé");
            System.out.print("RESPOSTA >>> ");
            resposta2 = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados3 = resposta2.getBytes();
            conexao.getOutputStream().write(dados3);
            conexao.getOutputStream().flush();
            //Receber o feedback do Servidor
            byte[] dados4 = new byte[1024];
            conexao.getInputStream().read(dados4);
            String mensagem2 = new String(dados4);
            System.out.println(mensagem2);

            System.out.println("\nQuais foram os dois anos em que o Brasil sediou a Copa do Mundo?");
            System.out.println("A - 1958 e 1962.");
            System.out.println("B - 2014 e 1950.");
            System.out.println("C - 2014 e 1958.");
            System.out.println("D - 1994 e 2002.");
            System.out.println("E - 2010 e 1958.");
            System.out.print("RESPOSTA >>> ");
            resposta3 = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados5 = resposta3.getBytes();
            conexao.getOutputStream().write(dados5);
            conexao.getOutputStream().flush();
            //Receber o feedback do Servidor
            byte[] dados6 = new byte[1024];
            conexao.getInputStream().read(dados6);
            String mensagem3 = new String(dados6);
            System.out.println(mensagem3);

            System.out.println("\nQual foi o jogador que mais venceu a Copa do Mundo?");
            System.out.println("A - Pelé.");
            System.out.println("B - Daniel Alves.");
            System.out.println("C - Maradona.");
            System.out.println("D - Puskás.");
            System.out.println("E - Cafú.");
            System.out.print("RESPOSTA >>> ");
            resposta4 = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados7 = resposta4.getBytes();
            conexao.getOutputStream().write(dados7);
            conexao.getOutputStream().flush();
            //Receber o feedback do Servidor
            byte[] dados8 = new byte[1024];
            conexao.getInputStream().read(dados8);
            String mensagem4 = new String(dados8);
            System.out.println(mensagem4);
            
            System.out.println("\nQual seleção ganhou a Copa do Mundo de 1966?");
            System.out.println("A - Alemanha.");
            System.out.println("B - Inglaterra.");
            System.out.println("C - México.");
            System.out.println("D - Brasil.");
            System.out.println("E - Itália.");
            System.out.print("RESPOSTA >>> ");
            resposta5 = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados9 = resposta5.getBytes();
            conexao.getOutputStream().write(dados9);
            conexao.getOutputStream().flush();
            //Receber o feedback do Servidor
            byte[] dados10 = new byte[1024];
            conexao.getInputStream().read(dados10);
            String mensagem5 = new String(dados10);
            System.out.println(mensagem5);

            System.out.println("DESEJA SABER O RESULTADO DO SEU QUIZ? (sim) ou (não)");
            total = entrada.nextLine();
            //Enviar o palpite para o Servidor
            byte[]dados11 = total.getBytes();
            conexao.getOutputStream().write(dados11);
            conexao.getOutputStream().flush();
            byte[] dados12 = new byte[1024];
            conexao.getInputStream().read(dados12);
            String mensagem6 = new String(dados12);
            System.out.println(mensagem6);
            venceu = true;
        }
    }
}

