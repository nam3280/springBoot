package com.ssg.sb01.repository;

import com.ssg.sb01.domain.Board;
import com.ssg.sb01.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Log4j2
public class BoardServiceTest {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void registerTest(){
        BoardDTO boardDTO = BoardDTO.builder().
                            title("ssg").
                            content("content").
                            writer("123").build();
        Board board = modelMapper.map(boardDTO, Board.class);
        Long bno = boardRepository.save(board).getBno();
        log.info(bno);
    }

    @Test
    public void modifyTest(){
        BoardDTO boardDTO = BoardDTO.builder().
                title("ssg").
                content("content").
                build();
        Optional<Board> result = boardRepository.findById(1L);
        Board board = result.orElseThrow();
        board.change(boardDTO.getTitle(), boardDTO.getContent());
        boardRepository.save(board);
    }
}
