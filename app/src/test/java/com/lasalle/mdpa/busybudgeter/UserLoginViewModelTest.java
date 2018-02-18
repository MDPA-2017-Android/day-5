package com.lasalle.mdpa.busybudgeter;

import com.lasalle.mdpa.busybudgeter.manager.UserManager;
import com.lasalle.mdpa.busybudgeter.view.model.UserLoginViewModel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserLoginViewModelTest {

    private UserLoginViewModel userLoginViewModel;

    @Mock
    private UserManager userManager;

    @Before
    public void setupUserLoginViewModel() {
        userLoginViewModel = new UserLoginViewModel(userManager);
    }

    @Test
    public void checkUserNameIsForwardedProperly() throws Exception {
        userLoginViewModel.OnLoginUser("test","123456");

        verify(userManager, times(1)).LoginUser(eq("test"), anyString());
    }

    @Test
    public void checkPasswordForwardedIsMd5Encrypted() throws Exception {
        userLoginViewModel.OnLoginUser("test","123456");
        verify(userManager, times(1)).LoginUser(anyString(), eq("e10adc3949ba59abbe56e057f20f883e"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkUserNameAndPasswordAreNotNull() throws Exception {
        userLoginViewModel.OnLoginUser(null, null);
    }

}