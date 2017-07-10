package net.elephenapp.mcoffee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Bowon on 10/7/2560.
 */

public class MainFragment extends Fragment{

    public static MainFragment mainInstant(){
        MainFragment mainFragment = new MainFragment();
        Bundle bubdle = new Bundle();
        mainFragment.setArguments(bubdle);
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_layout, container, false);
        return view;
    }
}   //Main Class
