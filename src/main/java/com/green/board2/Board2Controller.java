package com.green.board2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board2")
public class Board2Controller {
    private Board2Service service;

    @Autowired
    public Board2Controller(Board2Service service){this.service = service;}



    @PostMapping
    public int boardPost(@RequestBody Board2Entity entity){
        System.out.println(entity);
        return service.insBoard2(entity);
    }

    @GetMapping
    public List<Board2Entity> boardGetAll(){return service.selBoardAll();}

    @PutMapping
    public int boardPut(@RequestBody Board2Entity entity){
        System.out.println(entity);
        return service.upBoard2(entity);
    }

    @DeleteMapping("/{iboard}")
    public int boardDel(@PathVariable int iboard){
        Board2Entity entity = new Board2Entity();
        entity.setIboard(iboard);
        System.out.println(iboard);
        return service.delBoard2(entity);
    }

    @GetMapping("/{iboard}")
    public Board2Entity selBoardById(@PathVariable int iboard){
        Board2Entity entity = new Board2Entity();
        entity.setIboard(iboard);
        return service.selBoardById(entity);
    }

}

