package playlagom.sharelocation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import playlagom.sharelocation.R;

/**
 * Created by User on 5/11/2018.
 */

public class FriendsFragment extends Fragment {

    public FriendsFragment() {

    }

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.friends_fragment, container, false);
        return view;
    }
}
