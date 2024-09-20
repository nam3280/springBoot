package com.ssg.sb01.Service;

import com.ssg.sb01.dto.BoardDTO;

public interface BoardService{
    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
}
