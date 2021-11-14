package com.example.movies.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movies.databinding.FragmentDataBinding;

public class DataFragment extends Fragment {

    FragmentDataBinding binding;

    HomeViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDataBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        getDetail();
    }

    private void getDetail() {
        binding.image.setImageResource(viewModel.getModel().getImage());
        binding.title.setText(viewModel.getModel().getTitle());
        binding.description.setText(viewModel.getModel().getDescription());
    }
}