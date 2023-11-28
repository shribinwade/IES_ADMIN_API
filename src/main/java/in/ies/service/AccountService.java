package in.ies.service;

import in.ies.bindings.UnlockAccForm;
import in.ies.bindings.UserAccForm;

import java.util.List;

public interface AccountService {

    public boolean createUserAccount(UserAccForm accForm);

    public List<UserAccForm> fetchUserAccounts();

    public UserAccForm  getUserByAccId(Integer accId);

    public String changeAccStatus(Integer accId,String status);

    public String unlockUserAccount(UnlockAccForm unlockAccForm);
}
