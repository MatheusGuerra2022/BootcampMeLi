package br.com.meli.database;

import java.math.BigDecimal;
import java.sql.*;

public class ConsultasAvancadas {

    public Connection con;

    public static void main(String[] args) throws SQLException {

        ConsultasAvancadas consulta = new ConsultasAvancadas();
        consulta.con = consulta.connect();
        //consulta.selectSQLum();
        //consulta.selectSQLdois();
        //consulta.selectSQLtres();
        //consulta.selectSQLquatro();
        consulta.selectSQLcinco();




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


    // Mostrar o título e o nome do gênero de todas as séries.
    public void selectSQLum() throws SQLException {

        String consulta = "SELECT s.title,g.name " +
                          "FROM series s " +
                          "INNER JOIN genres g " +
                          "ON s.genre_id = g.id";

        String titulo;
        String genero;

        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");
                genero  = resultado.getString("name");

                System.out.println("Titulo da serie:" + titulo + " | Gênero:" + genero );
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    // Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em
    // cada um deles.
    public void selectSQLdois() throws SQLException {

        String consulta = "SELECT ac.first_name, ac.last_name, epi.title " +
                          "FROM actor_episode ac_epi " +
                          "INNER JOIN actors ac " +
                          "ON ac_epi.actor_id = ac.id " +
                          "INNER JOIN episodes epi " +
                          "ON ac_epi.episode_id = epi.id " +
                          "ORDER BY epi.title, ac.first_name, ac.last_name";

        String nome;
        String sobrenome;
        String titulo;


        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");
                nome  = resultado.getString("first_name");
                sobrenome  = resultado.getString("last_name");



                System.out.println("Titulo do episodio:" + titulo + " | Nome do Ator:" + nome +
                        " | Sobrenome do Ator:" + sobrenome );
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    //Mostrar o título de todas as séries e o número total de temporadas que cada uma
    //delas possui.
    public void selectSQLtres() throws SQLException {

        String consulta = "SELECT s.title, COUNT(se.number) AS temporadas " +
                          "FROM series s " +
                          "INNER JOIN  seasons se " +
                          "ON s.id = se.serie_id " +
                          "GROUP BY s.title";

        String titulo;
        int numeroDeTemporadas;


        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                titulo = resultado.getString("title");
                numeroDeTemporadas = resultado.getInt("temporadas");




                System.out.println("Titulo da serie:" + titulo + " | Numero de Temporadas: " + numeroDeTemporadas);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }


    //Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde
    //que seja maior ou igual a 3.
    public void selectSQLquatro() throws SQLException {

        String consulta = "SELECT g.name, COUNT(m.id) AS filmes " +
                          "FROM genres g " +
                          "INNER JOIN movies m " +
                          "ON g.id = m.genre_id " +
                          "GROUP BY g.name " +
                          "HAVING COUNT(m.id) >= 3 ";

        String genero;
        int numeroDeFilmes;


        try {
            Statement stm = con.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while (resultado.next()) {

                genero = resultado.getString("name");
                numeroDeFilmes = resultado.getInt("filmes");




                System.out.println("Gênero:" + genero + " | Total de filmes: " + numeroDeFilmes);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }

    //Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de
    //Star Wars e que estes não se repitam.
    public void selectSQLcinco() throws SQLException {

//        String consulta = "SELECT ac.first_name, ac.last_name, m.title  " +
//                "FROM actor_movie acm " +
//                "INNER JOIN movies m " +
//                "ON acm.movie_id = m.id " +
//                "INNER JOIN actors ac " +
//                "ON acm.actor_id = ac.id " +
//                "ORDER BY m.title, ac.first_name, ac.last_name " +
//                "WHERE m.title = ? ";

        String consulta = "SELECT ac.first_name, ac.last_name  " +
                "FROM actor_movie acm " +
                "INNER JOIN actors ac " +
                "ON acm.actor_id = ac.id " +
                "WHERE acm.movie_id IN " +
                "(SELECT m.id from movies m WHERE m.title = ? )";

        String titulo;
        String nome;
        String sobrenome;



        try {
            PreparedStatement stm = con.prepareStatement(consulta);
            stm.setString(1, "Guerra nas Estrelas: Episodio VI");
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {

                titulo = resultado.getString("title");
                nome = resultado.getString("first_name");
                sobrenome = resultado.getString("last_name");




                System.out.println("Nome do Filme: " + titulo + " | Nome do Ator: " + nome + " | Sobrenome do Ator: " + sobrenome);
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Erro na consulta");
        }
    }



}


