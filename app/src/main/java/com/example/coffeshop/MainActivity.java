package com.example.coffeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int quantity =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pesanLagi = (Button) findViewById(R.id.pesanLagi);
        pesanLagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView nama = (TextView) findViewById(R.id.nama);
                TextView order = (TextView) findViewById(R.id.tv_orderSummary);
                nama.setText("");
                order.setText("");
            }
        });
    }
    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view){
        if(quantity>1) {
            quantity = quantity - 1;
        }else{
            Toast.makeText(this, "Jumlah pesanan tidak boleh kurang dari 1", Toast.LENGTH_SHORT).show();
        }
        displayQuantity(quantity);
    }
    public void submitOrder(View view){
        int harga = calculatePrice();
        String result="Tidak memesan Kopi";
        int jumlah=0;
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        if(checkBox1.isChecked()){
            result = "Black Coffe";
            jumlah=1;
        }
        if(checkBox2.isChecked()){
            result = "White Coffee";
            jumlah=1;
        }
        if(checkBox3.isChecked()){
            result = "Espresso";
            jumlah=1;
        }
        if(checkBox4.isChecked()){
            result = "Latte";
            jumlah=1;
        }
        if(checkBox5.isChecked()){
            result = "Cappucino";
            jumlah=1;
        }
        if(checkBox6.isChecked()){
            result = "Mochaccino";
            jumlah=1;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())){
            result = "Black Coffe dan White Coffe";
            jumlah=2;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())){
            result = "Black Coffe dan Espresso";
            jumlah=2;
        }
        if((checkBox1.isChecked())&&(checkBox4.isChecked())){
            result = "Black Coffe dan Latte";
            jumlah=2;
        }
        if((checkBox1.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffe dan Capuccino";
            jumlah=2;
        }
        if((checkBox1.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffe dan Mochaccino";
            jumlah=2;
        }
        if((checkBox2.isChecked())&&(checkBox3.isChecked())){
            result = "White Coffe dan Espresso";
            jumlah=2;
        }
        if((checkBox2.isChecked())&&(checkBox4.isChecked())){
            result = "White Coffe dan Latte";
            jumlah=2;
        }
        if((checkBox2.isChecked())&&(checkBox5.isChecked())){
            result = "White Coffe dan Capuccino";
            jumlah=2;
        }
        if((checkBox2.isChecked())&&(checkBox6.isChecked())){
            result = "White Coffe dan Mochaccino";
            jumlah=2;
        }
        if((checkBox3.isChecked())&&(checkBox4.isChecked())){
            result = "Espresso dan Latte";
            jumlah=2;
        }
        if((checkBox3.isChecked())&&(checkBox5.isChecked())){
            result = "Espresso dan Capuccino";
            jumlah=2;
        }
        if((checkBox3.isChecked())&&(checkBox6.isChecked())){
            result = "Espresso dan Mochaccino";
            jumlah=2;
        }
        if((checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "Latte dan Cappucino";
            jumlah=2;
        }
        if((checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "Latte dan Mochaccino";
            jumlah=2;
        }
        if((checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Capuccino dan Mochaccino";
            jumlah=2;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())){
            result = "Black Coffee, White Coffee dan Espresso";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox4.isChecked())){
            result = "Black Coffee, White Coffee dan Latte";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, White Coffee dan Capuccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, White Coffee dan Mochaccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())){
            result = "Black Coffee, Espresso dan Latte";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, Espresso dan Capuccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Espresso dan Mochaccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, Latte dan Capuccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Latte dan Mochaccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Capuccino dan Mochaccino";
            jumlah=3;
        }
        if((checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())){
            result = "White Coffee, Espresso dan Latte";
            jumlah=3;
        }
        if((checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox5.isChecked())){
            result = "White Coffee, Espresso dan Capuccino";
            jumlah=3;
        }
        if((checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox6.isChecked())){
            result = "White Coffee, Espresso dan Mochaccino";
            jumlah=3;
        }
        if((checkBox2.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "White Coffee, Latte dan Capuccino";
            jumlah=3;
        }
        if((checkBox2.isChecked())&&(checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "White Coffee, Latte dan Mochaccino";
            jumlah=3;
        }
        if((checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "Espresso, Latte dan Capuccino";
            jumlah=3;
        }
        if((checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "Espresso, Latte dan Mochaccino";
            jumlah=3;
        }
        if((checkBox3.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Espresso, Capuccino dan Mochaccino";
            jumlah=3;
        }
        if((checkBox4.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Latte, Capuccino dan Mochaccino";
            jumlah=3;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())){
            result = "Black Coffee, White Coffee, Espresso dan Late";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, White Coffee, Espresso dan Capuccino";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, White Coffee, Espresso dan Mochaccino";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, Espresso, Latte dan Capuccino";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Espresso, Latte dan Mochaccino";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Latte, Capuccino dan Mochaccino";
            jumlah=4;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())){
            result = "Black Coffee, White Coffee, Espresso, Latte dan Capuccino";
            jumlah=5;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, White Coffee, Espresso, Latte dan Mochaccino";
            jumlah=5;
        }
        if((checkBox1.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, Espresso, Latte, Capuccino dan Mochaccino";
            jumlah=5;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, White Coffee, Latte, Capuccino dan Mochaccino";
            jumlah=5;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox5.isChecked())&&(checkBox6.isChecked())){
            result = "Black Coffee, White Coffes, Espresso, Capuccino dan Mochaccino";
            jumlah=5;
        }
        if((checkBox1.isChecked())&&(checkBox2.isChecked())&&(checkBox3.isChecked())&&(checkBox4.isChecked())&&(checkBox5.isChecked()&&(checkBox6.isChecked()))){
            result = "Black Coffee, White Coffee, Espresso, Latte, Capuccino dan Mochaccino";
            jumlah=6;
        }
        displayHarga(createOrderSummary(harga,result,jumlah));
    }
    private int calculatePrice(){
        return quantity*10000;
    }
    private String createOrderSummary(int harga, String result, int jumlah){
        EditText outputName = (EditText) findViewById(R.id.nama);
        String displayHarga ="\nNama: "+outputName.getText();
        displayHarga = displayHarga +"\nJenis Kopi: "+result;
        displayHarga = displayHarga +"\nQuantity: "+quantity+" Per jenis kopi";
        displayHarga = displayHarga +"\nHarga: "+harga*jumlah;
        displayHarga = displayHarga +"\nTerima Kasih";
        return  displayHarga;
    }
    private void displayQuantity(int numberOfCoffee){
        TextView quantityTextview = (TextView)findViewById(R.id.textviewquantitas);
        quantityTextview.setText(""+numberOfCoffee);
    }
    private void displayHarga(String message){
        TextView orderSummaryTextview = (TextView) findViewById(R.id.tv_orderSummary);
        orderSummaryTextview.setText(message);
    }
}



