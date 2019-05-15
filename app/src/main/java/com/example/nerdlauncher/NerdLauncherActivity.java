package com.example.nerdlauncher;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
