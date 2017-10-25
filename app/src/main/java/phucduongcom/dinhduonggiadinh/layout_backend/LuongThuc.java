package phucduongcom.dinhduonggiadinh.layout_backend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import phucduongcom.dinhduonggiadinh.R;

/**
 * Created by phucd on 10/21/2017.
 */

public class LuongThuc extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luong_thuc);
        Button btnBack = (Button) findViewById(R.id.btn_back_luong_thuc);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LuongThuc.this, Layout3.class);
                startActivity(intent);
            }
        });
    }
}
