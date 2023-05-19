package com.green.board2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class Board2Service {
    private final BoardMapper2 mapper;


    @Autowired
    public Board2Service(BoardMapper2 mapper){this.mapper = mapper;}


    public int insBoard2(Board2Entity entity) {
        System.out.println("service - insBoard2");
        return mapper.insBoard2(entity);
    }


    public List<Board2Entity> selBoardAll(){return mapper.selBoardAll();}


    public int upBoard2(Board2Entity entity){
        System.out.println("service - upBoard2");
        return mapper.upBoard2(entity);
    }

    public int delBoard2(Board2Entity entity){
        System.out.println("service - delBoard2");
        return mapper.delBoard2(entity);
    }
    public Board2Entity selBoardById(Board2Entity entity){
        return mapper.selBoardById(entity);
    }



}
