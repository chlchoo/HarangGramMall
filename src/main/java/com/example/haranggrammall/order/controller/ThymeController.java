package com.example.haranggrammall.order.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThymeController {
    @RequestMapping("/")
    String indexPage(Model model){
        Board board = new Board(1, "테스트 제목", "최지연2");
        model.addAttribute("board", board);
        return "board/index";
    }
}
