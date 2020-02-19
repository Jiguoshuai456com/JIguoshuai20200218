package com.bw.jiguoshuai20200218.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), getViewID(), null);
        getInitView(view);
        getData();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    protected abstract int getViewID();

    protected abstract void getInitView(View view);

    protected abstract void getData();
}
