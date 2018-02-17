package com.lasalle.mdpa.busybudgeter.view.model;

import com.lasalle.mdpa.busybudgeter.manager.UserManager;

public class UserLoginViewModel {

    private UserManager userManager;

    public UserLoginViewModel(UserManager userManager) {
        this.userManager = userManager;
    }

    public void OnLoginUser(String username, String password) {

    }
}
