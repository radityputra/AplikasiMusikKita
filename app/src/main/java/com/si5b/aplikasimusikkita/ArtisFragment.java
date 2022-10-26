package com.si5b.aplikasimusikkita;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ArtisFragment extends {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    public ArtisFragment() {

        public static ArtisFragment newInstance(String param1, String param2) {
            ArtisFragment fragment = new ArtisFragment();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
    }
}
        @Override
        public View onCreateView(LayoutInflater inflater,
                ViewGroup container,
                Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fragment_artis,
                    container, false);
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            Button btnToast;
            btnToast = view.findViewById(R.id.btn_toast);
            btnToast.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Ini adalah
                            Fragment Artis", Toast.LENGTH_SHORT).show();
                }
            });



