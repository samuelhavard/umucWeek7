/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authorization;

import java.sql.Connection;

/**
 *
 * @author Your Name Samuel Havard
 */
public class UserModel {
    private String userName;
    private int authLevel;
    boolean auth;
    Connection conn = null;

    public UserModel(String userName, boolean auth) {
        this.userName = userName;
        this.auth = auth;
    }

    public String getUserName() {
        return userName;
    }

    public int getAuthLevel() {
        return authLevel;
    }
    
    
    
}
