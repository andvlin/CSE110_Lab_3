package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.andy.lab3.MainActivity;
import com.example.andy.lab3.R;

/**
 * Created by Andy on 4/19/16.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_Test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }
}
