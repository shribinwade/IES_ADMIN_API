package in.ies.service;

import in.ies.bindings.DashboardCards;
import in.ies.bindings.LoginForm;

public interface UserService {

     public String login(LoginForm loginForm);

     public String recoverPwd(String email);

     public DashboardCards fetchDashboardInfo();
}
