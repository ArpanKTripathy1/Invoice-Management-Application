package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pojo.Students;
public class Crud {
 
 public static Connection getConnection()
 {
   Connection conn =null;
   String url ="jdbc:mysql://localhost:3306/grey_goose";
   String user = "root";
   String pass ="Archana001**";
   
   
    try {
     Class.forName("com.mysql.jdbc.Driver");
     conn =DriverManager.getConnection(url,user,pass);
    } catch (ClassNotFoundException e) {
     
     e.printStackTrace();
    } catch (SQLException e) {
     e.printStackTrace();
    }
    
    return conn;

  }
public ArrayList<Students> getData()
  {
   ArrayList<Students> ALLStudents =new ArrayList<Students>();
   int sl_no,cust_number,buisness_year,doc_id,posting_id;
   String business_code,clear_date,posting_date,document_create_date,due_in_date,invoice_currency,document_type;
   try {
    Connection conn = getConnection();
    String sql_query="SELECT * from winter_internship";
    PreparedStatement pst = conn.prepareStatement(sql_query);
    //System.out.println(pst);
    
    ResultSet rs = pst.executeQuery();
while(rs.next())
    {
     Students s = new Students();
      sl_no = rs.getInt("sl_no");
      cust_number = rs.getInt("cust_number");
      buisness_year = rs.getInt("buisness_year");
      doc_id = (int) rs.getLong("doc_id");
      posting_id = rs.getInt("posting_id");
      
      business_code = rs.getString("business_code");
      clear_date = rs.getString("clear_date");
      posting_date = rs.getString("posting_date");
      document_create_date = rs.getString("document_create_date");
 

      due_in_date = rs.getString("due_in_date");
      invoice_currency = rs.getString("invoice_currency");
      document_type = rs.getString("document_type");
      
      s.setSl_no(sl_no);
     s.setCust_number(cust_number);
     s.setBuisness_year(buisness_year);
     s.setDoc_id(doc_id);
     s.setPosting_id(posting_id);
     
     s.setBusiness_code(business_code);
     s.setClear_date(clear_date);
     s.setPosting_date(posting_date);
     s.setDocument_create_date(document_create_date);
     s.setDue_in_date(due_in_date);
     s.setInvoice_currency(invoice_currency);
     s.setDocument_type(document_type);
     
     ALLStudents.add(s);
     
     
    }
 for(Students stud: ALLStudents)
    {
     System.out.println(stud.toString());
    }
    
   }
   catch (Exception e) {
    e.printStackTrace();
    System.out.println("exception occur");
   }
   
   return ALLStudents;
   
  
  }

}