package com.green.board2;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper2 {
    int insBoard2(Board2Entity entity);
    List<Board2Entity> selBoardAll();
    int upBoard2(Board2Entity entity);
    int delBoard2(Board2Entity entity);
    Board2Entity selBoardById(Board2Entity entity);



}
