package com.example.project_02;


public class HWRepo {
    private HWDAO hwDAO;

    public HWRepo(HWDAO hwDAO) {
        this.hwDAO = hwDAO;
    }

    public void insertHW(HW hw) {
        hwDAO.insert(hw);
    }
}
