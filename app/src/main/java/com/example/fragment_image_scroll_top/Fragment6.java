package com.example.fragment_image_scroll_top;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment6 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment6, container, false);

        // 텍스트 뷰 사용
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("Hello, this is a TextView in Fragment6!");

        return view;
    }
}
