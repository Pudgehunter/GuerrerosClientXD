package co.domi.guerrerosclientxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.gson.Gson;

import co.domi.guerrerosclientxd.model.Movimiento;

public class Control extends AppCompatActivity {

    Button abajoBtn, arribaBtn, izquierdaBtn, derechaBtn, atacarBtn;
    int posX,posY;
    private TCPClient tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        tcp = TCPClient.getInstance();
        tcp.start();

        arribaBtn = findViewById(R.id.arribaBtn);
        abajoBtn = findViewById(R.id.abajoBtn);
        izquierdaBtn = findViewById(R.id.izquierdaBtn);
        derechaBtn = findViewById(R.id.derechaBtn);
        atacarBtn = findViewById(R.id.atacarBtn);





        arribaBtn.setOnClickListener(
                (v) -> {
                    Gson gson = new Gson();
                    Movimiento perso = new Movimiento("arriba",0,100);
                    String json = gson.toJson(perso);
                    tcp.Message(json);
                }
        );

        abajoBtn.setOnClickListener(
                (v) -> {
                    Gson gson = new Gson();
                    Movimiento perso = new Movimiento("abajo",0,100);
                    String json = gson.toJson(perso);
                    tcp.Message(json);
                }
        );

        izquierdaBtn.setOnClickListener(
                (v) -> {
                    Gson gson = new Gson();
                    Movimiento perso = new Movimiento("izquierda",100,0);
                    String json = gson.toJson(perso);
                    tcp.Message(json);
                }
        );

        derechaBtn.setOnClickListener(
                (v) -> {
                    Gson gson = new Gson();
                    Movimiento perso = new Movimiento("derecha",100,0);
                    String json = gson.toJson(perso);
                    tcp.Message(json);
                }
        );

        atacarBtn.setOnClickListener(
                (v) -> {
                    Gson gson = new Gson();
                    Movimiento perso = new Movimiento("atacar",0,0);
                    String json = gson.toJson(perso);
                    tcp.Message(json);
                }
        );
    }
}