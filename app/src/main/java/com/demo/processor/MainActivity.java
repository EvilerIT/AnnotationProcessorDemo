package com.demo.processor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.demo.annotation.DemoAnnotation;

@DemoAnnotation
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}