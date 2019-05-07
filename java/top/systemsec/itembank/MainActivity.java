package top.systemsec.itembank;

import android.os.Bundle;

import top.systemsec.itembank.base.MVPBaseActivity;

public class MainActivity extends MVPBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLoading("loading");
    }
}
