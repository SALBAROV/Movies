package com.example.movies.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movies.R;
import com.example.movies.adapters.MoviesAdapter;
import com.example.movies.databinding.FragmentHomeBinding;
import com.example.movies.models.MoviesModels;
import com.example.movies.utils.OnItemClickListener;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    HomeViewModel viewModel;
    MoviesAdapter adapter = new MoviesAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        binding.recycler.setAdapter(adapter);
        clickBtn();
        observe();
        itemClickListener();
    }

    private void itemClickListener() {
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void setOnClickListener(int position) {
                viewModel.position = position;
                NavController navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView);
                navController.navigate(R.id.action_homeFragment_to_dataFragment);
            }
        });
    }

    private void observe() {
        viewModel.mutableLiveData.observe(getViewLifecycleOwner(), new Observer<ArrayList<MoviesModels>>() {
            @Override
            public void onChanged(ArrayList<MoviesModels> moviesModels) {
                adapter.addList(moviesModels);
                binding.btnAdd.setVisibility(View.GONE);
            }
        });
    }

    private void clickBtn() {
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addList();
                binding.btnAdd.setVisibility(View.GONE);
            }
        });
    }
}