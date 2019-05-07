package top.systemsec.itembank.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import top.systemsec.itembank.R;
import top.systemsec.itembank.util.DensityUtil;

public class AppProgressBar extends Dialog {

    private ImageView mImageView;
    private String mHintStr;
    private TextView mHintTextView;//提醒文本

    public AppProgressBar(Context context, String hintStr) {
        super(context, R.style.DialogBackgroundNull);
        mHintStr = hintStr;//提醒文本
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_app_progress);

        initView();
        initLayout();
        initData();

        setCancelable(false);//不能取消
    }

    /**
     * 初始化view
     */
    private void initView() {
        mHintTextView = findViewById(R.id.hintText);
        mImageView = findViewById(R.id.imageView);//图片
    }

    /**
     * 初始化布局
     */
    private void initLayout() {
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();

        window.setLayout(DensityUtil.dipToPx(130),
                WindowManager.LayoutParams.WRAP_CONTENT);

        layoutParams.x = 0;
        layoutParams.y = -DensityUtil.dipToPx(20);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        mHintTextView.setText(mHintStr);
        Glide.with(getContext()).load(R.raw.loading).into(mImageView);
    }


    /**
     * 设置提醒文本
     */
    public void setHintText(String hint) {
        if (mHintTextView != null)
            mHintTextView.setText(hint);
    }

}
