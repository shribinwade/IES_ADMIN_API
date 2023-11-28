package in.ies.service;

import in.ies.bindings.UnlockAccForm;
import in.ies.bindings.UserAccForm;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public boolean createUserAccount(UserAccForm accForm) {
        return false;
    }

    @Override
    public List<UserAccForm> fetchUserAccounts() {
        return null;
    }

    @Override
    public UserAccForm getUserByAccId(Integer accId) {
        return null;
    }

    @Override
    public String changeAccStatus(Integer accId, String status) {
        return null;
    }

    @Override
    public String unlockUserAccount(UnlockAccForm unlockAccForm) {
        return null;
    }
}
