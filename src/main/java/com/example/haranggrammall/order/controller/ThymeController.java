package com.example.haranggrammall.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;


@Controller
public class ThymeController {

    private List<Board> boards = Arrays.asList();

    @RequestMapping("/")
    String indexPage(Model model){
        Board board = new Board(1, "테스트 제목", "최지연2");
        model.addAttribute("board", board);
        return "board/index";
    }

    @PostMapping
    @ResponseBody
    List<Board>  addPost(Board board) {
        return boards;
    }
}
