package br.ufms.facom.contactsapp.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Contact implements Serializable {
    String name, email, username, password;
    int id;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String usuario) {
        this.username = usuario;
    }
    public String getSenha() {
        return password;
    }
    public void setSenha(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return getId() +" "+getUsername().toString()+": email: "+getEmail().toString();
    }

    public String Criptografia(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest alg = MessageDigest.getInstance("SHA-256");
        byte messageDigest [] = alg.digest(senha.getBytes("UTF-8"));
        return new String(messageDigest);

    }
}