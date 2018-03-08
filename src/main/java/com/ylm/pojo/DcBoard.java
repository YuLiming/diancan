package com.ylm.pojo;

public class DcBoard {
    private Integer boardId;

    private String boardName;

    private Integer boardPeopleNumber;

    private Integer boardType;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public Integer getBoardPeopleNumber() {
        return boardPeopleNumber;
    }

    public void setBoardPeopleNumber(Integer boardPeopleNumber) {
        this.boardPeopleNumber = boardPeopleNumber;
    }

    public Integer getBoardType() {
        return boardType;
    }

    public void setBoardType(Integer boardType) {
        this.boardType = boardType;
    }
}