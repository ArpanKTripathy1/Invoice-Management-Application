package com.pojo;

public class Students {
 
 private Integer sl_no=0;
 private String business_code="";
 private Integer cust_number;
 private String clear_date="";
 private Integer buisness_year=0;
 private long doc_id=0;
 private String posting_date="";
 private String document_create_date="";
 private String due_in_date="";
 private String invoice_currency="";
 private String document_type="";
 private Integer posting_id=0;
 public Integer getSl_no() {
  return sl_no;
 }
public void setSl_no(Integer sl_no) {
  this.sl_no = sl_no;
 }



 public String getBusiness_code() {
  return business_code;
 }



 public void setBusiness_code(String business_code) {
  this.business_code = business_code;
 }
public Integer getCust_number() {
  return cust_number;
 }



 public void setCust_number(Integer cust_number) {
  this.cust_number = cust_number;
 }



 public String getClear_date() {
  return clear_date;
 }



 public void setClear_date(String clear_date) {
  this.clear_date = clear_date;
 }
public Integer getBuisness_year() {
  return buisness_year;
 }



 public void setBuisness_year(Integer buisness_year) {
  this.buisness_year = buisness_year;
 }



 public long getDoc_id() {
  return doc_id;
 }



 public void setDoc_id(long doc_id) {
  this.doc_id = doc_id;
 }
public String getPosting_date() {
  return posting_date;
 }



 public void setPosting_date(String posting_date) {
  this.posting_date = posting_date;
 }



 public String getDocument_create_date() {
  return document_create_date;
 }



 public void setDocument_create_date(String document_create_date) {
  this.document_create_date = document_create_date;
 }
public String getDue_in_date() {
  return due_in_date;
 }



 public void setDue_in_date(String due_in_date) {
  this.due_in_date = due_in_date;
 }



 public String getInvoice_currency() {
  return invoice_currency;
 }



 public void setInvoice_currency(String invoice_currency) {
  this.invoice_currency = invoice_currency;
 }
public String getDocument_type() {
  return document_type;
 }



 public void setDocument_type(String document_type) {
  this.document_type = document_type;
 }



 public Integer getPosting_id() {
  return posting_id;
 }



 public void setPosting_id(Integer posting_id) {
  this.posting_id = posting_id;
 }
public Integer getTotal_open_amount() {
  return total_open_amount;
 }




 private Integer total_open_amount=0;
    
 @Override
 public String toString() {
  return "Business [Sl no=" + sl_no + ", Business code=" + business_code + ", Customer number=" + cust_number + 
    ", Clear date=" + clear_date + ", Business year=" + buisness_year + ", Document ID=" + doc_id + 
    ", Posting date=" + posting_date + ", Document create date=" + document_create_date + ", Due date=" +
    due_in_date + ", Invoice currency=" + invoice_currency + "+ Document type=" + document_type + 
    ", Posting ID=" + posting_id 
    + "]";
 }
}