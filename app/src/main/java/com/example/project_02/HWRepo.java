package com.example.project_02;


public class HWRepo {
    private HWDAO HWDAO;

    public HWRepo(HWDAO hwDAO) {
        this.HWDAO = hwDAO;
    }

    public void insertHW(HW hw) {
        HWDAO.insert(hw);
    }
}