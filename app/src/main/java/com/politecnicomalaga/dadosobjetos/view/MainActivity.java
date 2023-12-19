package com.politecnicomalaga.dadosobjetos.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.politecnicomalaga.dadosobjetos.R;
import com.politecnicomalaga.dadosobjetos.control.Controlador;


public class MainActivity extends AppCompatActivity {
    private Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador = Controlador.getSingleton();

    }
    public void playGame(View view) {

        String texto=controlador.ganador();

        TextView resultado = findViewById(R.id.tvLabelResultadoPartida);
        resultado.setText(texto);

        TextView j1d1 = findViewById(R.id.tvLabelJ1D1);
        j1d1.setText("J1 Dado 1:" + controlador.getD1J1());

        TextView j1d2 = findViewById(R.id.tvLabelJ1D2);
        j1d2.setText("J1 Dado 2:" + controlador.getD2J1());

        TextView j1d3 = findViewById(R.id.tvLabelJ1D3);
        j1d3.setText("J1 Dado 3:" + controlador.getD3J1());

        TextView j2d1 = findViewById(R.id.tvLabelJ2D1);
        j2d1.setText("J2 Dado 1:" + controlador.getD1J2());

        TextView j2d2 = findViewById(R.id.tvLabelJ2D2);
        j2d2.setText("J2 Dado 2:" + controlador.getD2J2());

        TextView j2d3 = findViewById(R.id.tvLabelJ2D3);
        j2d3.setText("J2 Dado 3:" + controlador.getD3J2());

        TextView j3d1 = findViewById(R.id.tvLabelJ3D1);
        j3d1.setText("J3 Dado 1:" + controlador.getD1J3());

        TextView j3d2 = findViewById(R.id.tvLabelJ3D2);
        j3d2.setText("J3 Dado 2:" + controlador.getD2J3());

        TextView j3d3 = findViewById(R.id.tvLabelJ3D3);
        j3d3.setText("J3 Dado 3:" + controlador.getD3J3());

        TextView j1gan = findViewById(R.id.tvLabelGanadaJ1);
        j1gan.setText("J1 Ganadas:" + controlador.getGanadaJ1());

        TextView j2gan = findViewById(R.id.tvLabelGanadaJ2);
        j2gan.setText("J2 Ganadas:" + controlador.getGanadaJ2());

        TextView j3gan = findViewById(R.id.tvLabelGanadaJ3);
        j3gan.setText("J3 Ganadas:" + controlador.getGanadaJ3());

        TextView j1per = findViewById(R.id.tvLabelPerdidoJ1);
        j1per.setText("J1 Perdidas:" + controlador.getDerrotaJ1());

        TextView j2per = findViewById(R.id.tvLabelPerdidoJ2);
        j2per.setText("J2 Perdidas:" + controlador.getDerrotaJ2());

        TextView j3per = findViewById(R.id.tvLabelPerdidoJ3);
        j3per.setText("J3 Perdidas:" + controlador.getDerrotaJ3());

        TextView j1emp = findViewById(R.id.tvLabelEmpateJ1);
        j1emp.setText("J1 Empates:" + controlador.getEmpateJ1());

        TextView j2emp = findViewById(R.id.tvLabelEmpateJ2);
        j2emp.setText("J2 Empates:" + controlador.getEmpateJ2());

        TextView j3emp = findViewById(R.id.tvLabelEmpateJ3);
        j3emp.setText("J3 Empates:" + controlador.getEmpateJ3());
    }
}