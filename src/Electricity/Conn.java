package Electricity;

import java.sql.*;
// Importa TODAS as classes do pacote java.sql

public class Conn {

    Connection c;
    // Representa a conexão com o banco de dados MySQL

    Statement s;
    // Usado para executar comandos SQL (SELECT, INSERT, UPDATE, etc.)

    public Conn() {

        try {

            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Cria a conexão com o banco de dados
            // jdbc:mysql://localhost:3306/ebs
            // localhost -> banco está na sua máquina
            // 3306      -> porta padrão do MySQL
            // ebs       -> nome do database
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebs?useSSL=false&serverTimezone=UTC",
                    "root",        // usuário do banco
                    "mysql123"     // senha do banco
            );

            // Cria um objeto Statement para executar comandos SQL
            s = c.createStatement();

            // Mensagem só para confirmar que conectou
            System.out.println("Conectado ao banco com sucesso!");

        } catch (Exception e) {
            // Captura qualquer erro:
            // - driver não encontrado
            // - senha errada
            // - banco não existe
            // - MySQL desligado
            e.printStackTrace();
        }
    }
}