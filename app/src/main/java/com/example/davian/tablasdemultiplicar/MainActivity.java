package com.example.davian.tablasdemultiplicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Creación de la clase MainActivity la cual extiende de AppCompatActivity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Se declara un TextView llamado tablas.
     */
    TextView tablas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Se Asigna el layout activity_main a la clase formando una actividad.
         */
        setContentView(R.layout.activity_main);

        /**
         * Se crea un instancia de tablas que hace referencia al textview declarado en el archivo xml.
         */
        tablas=(TextView)findViewById(R.id.txtTablas);
    }

    /**
     * Esta función permite realizar la tabla de multiplicacion del 1
     * será invocada cuando el boton sea clickeado
     * @param view : es esencial que la funcion reciba este parametro cuando el boton
     *             ejecute la propiedad android:onclick...
     *
     *             Si no se recibe un vista saldra error.
     */
    public void multiplicacion(View view){
        /**
         * Se crea un ciclo for que permite hacer el reccorido de 1 hasta 10.
         */
        for(int i=1;i<=10;i++){
            tablas.append(1+" * "+i+" = "+(i*1)+"\n");
        }
    }
}
