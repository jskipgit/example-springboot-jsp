package com.ironyard.services;

import com.ironyard.data.Match;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jasonskipper on 2/1/17.
 */
public interface MatchRepo extends CrudRepository<Match, Long>{
}
