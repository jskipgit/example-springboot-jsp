package com.ironyard.services;

import com.ironyard.data.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jasonskipper on 2/1/17.
 */
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
