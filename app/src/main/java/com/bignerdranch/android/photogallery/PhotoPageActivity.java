package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by larrikin on 2/11/15.
 */
public class PhotoPageActivity extends SingleFragmentActivity{

    @Override
    public Fragment createFragment(){
        return new PhotoPageFragment();
    }
}
