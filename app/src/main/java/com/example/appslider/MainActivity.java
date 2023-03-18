package com.example.appslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;


public class MainActivity extends AppCompatActivity {
    // Se declarám los objetos a necesitar.
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se establecen las referencias del viewPager
        viewPager = findViewById(R.id.viewPager);
        // Se trae la clase donde se almacenan los datos
        myadapter = new SlideAdapter(this);
        // se muestra el adapter en el viewPager.
        viewPager.setAdapter(myadapter);
        // Se referencia el circulo del image slider
        CircleIndicator circulo_imagen = findViewById(R.id.indicator);
        // Se le añade para que se muestre en el viewpager.
        circulo_imagen.setViewPager(viewPager);
    }
}
