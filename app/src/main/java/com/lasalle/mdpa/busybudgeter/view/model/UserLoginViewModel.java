package com.lasalle.mdpa.busybudgeter.view.model;

import android.util.Log;

import com.lasalle.mdpa.busybudgeter.manager.UserManager;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserLoginViewModel {

    private UserManager userManager;

    public UserLoginViewModel(UserManager userManager) {
        this.userManager = userManager;
    }

    public void OnLoginUser(String username, String password) throws IllegalArgumentException {

        try {
            byte[] bytesOfMessage = password.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);

            String passwordMd5 = String.format("%032x", new BigInteger(1, thedigest));

            userManager.LoginUser(username, passwordMd5);
        } catch (Exception e) {
            Log.e(this.getClass().getName(), "Error login user", e);
        }
    }
}
