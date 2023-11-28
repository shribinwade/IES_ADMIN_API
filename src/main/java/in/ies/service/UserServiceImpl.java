package in.ies.service;

import in.ies.bindings.DashboardCards;
import in.ies.bindings.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String login(LoginForm loginForm) {
        return null;
    }

    @Override
    public String recoverPwd(String email) {
        return null;
    }

    @Override
    public DashboardCards fetchDashboardInfo() {
        return null;
    }
}
