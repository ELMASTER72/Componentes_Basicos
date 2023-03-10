package com.ELMASTER72.componentesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miboton: Button = findViewById(R.id.btn_send)
        miboton.setOnClickListener{ onClick() }
        val michange: Switch = findViewById(R.id.btn_end)
        michange.setOnClickListener{color_interface()}

    }
    private fun onClick(){
        val campoTexto: EditText =findViewById(R.id.editTextTextPersonName)
        val nombre: String = campoTexto.text.toString()
        val migroup: RadioGroup =findViewById(R.id.radioGroup)
        val miopcion1: RadioButton =findViewById(R.id.radioButton2)
        val miopcion2: RadioButton =findViewById(R.id.radioButton3)
        val checkBox1: CheckBox =findViewById(R.id.checkBox)
        val checkBox2: CheckBox =findViewById(R.id.checkBox2)
        val mitoggle: ToggleButton =findViewById(R.id.toggleButton)
        val miswitch: Switch =findViewById(R.id.switch1)


        var texto = "Bienvenido $nombre \n"

        if (miopcion1.id == migroup.checkedRadioButtonId){
            texto += "pulso la opcion ${miopcion1.text}\n"
        }
        if (miopcion2.id == migroup.checkedRadioButtonId) {
            texto += "pulso la opcion ${miopcion2.text}\n"
        }
        if (checkBox1.isChecked){
            texto += "Pulso el check ${checkBox1.text}\n"
        }
        if (checkBox2.isChecked){
            texto += "Pulso el check ${checkBox2.text}\n"
        }
        if (miswitch.isChecked){
            texto +="Esta switch prendido \n"
        }else{
            texto +="Esta switch apagado \n"
        }
        texto += "El toggle ${mitoggle.text}"

        Toast.makeText(this, "$texto", Toast.LENGTH_SHORT).show()

        val  campobienvenida: TextView=findViewById(R.id.txtname)
        campobienvenida.text="Bienvenido ${nombre}"
    }

    private fun color_interface(){
        val color: Switch = findViewById(R.id.btn_end)
        if (color.isChecked){
            val body: ConstraintLayout=findViewById(R.id.body)
            body.setBackgroundColor(getColor(R.color.teal_700))
        }else{
            val body: ConstraintLayout=findViewById(R.id.body)
            body.setBackgroundColor(getColor(R.color.white))
        }
    }
}



