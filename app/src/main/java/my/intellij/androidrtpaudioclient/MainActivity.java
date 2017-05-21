package my.intellij.androidrtpaudioclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected static AudioDecoderThread mAudioDecoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAudioDecoder = new AudioDecoderThread();
        mAudioDecoder.startPlay("rtsp://192.168.1.105:1234");
    }
}