package cn.edu.gdmec.a07150847.toast;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"1111",Toast.LENGTH_LONG).show();
    }


    public void b2(View v){
        LayoutInflater li = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = li.inflate(R.layout.toastroot,null);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.clayout);
        li.inflate(R.layout.toastinfo,linearLayout);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.show();

    }


    public void b3(View v){
        Toast toast =Toast.makeText(this,"我是小黄人-图文显示",Toast.LENGTH_LONG);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.yellowman);
        View view = toast.getView();
        linearLayout.addView(imageView);
        linearLayout.addView(view);
        toast.setView(linearLayout);
        toast.show();


    }


}
