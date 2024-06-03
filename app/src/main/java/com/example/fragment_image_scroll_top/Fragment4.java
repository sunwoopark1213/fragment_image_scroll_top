package com.example.fragment_image_scroll_top;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4, container, false);

        // 라디오 버튼 사용
        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = view.findViewById(checkedId);
                if (checkedId == R.id.radioButton1) {
                    // Option 1 선택 시 흰색 배경으로 변경
                    view.setBackgroundColor(getResources().getColor(android.R.color.white));
                } else if (checkedId == R.id.radioButton2) {
                    // Option 2 선택 시 빨간색 배경으로 변경
                    view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }
                Toast.makeText(getActivity(), radioButton.getText() + " selected", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
