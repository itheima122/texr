package co.itcast.service;

import co.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户xx
     * @param account
     */
    public void saveAccount(Account account);
}
