package co.itcast.dao;

import co.itcast.domain.Account;

import java.util.List;

/**
 * 账户的dao接口
 */
public interface AccountDao {

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
