package com.javatpoint.bma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.bma.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>
{

}
