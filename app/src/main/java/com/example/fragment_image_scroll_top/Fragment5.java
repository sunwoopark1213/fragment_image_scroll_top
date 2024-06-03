package com.example.fragment_image_scroll_top;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment5 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment5, container, false);

        // 리스트 뷰 사용
        ListView listView = view.findViewById(R.id.listView);
        final ImageView imageView = view.findViewById(R.id.imageView);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            switch (position) {
                case 0:
                    imageView.setImageResource(R.drawable.sample_image); // sample_image 1
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.sample_image2); // sample_image 2
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.sample_image3); // sample_image 3
                    break;
            }
        });

        return view;
    }
}
