import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor =  new ServerSocket(8934);
        Socket conexao = servidor.accept();
        System.out.println("Jogador conectado!");

        int total_De_Pontos = 0;
        int pontos1 = 0;
        int pontos2 = 0;
        int pontos3 = 0;
        int pontos4 = 0;
        int pontos5 = 0;
        boolean venceu = false;
        while (!venceu) {
            byte[]dados1 = new byte [1];
            conexao.getInputStream().read(dados1);
            String resposta1 = new String (dados1);
        
            if(resposta1.contains("e")) {
                pontos1 = 10;
                String mensagem1 = "\nExcelente! A resposta correta é a letra " + resposta1.toUpperCase()+".";
                byte[] dados2 = mensagem1.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados2);
                conexao.getOutputStream().flush();
            } else {
                pontos1 = 0;
                String mensagem1 = "\nResposta incorreta! A resposta correta é a letra E.";
                byte[] dados2 = mensagem1.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados2);
                conexao.getOutputStream().flush();
            }

            byte[]dados3 = new byte [1];
            conexao.getInputStream().read(dados3);
            String resposta2 = new String (dados3);
        
            if(resposta2.contains("d")) {
                pontos2 = 10;
                String mensagem2 = "\nExcelente! A resposta correta é a letra " + resposta2.toUpperCase()+".";
                byte[] dados4 = mensagem2.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados4);
                conexao.getOutputStream().flush();
            } else {
                pontos2 = 0;
                String mensagem2 = "\nResposta incorreta! A resposta correta é a letra D.";
                byte[] dados4 = mensagem2.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados4);
                conexao.getOutputStream().flush();
            }

            byte[]dados5 = new byte [1];
            conexao.getInputStream().read(dados5);
            String resposta3 = new String (dados5);
        
            if(resposta3.contains("b")) {
                pontos3 = 10;
                String mensagem3 = "\nExcelente! A resposta correta é a letra " + resposta3.toUpperCase()+".";
                byte[] dados6 = mensagem3.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados6);
                conexao.getOutputStream().flush();
            } else {
                pontos3 = 0;
                String mensagem3 = "\nResposta incorreta! A resposta correta é a letra B.";
                byte[] dados6 = mensagem3.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados6);
                conexao.getOutputStream().flush();
            }

            byte[]dados7 = new byte [1];
            conexao.getInputStream().read(dados7);
            String resposta4 = new String (dados7);
        
            if(resposta4.contains("a")) {
                pontos4 = 10;
                String mensagem4 = "\nExcelente! A resposta correta é a letra " + resposta4.toUpperCase()+".";
                byte[] dados8 = mensagem4.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados8);
                conexao.getOutputStream().flush();
            } else {
                pontos4 = 0;
                String mensagem4 = "\nResposta incorreta! A resposta correta é a letra A.";
                byte[] dados8 = mensagem4.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados8);
                conexao.getOutputStream().flush();
            }

            byte[]dados9 = new byte [1];
            conexao.getInputStream().read(dados9);
            String resposta5 = new String (dados9);
        
            if(resposta5.contains("b")) {
                pontos5 = 10;
                String mensagem5 = "\nExcelente! A resposta correta é a letra " + resposta5.toUpperCase()+".";
                byte[] dados10 = mensagem5.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados10);
                conexao.getOutputStream().flush();
            } else {
                pontos5 = 0;
                String mensagem5 = "\nResposta incorreta! A resposta correta é a letra B.";
                byte[] dados10 = mensagem5.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados10);
                conexao.getOutputStream().flush();
            }

            byte[]dados11 = new byte [3];
            conexao.getInputStream().read(dados11);
            String total = new String (dados11);
            total_De_Pontos = pontos1 + pontos2 + pontos3 + pontos4 + pontos5;
            if ((total.contains("sim")) && (total_De_Pontos == 40)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 40\nParabéns, você ganhou o quiz!!\nVocê acertou 4 questões de 5 disponíveis!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            } else if ((total.contains("sim")) && (total_De_Pontos == 50)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 50\nParabéns, você ganhou o quiz!!\nVocê acertou todas as questões disponíveis!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            } else if ((total.contains("sim")) && (total_De_Pontos == 30)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 30\nInfelizmente você perdeu o quiz!! Você acertou 3 de 5 questões disponíveis!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            } else if ((total.contains("sim")) && (total_De_Pontos == 20)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 20\nInfelizmente você perdeu o quiz!! Você acertou 2 de 5 questões disponíveis!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            } else if ((total.contains("sim")) && (total_De_Pontos == 10)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 10\nInfelizmente você perdeu o quiz!!\nVocê acertou apenas 1 de 5 questões disponíveis!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            } else if ((total.contains("sim")) && (total_De_Pontos == 0)) {
                String mensagem6 = "\nTOTAL DE PONTOS = 0\nInfelizmente você perdeu o quiz!!\nVocê não acertou nenhuma questão!";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            }

            else {
                String mensagem6 = "\n===== OBRIGADO POR REALIZAR NOSSO QUIZ DA COPA DO MUNDO! =====";
                byte[] dados12 = mensagem6.getBytes();
                //Enviar a mensagem para o usuário
                conexao.getOutputStream().write(dados12);
                conexao.getOutputStream().flush();
                venceu = true;
            }
        }
        conexao.close();
    }
}
