/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class Admin {
    
    private int userId;
    private String userName,password;
    
    public Admin(int userId,String userName,String password){
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    
    }
    
    public int getUserId(){
        return userId;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
        
    
}
