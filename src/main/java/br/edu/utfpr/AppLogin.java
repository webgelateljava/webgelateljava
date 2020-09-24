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
      xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
      xml.append("<project xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");

      xml.append("<email>"+email+"</email>\n");
      xml.append("<permission>"+permissao+"</permission>\n");

      xml.append("</project>");
      return xml.toString();
    }

}
