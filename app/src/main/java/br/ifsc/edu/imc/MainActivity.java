package br.ifsc.edu.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    List<Integer> lista_imagens;
    int posicaoImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        lista_imagens = Arrays.asList(
                R.drawable.cachorro,
                R.drawable.gardem,
                R.drawable.happy,
                R.drawable.patinho);
        posicaoImage = 0;
    }

    public void mudafoto(View view) {
        if (posicaoImage < lista_imagens.size() - 1) {
            imageView.setImageResource(lista_imagens.get(posicaoImage));
        } else {
            posicaoImage = 0;
            imageView.setImageResource(lista_imagens.get(posicaoImage));
        }
        posicaoImage++;

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

