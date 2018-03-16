package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.pojo.DcBoard;
import com.ylm.service.DcBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class DcBoardController {

    @Autowired
    private DcBoardService dcBoardService;

    @RequestMapping("/getBoard")
    @ResponseBody
    public List<DcBoard> getBoard(){
        List<DcBoard> result = new ArrayList<DcBoard>();
        List<DcBoard> list = dcBoardService.selectByExample(null);
        for (DcBoard dcBoard : list){
            if (dcBoard.getBoardIsdel()==0){
                result.add(dcBoard);
            }
        }
        return result;
    }

    @RequestMapping("/selectBoard")
    @ResponseBody
    public DcBoard selectBoard(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        return dcBoardService.selectByPrimaryKey(id);
    }

    @RequestMapping("/editBoardSubmit")
    @ResponseBody
    public Object editBoardSubmit(@ModelAttribute DcBoard board){
        board.setBoardIsdel(0);
        return dcBoardService.updateByPrimaryKey(board)>0?
                new BaseResult(true,"修改餐桌成功"):
                new BaseResult(false,"修改餐桌失败");
    }

    @RequestMapping("/deleteBoard")
    @ResponseBody
    public Object deleteBoard(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        return dcBoardService.deleteByPrimaryKey(id)>0?new BaseResult(true,"删除餐桌成功"):new BaseResult(false,"删除餐桌失败");
    }


    @RequestMapping("/newBoardSubmit")
    @ResponseBody
    public Object newBoardSubmit(DcBoard dcBoard){
        dcBoard.setBoardIsdel(0);
        return dcBoardService.insert(dcBoard)>0?new BaseResult(true,"新增餐桌成功"):new BaseResult(false,"新增餐桌失败");
    }

    @RequestMapping("/deleteBoards")
    @ResponseBody
    public Object deleteBoards(@RequestParam("id[]") List<Integer> id){
        return dcBoardService.deleteByPrimaryKeys(id)>0?new BaseResult(true,"删除成功"):new BaseResult(false,"删除失败");
    }

}
