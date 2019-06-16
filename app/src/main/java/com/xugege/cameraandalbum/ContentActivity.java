package com.xugege.cameraandalbum;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {
    public final int REQUEST_CODE_GET_PIC_URI = 0X12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

    }

    public void openAlbum(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_CODE_GET_PIC_URI);
    }

    public void openCarmera(View view) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_CODE_GET_PIC_URI:
                    Uri uri = data.getData();
                    Log.e(this.getClass().getSimpleName(), "onActivityResult: uri:" + uri.toString());
                    Toast.makeText(this, "" + uri.toString(), Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
