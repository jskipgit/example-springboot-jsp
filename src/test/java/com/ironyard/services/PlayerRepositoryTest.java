package com.ironyard.services;

import com.ironyard.data.Match;
import com.ironyard.data.Player;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jasonskipper on 2/1/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PlayerRepositoryTest {

    @Autowired
    PlayerRepository myRepo;

    @Autowired
    MatchRepo myMatchReop;

    @Test
    public void testSavePlayer(){
        Player tmp = new Player();
        tmp.setEmail("skipper.jason@gmail.com");
        tmp.setLevel("Fun");
        tmp.setName("jason skipper");
        myRepo.save(tmp);

        Player found = myRepo.findOne(tmp.getId());
        Assert.assertEquals(tmp.getName(), found.getName());
    }

    @Test
    public void testSaveMatch(){
        Match m = new Match();
        m.setLoserName("you");
        m.setWinnerName("me");
        m.setLoserScore(0);
        m.setWinnerScore(100);
        myMatchReop.save(m);
    }

}