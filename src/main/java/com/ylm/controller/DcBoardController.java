package com.ylm.controller;


import com.ylm.common.BaseResult;
import com.ylm.common.InfoConstant;
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
        try{
            List<DcBoard> list = dcBoardService.selectByExample(null);
            for (DcBoard dcBoard : list){
                if (dcBoard.getBoardIsdel()==0){
                    result.add(dcBoard);
                }
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/selectBoard")
    @ResponseBody
    public DcBoard selectBoard(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id ){
        DcBoard dcBoard = null;
        try {
            dcBoard = dcBoardService.selectByPrimaryKey(id);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return dcBoard;
    }

    @RequestMapping("/editBoardSubmit")
    @ResponseBody
    public Object editBoardSubmit(@ModelAttribute DcBoard board){
        try{
            board.setBoardIsdel(0);
            return dcBoardService.updateByPrimaryKey(board)>0?
                    new BaseResult(true,InfoConstant.UPDATESUCCESS):
                    new BaseResult(false,InfoConstant.UPDATEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false, InfoConstant.BOARDTHROWABLE);
        }
    }

    @RequestMapping("/deleteBoard")
    @ResponseBody
    public Object deleteBoard(@RequestParam(value = "id",required = false,defaultValue = "1")Integer id){
        try {
            return dcBoardService.deleteByPrimaryKey(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.BOARDTHROWABLE);
        }

    }


    @RequestMapping("/newBoardSubmit")
    @ResponseBody
    public Object newBoardSubmit(DcBoard dcBoard){
        try {
            dcBoard.setBoardIsdel(0);
            return dcBoardService.insert(dcBoard)>0?
                    new BaseResult(true,InfoConstant.INSERTSUCCESS):
                    new BaseResult(false,InfoConstant.INSERTFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.BOARDTHROWABLE);
        }

    }

    @RequestMapping("/deleteBoards")
    @ResponseBody
    public Object deleteBoards(@RequestParam("id[]") List<Integer> id){
        try {
            return dcBoardService.deleteByPrimaryKeys(id)>0?
                    new BaseResult(true,InfoConstant.DELETESUCCESS):
                    new BaseResult(false,InfoConstant.DELETEFAIL);
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return new BaseResult(false,InfoConstant.BOARDTHROWABLE);
        }

    }

}
