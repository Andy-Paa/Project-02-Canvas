package com.example.project_02;


import android.content.Context;

import androidx.lifecycle.ViewModel;

public class HWViewModel extends ViewModel {
    private HWRepo hwRepo;
    public HWViewModel() {
    }
    public HWViewModel(Context context) {
        CanvasDatabase database = CanvasDatabase.getInstance(context);
        HWDAO hwDAO = database.hwDao();
        hwRepo = new HWRepo(hwDAO);
    }

    public void insertHw(HW hw) {
        if (hwRepo != null) {
            hwRepo.insertHW(hw);
        }
    }
}
