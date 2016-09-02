package com.qf.geolei.day21toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //将原来的title不显示
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        //requestWindowFeature(R.id.toolbar);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);





        //设置主标题和副标题的内容和颜色

        toolbar.setTitle("大话西游");
        toolbar.setSubtitle("周星驰");

        toolbar.setTitleTextColor(Color.BLUE);
        toolbar.setSubtitleTextColor(Color.GREEN);

        //设置导航图片
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);

        toolbar.setLogo(R.mipmap.ic_launcher);


        setSupportActionBar(toolbar);//最后才加  要记得
        //使用现有的toolBar来替换actionBar

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
