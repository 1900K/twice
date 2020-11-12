package com.hkd.Test;

import com.hkd.po.Account;
import com.hkd.repository.AccountRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = ResolverUtil.Test.class.getClassLoader().getResourceAsStream("cofig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        //添加对象
//        Account account = new Account("李四","123","24");
//        int result = accountRepository.save(account);
//        sqlSession.commit();

//        //查寻对象findAll
        List<Account> list = accountRepository.findAll();
        for(Account account:list){
            System.out.println(account);
        }
        sqlSession.close();

        //查寻对象findById 1
//        Account account = accountRepository.findById(3L);
//        System.out.println(account);
//        sqlSession.close();

//        //查询对象findById 2
//        Account account = new Account();
//        account.setPassword("17");
//
//        sqlSession.close();


        //更改对象
//        Account account = accountRepository.findById(2);
//        account.setUsername("小黑");
//        account.setPassword("1234567");
//        account.setAge("27");
//        int result = accountRepository.update(account);
//        sqlSession.commit();
//        System.out.println(result);
//        sqlSession.close();

        //删除对象
//        int result = accountRepository.deleteById(1L);
//        sqlSession.commit();
//        System.out.println(result);
//        sqlSession.close();

    }
}
