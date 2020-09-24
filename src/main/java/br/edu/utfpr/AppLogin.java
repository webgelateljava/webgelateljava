package br.edu.utfpr;

public class AppLogin {

    private String email;

    public AppLogin(String email){
	     setEmail(email);
    }

   public String getEmail(){
	    return this.email;
    }

    public void setEmail(String email){
	     this.email = email;
    }

    public String getLoginXML(String permissao){
      StringBuffer xml = new StringBuffer();
      xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      xml.append("<project xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");

      xml.append("<email>"+email+"</email>");
      xml.append("<permission>"+permissao+"</permission>");

      xml.append("</project>");
      return xml.toString();
    }

}
