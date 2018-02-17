package com.lasalle.mdpa.busybudgeter;

import com.lasalle.mdpa.busybudgeter.view.model.UserLoginViewModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UserLoginViewModelTest {

    private UserLoginViewModel userLoginViewModel;

    @Before
    public void setupUserLoginViewModel() {
        userLoginViewModel = new UserLoginViewModel();
    }

    @Test
    public void checkUserNameIsForwardedProperly() throws Exception {
        userLoginViewModel.OnLoginUser("test","123456");
        assertEquals("test",????);
    }
}