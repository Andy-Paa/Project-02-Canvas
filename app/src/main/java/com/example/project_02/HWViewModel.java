package com.example.project_02;


import androidx.lifecycle.ViewModel;

public class HWViewModel extends ViewModel {
    private HWRepo hwRepo;

    public HWViewModel(HWRepo hwRepo) {
        this.hwRepo = hwRepo;
    }

    public void insertHw(HW hw) {
        hwRepo.insertHW(hw);
    }

}