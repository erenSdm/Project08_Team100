package team_10.stepdefinitions.database_stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.PasswordAuthentication;
import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US01_DBStepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("{string} ile guest useri cagir")
    public void ile_guest_useri_cagir(String username) throws SQLException {


       Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com","select_user","43w5ijfso");
       statement=connection.createStatement();
       //query calistir
        String query="SELECT *FROM quest_user WHERE username ='john129'";
       resultSet=statement.executeQuery(query);
    }
    @Then("body sunlari icermeli{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public  void body_sunlari_icermeli(String username,String name,String surname,String birthplace,String phone,String gender,String dateOfBirth,String ssn,String password) throws SQLException {
        resultSet.next();
      String actName=resultSet.getString("name");
      String actUsername=resultSet.getString("username");
      String actsurname=resultSet.getString("surname");
      String actBirthPlace=resultSet.getString("birthplace");
      String actPhone=resultSet.getString("phone");
      String actGender=resultSet.getString("gender");
      String actDateOfBirth=resultSet.getString("birth_day");
      String actSsn=resultSet.getString("ssn");

      assertEquals(username,actUsername);
      assertEquals(name,actName);
      assertEquals(surname,actsurname);
      assertEquals(birthplace,actBirthPlace);
      assertEquals(phone,actPhone);
      assertEquals(gender,actGender);
      assertEquals(dateOfBirth,actDateOfBirth);
      assertEquals(ssn,actSsn);




    }
}
