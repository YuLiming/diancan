package com.ylm.controller;


import com.ylm.pojo.DcBoard;
import com.ylm.service.DcBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DcBoardController {

    @Autowired
    private DcBoardService dcBoardService;

    @RequestMapping("/getBoard")
    public String getBoard(Model model){
        model.addAttribute("boards",dcBoardService.selectByExample(null));
        return "getBoards";
    }

    @RequestMapping("/selectBoard")
    public String selectBoard(Model model, @RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        model.addAttribute("board",dcBoardService.selectByPrimaryKey(id));
        return "selectBoard";
    }

    @RequestMapping("/editBoardSubmit")
    public String editBoardSubmit(DcBoard board){
        dcBoardService.updateByPrimaryKey(board);
        return "redirect:getBoard";
    }

    @RequestMapping("/deleteBoard")
    public String deleteBoard(Model model,@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        dcBoardService.deleteByPrimaryKey(id);
        return "redirect:getBoard";
    }

    @RequestMapping("/addBoard")
    public String addBoard(Model model){
        return "addBoard";
    }

    @RequestMapping("/newBoardSubmit")
    public String newBoardSubmit(DcBoard dcBoard){
        dcBoardService.insert(dcBoard);
        return "redirect:getBoard";
    }

}
