package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Mick Jagger on 5/6/2017.
 */
// complete (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
// complete (3) In res->xml create a file called pref_visualizer
// complete (4) In pref_visualizer create a preference screen containing a single check box preference
// This check box preference should have a default value of true, the key 'show_bass', a
// summaryOff of Hidden, a summaryOn of Shown and a title of 'Show Bass'

public class SettingsFragment extends PreferenceFragmentCompat{
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
