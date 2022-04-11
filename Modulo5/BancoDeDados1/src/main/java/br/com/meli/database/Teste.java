package br.com.meli.database;

import java.math.BigDecimal;
import java.sql.*;

public class Teste {

    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "virtus";

    public Connection con;

    public static void main(String[] args) throws SQLException {

        Teste teste = new Teste();
        teste.con = teste.connect();
        //teste.selectSQL();
        //teste.selectSQLdois();
        //teste.selectSQLtres();
        //teste.selectSQLquarto();
        //teste.selectSQLquinto();
        //teste.selectSQLsexto();
        //teste.selectSQLsetimo();
        //teste.selectSQLoitavo();
        //teste.selectSQLnono();
        //teste.selectSQLdecimo();
        //teste.selectSQLonze();
        //teste.selectSQLdoze();
        teste.selectSQLtreze();



    }

    public Connection connect() {
        Connection conn = null;

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "virtus";


        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    // Mostrar todos os registros da tabela de filmes.
    public void selectSQL() throws SQLException {
        //String consulta = "SELECT  FROM  WHERE usuario ='" + usuario + "' and senha = '" + senha + "'";
        //String consulta = "SELECT * FROM "+schema+"."+tabela;

        String consulta = "SELECT * FROM movies";

        int id;
        String nome;
        BigDecimal rating ;
        int awards;

        try {
                Statement stm = (Statement) con.createStatement();
                ResultSet resultado = stm.executeQuery(consulta);
                while (resultado.next()) {
                    id = resultado.getInt("id");
                    nome = resultado.getString("title");
                    rating  = resultado.getBigDecimal("rating");
                    awards = resultado.getInt("awards");

                    System.out.println("Id:" + id + " | Nome:" + nome + " | Rating:" + rating + " | Awards: " + awards);
                }
            } catch (SQLException ex)
            {
                ex.printStackTrace();
                System.out.println("Erro na consulta");
            }
    }

    // Mostrar o nome, sobrenome e classificação de todos os atores.
    public void selectSQLdois() throws SQLException {
        String consulta = "SELECT first_name, last_name, rating FROM actors";

        int id;
        String nome;
        String sobrenome;
        BigDecimal rating ;


        try {
            Statement stm = (Statement) con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {
                nome = resultado.getString("first_name");
                sobrenome = resultado.getString("last_name");
                rating  = resultado.getBigDecimal("rating");


                System.out.println(" | Nome:" + nome + " | Sobrenome: " + sobrenome + " | Rating:" + rating);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


    // Mostrar o título de todas as séries e use alias para que tanto o nome da tabela
    // quanto o campo estejam em Português.
    public void selectSQLtres() throws SQLException {

        String consulta = "SELECT title FROM series";

        String titulo;


        try {
            Statement stm = (Statement) con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");

                System.out.println("Titulo:" + titulo);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


    // Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5.
    public void selectSQLquarto() throws SQLException {
        String consulta = "SELECT first_name, last_name FROM actors WHERE rating > 7.5";

        String nome;
        String sobrenome;

        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                nome = resultado.getString("first_name");
                sobrenome = resultado.getString("last_name");


                System.out.println(" | Nome:" + nome + " | Sobrenome: " + sobrenome );
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação
    // superior a 7,5 e com mais de dois prêmios.
    public void selectSQLquinto() throws SQLException {

        String consulta = "SELECT title, rating, awards FROM movies WHERE rating > 7.5 AND awards > 2";

        String title;
        BigDecimal rating ;
        int awards;

        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                title = resultado.getString("title");
                rating  = resultado.getBigDecimal("rating");
                awards = resultado.getInt("awards");

                System.out.println("Titulo:" + title + " | Rating:" + rating + " | Awards: " + awards);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título dos filmes e a classificação ordenados por classificação em ordem
    // crescente.
    public void selectSQLsexto() throws SQLException {

        String consulta = "SELECT title,rating FROM movies ORDER BY rating DESC";


        String titulo;
        BigDecimal rating ;

        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");
                rating  = resultado.getBigDecimal("rating");


                System.out.println(" Titulo:" + titulo + " | Rating:" + rating);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar os títulos dos três primeiros filmes no banco de dados.
    public void selectSQLsetimo() throws SQLException {

        String consulta = "SELECT title FROM movies LIMIT 3";

        String titulo;


        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");

                System.out.println("Titulo: " + titulo );
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


    // Mostrar os 5 melhores filmes com a classificação mais alta.
    public void selectSQLoitavo() throws SQLException {

        String consulta = "SELECT title, rating FROM movies ORDER BY rating DESC LIMIT 5";


        String titulo;
        BigDecimal rating ;


        try {
            Statement stm = (Statement) con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");
                rating  = resultado.getBigDecimal("rating");


                System.out.println("Nome:" + titulo + " | Rating:" + rating);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Listar os 10 primeiros atores.
    public void selectSQLnono() throws SQLException {


        String consulta = "SELECT * FROM actors LIMIT 10";

        int id;
        String nome;
        String sobrenome;
        BigDecimal rating ;

        try {
            Statement stm = (Statement) con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {
                id = resultado.getInt("id");
                nome = resultado.getString("first_name");
                sobrenome = resultado.getString("last_name");
                rating  = resultado.getBigDecimal("rating");


                System.out.println("Nome:" + nome + " | Sobrenome: " + sobrenome +" | Rating:" + rating);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
    public void selectSQLdecimo() throws SQLException {

        String consulta = "SELECT title, rating FROM movies WHERE title = ?"  ;

        String titulo;
        BigDecimal rating ;

        try {
            PreparedStatement stm = con.prepareStatement(consulta);
            stm.setString(1, "Toy Story");
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {

                titulo = resultado.getString("title");
                rating  = resultado.getBigDecimal("rating");

                System.out.println("Titulo:" + titulo  + " | Rating:" + rating);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


    // Mostrar todos os atores cujos nomes começam com Sam.
    public void selectSQLonze() throws SQLException {

        String consulta = "SELECT * FROM actors WHERE first_name = ?";

        String nome;
        String sobrenome;

        try {
            PreparedStatement stm = con.prepareStatement(consulta);
            stm.setString(1, "Sam");
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {

                nome = resultado.getString("first_name");
                sobrenome = resultado.getString("last_name");

                System.out.println("Nome:" + nome + " | Sobrenome:" + sobrenome );
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título dos filmes que saíram entre 2004 e 2008.
    public void selectSQLdoze() throws SQLException {

        String consulta = "SELECT title, release_date FROM movies WHERE release_date BETWEEN ? and ?";

        String titulo;
        Date estreia;

        try {
            PreparedStatement stm = con.prepareStatement(consulta);
            stm.setDate(1, Date.valueOf("2004-01-01"));
            stm.setDate(2, Date.valueOf("2008-01-01"));
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {

                titulo = resultado.getString("title");
                estreia = resultado.getDate("release_date");

                System.out.println("Titulo:" + titulo + " | Data de estreia: " + estreia);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título dos filmes com classificação superior a 3, com mais de 1 prêmio e
    // com data de lançamento entre 1988 e 2009. Ordenar os resultados por
    // classificação.
    public void selectSQLtreze() throws SQLException {

        String consulta = "SELECT title,rating, release_date, awards FROM movies WHERE rating > 3 " +
                "AND awards > 1 AND release_date BETWEEN ? and ? ORDER BY rating";

        String titulo;
        BigDecimal rating ;
        int awards;
        Date estreia;

        try {
            PreparedStatement stm = con.prepareStatement(consulta);
            stm.setDate(1, Date.valueOf("1988-01-01"));
            stm.setDate(2, Date.valueOf("2009-01-01"));
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                titulo = resultado.getString("title");
                rating  = resultado.getBigDecimal("rating");
                awards = resultado.getInt("awards");
                estreia = resultado.getDate("release_date");

                System.out.println("Titulo:" + titulo + " | Rating:" + rating + " | Awards: " + awards +
                        " | Data de estreia: " + estreia);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


}
