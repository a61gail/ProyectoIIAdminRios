package com.example.proyectoiiadminrios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button btnVenta, btnContacto, btnProdcutosServicios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia onCreate
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //integración de xml a Java
        btnVenta=findViewById(R.id.btnVenta);
        //evento para abrir la nueva ventana
        btnVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirVenta = new Intent(getApplicationContext(), Venta.class) ;
                startActivity(abrirVenta);
            }
        });
        btnContacto=findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirContacto = new Intent(getApplicationContext(), Contacto.class) ;
                startActivity(abrirContacto);
            }
        });
        btnProdcutosServicios=findViewById(R.id.btnProductosServicios);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirProductosServicios = new Intent(getApplicationContext(), Producto.class) ;
                startActivity(abrirProductosServicios);
            }
        });
    }//termina método onCreate
}//termina clase