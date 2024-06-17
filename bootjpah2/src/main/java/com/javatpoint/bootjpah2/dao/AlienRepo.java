package com.javatpoint.bootjpah2.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.bootjpah2.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
