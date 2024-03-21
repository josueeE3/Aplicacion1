package josue.hernandez.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtAño = findViewById<EditText>(R.id.txtAño)
        val btnFecha = findViewById<Button>(R.id.btnFecha)
        val lblNacimiento = findViewById<TextView>(R.id.lblNacimiento)

        val objNaci = fechaHacimiento()

        btnFecha.setOnClickListener {
            val resul =objNaci.fecha(txtAño.text.toString().toInt())

        }




    }
}