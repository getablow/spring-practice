package org.zerock.springex1.service;

import org.zerock.springex1.dto.PageRequestDTO;
import org.zerock.springex1.dto.PageResponseDTO;
import org.zerock.springex1.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    //List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);

}
