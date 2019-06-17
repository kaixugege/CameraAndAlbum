package com.xugege.cameraandalbum;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ContentActivity extends AppCompatActivity {
    public final int REQUEST_CODE_GET_PIC_URI = 0X12;
    private static final int CHOOSE_PICTURE = 4;
    private static final int PICK_PICTURE_REQUESTCODE = 111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

    }
    private void pickPicture() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setDataAndType(MediaStore.Images.Media.INTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, PICK_PICTURE_REQUESTCODE);
    }
    public void openAlbum(View view) {
//        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//        intent = new Intent(Intent.ACTION_PICK);
//        intent.setType("image/*");
//        startActivityForResult(intent, REQUEST_CODE_GET_PIC_URI);


//        Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,"image/*");
//        startActivityForResult(intent, CHOOSE_PICTURE);
        pickPicture();

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
                    Log.e(this.getClass().getSimpleName(), "REQUEST_CODE_GET_PIC_URI  onActivityResult: uri:" + uri.toString());
                    Toast.makeText(this, "REQUEST_CODE_GET_PIC_URI  " + uri.toString(), Toast.LENGTH_LONG).show();
                    break;
                case CHOOSE_PICTURE:
                    Uri uris = data.getData();
                    Log.e(this.getClass().getSimpleName(), "CHOOSE_PICTURE  onActivityResult: uri:" + uris.toString());
                    Toast.makeText(this, "CHOOSE_PICTURE  " + uris.toString(), Toast.LENGTH_LONG).show();
                    break;
                case PICK_PICTURE_REQUESTCODE:
                    Uri uriss = data.getData();
                    Log.e(this.getClass().getSimpleName(), "PICK_PICTURE_REQUESTCODE  onActivityResult: uri:" + uriss.toString());
                    Toast.makeText(this, "PICK_PICTURE_REQUESTCODE  " + uriss.toString(), Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
